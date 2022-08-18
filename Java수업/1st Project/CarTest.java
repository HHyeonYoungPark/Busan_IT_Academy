package firstproject;

public class CarTest {
	public static void main(String[] args) {
		
		Car c1 = new Car(); //같은 폴더(패키지)에 있으니까 그냥 가져다 쓸수있다.
		c1.WheelCount=4;
		c1.color="red";		
		c1.name="머스탱";
		
		Car c2 = new Car();
		c2.WheelCount=8;
		c2.color="국방색";		
		c2.name="육공트럭";

		
		//자바에서 우리가 작성한 클래스는 생성을 여러개할 수 있는 일종의 틀이다.
		//new를 통해서 우리는 클래스를 사용할 수 있는 상태로 만든다.
		
		Car[] cars = new Car[3]; //배열은 공간할당을 하기 위해서 new를 사용한다. new는 무조건 메모리와 관련이 있다.
		//문제 : 차량 3개를 생성해서 값을 넣고 출력하세요
		
		Car cs1; //int에는 숫자 float에는 실수, String에는 문자열. Car에는 Car; new+생성자 -> 생성자는 클래스명();
		Car cs2=null; // 메서드 소속 변수는 반드시 초기화 해줘야 한다. 
		Car cs3;
		
		cs1 = new Car(); //1. 메모리에 올리기
		cs1.name ="제네시스"; //2. 메모리에 올라가 있는 Car에 이름 cs1이고 그안에 있는 변수 name에 제네시스를 넣었다

		//System.out.println(cs2.name); new를 해줘야지만 주소값을 가질 수 있다.
		
		int i; //변수 정의만 먼저 - main의 경우는 일반변수 안해도 됨.
		i=10;
		
		int x[] = new int[10];
		//변수를 10개 만들었다. -> 값은 아직 안넣었다.
		x[0]=1;
		
		Car cc[] = new Car[10];
		cc[0]=new Car();
		
		
		
		
		
		
	}
}
