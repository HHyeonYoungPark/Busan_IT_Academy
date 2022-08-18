
public class PhoneExample {
	public static void main(String[] args) {
	// Phone p = new Phone(){};
		// (null등)을 넣으면 문법적으로는 문제없지만 사용할 일이 없는 형태.
	
		SmartPhone sp = new SmartPhone("켬");
		sp.turnOn();
		sp.turnOff();
		sp.internetSearch();
	}
}
