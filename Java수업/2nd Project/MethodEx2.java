package secondproject;

public class MethodEx2 { //x는 클래스변수, 메서드도 클래스 소속이다.
	int x; //기본값 0
	void plus() { //void가 붙은 메서드는 메서드 자체로 실행되면서 끝.
		System.out.println(x+10);
	}
	
	void plus(int y) { 
		// 오버로딩 - 매개변수의 개수, 타입, 순서에 따라서 이름이 같지만 다른 메서드
		System.out.println(x+y);
	}
	
	public static void main(String[] args) { //메인은 순서대로 실행된다.
		MethodEx2 me = new MethodEx2();
		me.plus();
		me.x=10;
		me.plus();
		me.plus(100);
	}
	
}
