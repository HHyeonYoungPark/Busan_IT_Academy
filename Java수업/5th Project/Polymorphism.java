interface Number{ }

class Inte implements Number{ void printIn() {System.out.println("����");}}
class Floa implements Number{ void printFl() {}}
class Doubl implements Number{ void printDo() {}}

public class Polymorphism {
	
//	void printNumber(Inte i) {}
//	void printNumber(Floa f) {}
//	void printNumber(Doubl d) {}
	void printNumber(Number n) {
		if(n instanceof Inte) { // instanceof�� ����Ͽ� ����Ÿ���� ���� �˼��ִ�
			Inte i = (Inte) n;
			i.printIn();
		}else {
			System.out.println("�����ƴ�");
		}
		
	}  // �������̽��� �ϳ��� ��� ó���� �� �ִ�
	// ������ �Ű������� �ѹ��� �޾Ƽ� ó���� �� �ִ�.
	
	public static void main(String[] args) {
		Polymorphism p = new Polymorphism();
//		p.printNumber(new Doubl());
//		p.printNumber(new Floa());
		p.printNumber(new Inte());
	}
}
