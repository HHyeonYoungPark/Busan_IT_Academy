
public class CarMethod {
	Engine makeEngine() { 	        // Engine�� ��ȯ���̴�. ex.int String �� ���� �����̴�.
			Engine e=new Engine();  // �ݵ�� return�� �־���ϰ� return �ڿ���
		 				            // ������ Engine�� �־���Ѵ�.
			return e;		        // class ������ �ƴ϶�� �ݵ�� ������ �ʱⰪ�� ����Ѵ�.
	}
	
	// �޼��带 ���ؼ� ��ü �����ϱ� - ������ ��ü�� �̿��ؼ� �ٸ� ��ü ����ϱ�
	public static void main(String[] args) {
		CarMethod cm = new CarMethod();
		
		Car c = new Car(cm.makeEngine(), "M4");
				// ���� ���¿����� makeEngine()���� ������ ������ ��������� ����. e�� ���� null�� �߾���,,
		c.printInfo();
		
		///////��ó�� ���� ��
		Engine e = new Engine();
		Car c2 = new Car(e, "M4");
	}
}
