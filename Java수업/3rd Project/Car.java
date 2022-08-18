
public class Car {
	Engine engine;
	String type;
	int speed;
	
	public Car() {
		this(new Engine(),"����",250); // Engine �� ������ ���� �޾� �� ������.
									  // �׷��� ���� ���⿡ �����Ѵ�.
	}
	public Car(Engine engine, String type) { // ������ Engine�� �ٸ�������
		this(engine,type,250);	             // new �Ѱ��� �޾ƿ��°��̴�.
	}
	public Car (Engine engine, String type, int speed) {
		this.engine=engine;
		this.type=type;
		this.speed=speed;
	}
	
	public void printCom() { // �޼���� ������ ������ �������� �ڵ带 �����ϱ� ����.
		System.out.println("����");
	}
	
	public void printInfo() {
		printCom(); // ���� �޼���� �ȿ��� �����Ӱ� ��밡���ϴ�.
		engine.printInfo(); // �޼��忡�� �޼��� ȣ���ϱ�
		System.out.println("������ "+type+"�̰� �ִ�ӵ��� "+speed);
	}
	
	public static void main(String[] args) { // �ڵ�м��� �� ������ main���� �ؼ� �� ���󰡺���
		Car c = new Car(); //new �����ϱ� ���� �Ѵ� �����Ѱ��̴�.
		c.printInfo(); // �̹� ���� ������ �� �ִ�.
		
		Car c2 = new Car(new Engine(),"Ʈ��",200);
		c2.printInfo();
		
		Car c3 = new Car(new Engine(3000,"����"),"����",130);
		c3.printInfo();
		
	}
	
}
