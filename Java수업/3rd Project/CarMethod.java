
public class CarMethod {
	Engine makeEngine() { 	        // Engine이 반환형이다. ex.int String 과 같은 개념이다.
			Engine e=new Engine();  // 반드시 return이 있어야하고 return 뒤에는
		 				            // 생성된 Engine이 있어야한다.
			return e;		        // class 변수가 아니라면 반드시 변수에 초기값을 줘야한다.
	}
	
	// 메서드를 통해서 객체 생성하기 - 생성된 객체를 이용해서 다른 객체 사용하기
	public static void main(String[] args) {
		CarMethod cm = new CarMethod();
		
		Car c = new Car(cm.makeEngine(), "M4");
				// 현재 상태에서는 makeEngine()으로 가져온 엔진은 만들어지지 않음. e의 값을 null로 했었음,,
		c.printInfo();
		
		///////밑처럼 만들어도 됨
		Engine e = new Engine();
		Car c2 = new Car(e, "M4");
	}
}
