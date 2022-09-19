// 책 599p

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test1.db"); 
		
		while(true) {
			int data = is.read(); // 1byte씩 읽기
			if(data == -1) break; // 파일에 도달했을때
			System.out.println(data);
		}
		is.close();
		
	}
}
