package firstproject;

public class ConstEx1 {
	public static void main(String[] args) {
		// 자바에서 String은 특이한 케이스이다.
		// 분명 클래스이지만 new를 하지 않고도 생성되는 특이한 케이스
		// 원래는 클래스가 맞기 때문에 new로도 생성된다.
		
		String str = "안녕하세요"; // String이라서 가능한 문법
		
		String str2 = new String(); // 값없이 초기화 하기
		str2 = "안녕하세요"; // 값이 없으므로 이후에 값을 넣어야 한다.
		
		String str3 = new String("안녕하세요"); // 값을 주면서 초기화 하기
	}
}
