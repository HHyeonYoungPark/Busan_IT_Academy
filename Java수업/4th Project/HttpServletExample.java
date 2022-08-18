//책 367p
abstract class HttpServlet{
	public abstract void service();
}
class LoginServlet extends HttpServlet {

	@Override
	public void service() {
		System.out.println("로그인합니다.");

	}

}

class FileDownloadServlet extends HttpServlet {

	@Override
	public void service() {
		System.out.println("파일을 다운로드 합니다.");

	}

}

public class HttpServletExample {
	public static void main(String[] args) {
		method(new LoginServlet());// 로그인 출력
		method(new FileDownloadServlet());// 파일다운로드 출력
	}
	// LoginServlet, FileDownloadServlet
	// 둘다 HttpServlet 타입이다.
	
	
	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}




