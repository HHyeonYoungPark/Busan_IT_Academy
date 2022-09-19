import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class StreamEx1 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// Scanner는 입력을 받는 클래스이다.
		// 입력이 파일로부터 읽어들이기, 키보드로부터 읽어들이기 등등
		
		OutputStream os = new FileOutputStream("test1.txt");
		// 실제로 만들어진것은 FileOutputStream이니까 write했을때 파일로 내보낸다
		os.write(10);
		
		InputStream is = new FileInputStream("test1.txt");
		is.read();
		
		
		
	}
}
