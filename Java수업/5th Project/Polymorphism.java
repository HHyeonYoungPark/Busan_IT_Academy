interface Number{ }

class Inte implements Number{ void printIn() {System.out.println("정수");}}
class Floa implements Number{ void printFl() {}}
class Doubl implements Number{ void printDo() {}}

public class Polymorphism {
	
//	void printNumber(Inte i) {}
//	void printNumber(Floa f) {}
//	void printNumber(Doubl d) {}
	void printNumber(Number n) {
		if(n instanceof Inte) { // instanceof를 사용하여 실제타입이 뭔지 알수있다
			Inte i = (Inte) n;
			i.printIn();
		}else {
			System.out.println("정수아님");
		}
		
	}  // 인터페이스로 하나로 묶어서 처리할 수 있다
	// 유사한 매개변수를 한번에 받아서 처리할 수 있다.
	
	public static void main(String[] args) {
		Polymorphism p = new Polymorphism();
//		p.printNumber(new Doubl());
//		p.printNumber(new Floa());
		p.printNumber(new Inte());
	}
}
