import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClientGUI1 extends JFrame implements ActionListener{
	
	Socket socket;
	BufferedReader br;
	PrintWriter pw;
	Thread t1;	
	
	JTextField tf;
	JTextArea ta;
	JButton btn;
	JButton btn2;
	
	JTextField tfid;
	JTextField tfip;
	JLabel lblid;
	JLabel lblip;
	
	
	public ChatClientGUI1(){
		
		try {
			InetAddress inet = InetAddress.getLocalHost();
			String title = inet.getHostAddress();
			this.setTitle(title);		
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.setSize(400, 600);
		
		tf = new JTextField(25);
		btn = new JButton("전송");
		btn.addActionListener(this);
		ta = new JTextArea();
		JScrollPane sp = new JScrollPane(ta);
		JPanel pnl = new JPanel();
		pnl.add(tf);
		pnl.add(btn);
		
		JPanel pnl2 = new JPanel();
		lblid = new JLabel("아이디");
		lblip = new JLabel("아이피");
		tfip = new JTextField(10);
		tfid = new JTextField(10);
		btn2 = new JButton("연결");
		btn2.addActionListener(this);
		pnl2.add(lblip);
		pnl2.add(tfip);
		pnl2.add(lblid);
		pnl2.add(tfid);
		pnl2.add(btn2);
		
		this.add(pnl2,"North");
		this.add(sp);
		this.add(pnl,"South");
		this.setVisible(true);
		
		//this.setDefaultCloseOperation(3);
		// 기본 닫기는 쓰레드를 안전하게 종료하지 않으므로 종료는 되지만 예외가 발생한다.
		this.addWindowListener(new WindowListener() {			
			@Override
			public void windowOpened(WindowEvent e) {}			
			@Override
			public void windowIconified(WindowEvent e) {}
			@Override
			public void windowDeiconified(WindowEvent e) {}
			@Override
			public void windowDeactivated(WindowEvent e) {}			
			@Override
			public void windowClosing(WindowEvent e) {
				if(pw != null) {
					pw.println("/quit ");
					pw.flush();
					System.exit(0);
				}else {
					System.exit(0);
				}
			}			
			@Override
			public void windowClosed(WindowEvent e) {}			
			@Override
			public void windowActivated(WindowEvent e) {}
		});
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn2) {// 연결
			connection();
		}else {// 전송
			sendMsg(tf.getText());
		}
		
	}
	
	void connection() {// 연결
		
		String ip = tfip.getText();
		String id = tfid.getText();
		try {
			socket = new Socket(ip,10001);
			// 연결끝			
			
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}//ip, port
		
		try {
			// 연결통로만들기 input / output
			br = new BufferedReader(
					new InputStreamReader(
							socket.getInputStream()));
			pw = new PrintWriter(
					new OutputStreamWriter(
							socket.getOutputStream()));
			
			pw.println(tfid.getText());// 서버에 아이디 전송
			pw.flush();
			
			clientThread2();// 쓰레드 실행
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void clientThread2() {
		t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					// 서버로 부터 들어오는 내용 읽어서 출력하기
					String line = null;
					while((line=br.readLine())!=null) {
						ta.append(line+"\n");
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
//					broadcast("[알림] "+id+ "님이 채팅방을 나갔습니다.");
//					System.out.println(4444);
				}				
			}
		});
		t1.start();
		// 쓰레드 끝
	}
	
	public void sendMsg(String str) {
		pw.println(str);
		pw.flush();
	}
	
	public static void main(String[] args) {
		new ChatClientGUI1();
	}

}

