
public class Car {
	Engine engine;
	String type;
	int speed;
	
	public Car() {
		this(new Engine(),"세단",250); // Engine 은 생성된 값을 받아 올 수없다.
									  // 그래서 직접 여기에 생성한다.
	}
	public Car(Engine engine, String type) { // 여기의 Engine은 다른곳에서
		this(engine,type,250);	             // new 한것을 받아오는것이다.
	}
	public Car (Engine engine, String type, int speed) {
		this.engine=engine;
		this.type=type;
		this.speed=speed;
	}
	
	public void printCom() { // 메서드로 여러개 끊으면 좋은점은 코드를 정리하기 쉽다.
		System.out.println("현대");
	}
	
	public void printInfo() {
		printCom(); // 내부 메서드는 안에서 자유롭게 사용가능하다.
		engine.printInfo(); // 메서드에서 메서드 호출하기
		System.out.println("차종은 "+type+"이고 최대속도는 "+speed);
	}
	
	public static void main(String[] args) { // 코드분석할 때 시작을 main부터 해서 쭉 따라가보기
		Car c = new Car(); //new 했으니까 차를 한대 생산한것이다.
		c.printInfo(); // 이미 많은 정보가 들어가 있다.
		
		Car c2 = new Car(new Engine(),"트럭",200);
		c2.printInfo();
		
		Car c3 = new Car(new Engine(3000,"디젤"),"버스",130);
		c3.printInfo();
		
	}
	
}
