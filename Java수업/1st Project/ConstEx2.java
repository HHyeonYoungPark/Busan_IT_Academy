package firstproject;

// 한 java 파일에 클래스가 여러개 있을 수 있다 - 하지만 public은 반드시 하나만 있어야 한다.
class ConEx1{
	int i;
	String str;
	
	ConEx1(){ // (클래스 변수)를 초기화하는 역할.
		// 원래는 값이 없었는데 밑의 내용으로 원래 있던것의 내용을 바꿨다 -> 오버라이딩
		i=10;
		str="반갑";
	}
	
	ConEx1(int k){ // 형태가 똑같을 경우 컴퓨터는 여러개 중 어떤건지 몰라서 에러발생 -> 그래서 형태를 다르게 해야한다.(이름은 같아야함)
		i=20;
		str="안녕";
		
	}
	
	ConEx1(int k, int p){
		i=30;
		str="하이";
	}
	
}


public class ConstEx2 {
	// 생성자(constructor) - 클래스와 이름이 같다(대소문자까지 똑같아야 함)
	// 언제 사용되나? - 생성할때 -> 위치가 정해져 있다 라는 의미 -> new 뒤에 쓴다.
	// 생성할 때 초기값을 주는 역할 (초기화하는 역할)
	// 여러개를 작성해 놓을 수 있고 하나도 없다면 아무 내용없는 빈 생성자를 가상머신이 하나 만들어준다.
	// -> 기본생성자 - 가상머신이 만들어 준거
	// 하나라도 있으면 반드시 그것을 써야한다.
	
	public static void main(String[] args) {
		ConEx1 ce = new ConEx1();
		System.out.println(ce.i);
		System.out.println(ce.str);
		
		// ConEx1(int k) <- 이 생성자를 쓰고 싶다면
		ConEx1 ce2 = new ConEx1(5); // ConEx1(int k) <- k에 5가 들어간다
		// ConEx1(int k) -> ( )부분에 실제 값을 넣어줘야한다 언제? new할떄
		// new 할때는 실제값을 가지고 생성해야 하기때문
		// new는 실제로 만들어지는 과정이다. 그러므로 정의(int k)가 들어가면 안된다.
		// 우리는 정의된 클래스에 실제값을 넣어야 한다.
		
		ConEx1 ce3 = new ConEx1(5,10);
		
	}
}
