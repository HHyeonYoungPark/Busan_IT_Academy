import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionEx {
	
	// 예외처리는 직접처리 - 현재 그 메서드에서 예외를 처리해 버리므로 다른곳에서는 신경쓸 필요x
	// 항상 발생하는 예외일 경우 코드가 지저분해지고 길어지는 문제가 있음
	// 굳이 처리할 필요없는 예외 ex) FileNotFoundException
	// try{ 
	//		예외가 발생할 수 있는 부분
	//	   } catch(발생할 예외){ // IO input+output 예외
	//		예외 발생시 처리 할 코드  - 가장 많이 처리하는 코드는 방생한 예외 콘솔에 출력
	//		e.printStackTrack();
	//	   }
	
	// 가상머신에게 대신 처리를 맡김 - 예외를 던져버림. 최종적으로 사용하는 코드에게
	// 예외를 던진다는 이야기는 실제 사용하는 코드에서 다시 예외처리를 해야 한다.
		   
	void makeFile(String name, String data) throws IOException { //파일명, 내용 받아서 파일 만들기
		File f = new File(name); // 파일객체 만들기- 파일이 직접 생성되지 않음
		FileWriter fw = new FileWriter(f); // 파일에 내용을 추가, 새로 작성
		PrintWriter pw = new PrintWriter(fw); // println을 사용 - 줄단위 입력
		pw.println(data); // 실제 내용 입력
		pw.close(); // 사용후 파일 닫기
	}
	
	// 최종적으로 예외는 가상머신이 처리한다고 생각하면 된다
	public static void main(String[] args) throws IOException  {
		ExceptionEx ee = new ExceptionEx();
		ee.makeFile("text.txt", "값이 드가나요?");
	}
}
