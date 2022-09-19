import java.util.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

// 책 628-629-630p
public class ObjectStreamExample {
	public static void main(String[] args) throws Exception{
		writeList(); // List를 파일에 저장
		List<Board> list = readList(); // 파일에 저장된 List읽기
		
		// List의 내용을 모니터에 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for(Board board : list) {
			System.out.println(
			board.getBno() + "\t" + board.getTitle() + "\t" +
			board.getContent() + "\t" + board.getWriter() + "\t" +
			sdf.format(board.getDate())
			);
		}
	}
	
	public static void writeList() throws Exception{
		List<Board> list  = new ArrayList<>(); // List 생성
		
		list.add(new Board(1, "제목1", "내용1", "글쓴이1", new Date())); // list에 Board 객체 저장
		list.add(new Board(2, "제목2", "내용2", "글쓴이2", new Date())); // list에 Board 객체 저장
		list.add(new Board(3, "제목3", "내용3", "글쓴이3", new Date())); // list에 Board 객체 저장
		
		// 객체출력스트림을 이용해서 list출력
		FileOutputStream fos = new FileOutputStream("C:/Temp/Board.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.flush();
		oos.close();
	}
	
	public static List<Board> readList() throws Exception{
		// 객체입력스트림을 이용해서 list읽기
		FileInputStream fis = new FileInputStream("C:/Temp/Board.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Board> list = (List<Board>) ois.readObject();
		return list;
	}
}
