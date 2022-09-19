import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ChatServer2 {
	public static void main(String[] args) {
		try {
			HashMap<String, PrintWriter> hm = new HashMap<>();
			// 키: 아이디 , 값: outputstream
		
			InetAddress inet = InetAddress.getLocalHost();
			System.out.println("내 실제 아이피 : " + inet.getHostAddress());
			// 내아이피 출력
			
			ServerSocket server = new ServerSocket(10001); // 서버만들기
			System.out.println("서버열림. 접속을 기다립니다.");
			while(true) { // 연결 대기
				Socket socket = server.accept(); // 클라이언트가 들어오는것을 잡음
				// 클라이언트가 무기한 접속할때까지 대기함
				
				System.out.println("클라이언트가 접속되었습니다.");
				// 서버에서 접속한 모든 클라이언트를 담아둔다
				// 담기위한 콜렉션이 필요(hashmap). 콜렉션에 클라이언트 연결 담아둠
				
				// 채팅 쓰레드 실행 - 1개의 클라이언트에 1개의 쓰레드	
				// 클라이언트가 접속하면 그 클라이언트 전용 쓰레드 만들고 실행
				ChatThread2 ct = new ChatThread2(socket, hm); //Thread 전 작업
				ct.start();
	
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

/////////////////////메인끝////////////////////////////////////////

class ChatThread2 extends Thread{ //쓰레드를 상속, 구현, 메서드로
	// 클라이언트마다 생성됨, 클라이언트 개수마다 생성됨
	Socket socket;
	HashMap<String, PrintWriter> hm;
	
	// 쓰레드에서 반드시 해야할 일 *입력<=>출력
	BufferedReader br; // 클라이언트가 넘겨주는 내용을 읽기위해 필요
	String id; // 클라이언트가 넘겨주면 받아서 넣음
	
	public ChatThread2(Socket socket, HashMap<String, PrintWriter> hm) {
		// 메인에서 받아온 값을 필드(전역변수)로 옮겨줌
		this.socket = socket;
		this.hm = hm;
		try {
			// PrintWriter,Reader 를 쓰기위해..
			OutputStream os = socket.getOutputStream();
			// 클라이언트로 넘겨줄 데이터가 갈 stream - 가장 기본
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);
			// println을 쓸 수 있는 보조 스트림 => 우리는 이것을 통해서 클라이언트로 값을 보냄
			
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			// 한줄씩 읽는 readLine() 메서드를 가지는 보조 스트림
			// 이것을 통해서 클라이언트에서 들어오는 값을 읽어올 수 있다.
			
			// 클라이언트 접속시 무조건 id를 받으므로 if로 br.readLine()을 물어볼 필요없음
			id = br.readLine();
			System.out.println(id+"님께서 접속하셨습니다.");
			
			hm.put(id, pw); // 아이디, 출력스트림
			
			broadcast("[알림] " + id+"님께서 접속하셨습니다."); // 전체방송(채팅방에 접속한 클라이언트 알려줌)
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} // 생성자 => Thread run 하기 전까지의 작업
	
	
	@Override
	public void run() {
	
		try {
			String line = null;
			while((line=br.readLine())!=null){
				System.out.println(id+":"+line); // 서버에 출력
				
				// 넘어온 글씨의 내용의 첫번째가 "/quit "로 시작한다면
				if(line.indexOf("/quit ")==0) {
					broadcast("[알림] "+id+ "님이 채팅방을 나갔습니다.");
					hm.remove(id); // 종료가 되므로 hahmap에서도 지워줌
					break;
				}else if(line.indexOf("/to ")==0) { //귓속말 -> /to 아이디
					String wid = line.split(" ")[1];
					hm.get(wid).println("["+id+"]님의 귓속말: " + line);
					
				}else {
					// 클라이언트에게 다시 출력하기
					broadcast(id+":"+line);
				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void broadcast(String msg) {
		// 접속한 모든 pw를 이용하여 전송 => hashmap이 다 들고 있음(hm)
		Set<String> keys = hm.keySet();
		Iterator<String> keyIter = keys.iterator();
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			PrintWriter bpw = hm.get(key);
			bpw.println(msg);
			bpw.flush();
		}
	}
	
}