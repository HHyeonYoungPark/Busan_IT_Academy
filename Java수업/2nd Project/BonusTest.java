package secondproject;

class Bonus{
	int income;
	double bonus;
	
	
	void setIncome(int i) {
		income = i;
	}
	
	void setBonus(int b) {
		bonus = b*0.01;
	}
	
	void calculate() { // �޾ƿ� i,b �� ���⼭ ����ؾ� �Ѵ�.
		System.out.println("������ "+income+", ���ʽ���"+(bonus*100)+"%, "+(income*bonus)+"�Դϴ�.");
	}
}


public class BonusTest {
	public static void main(String[] args) {
		// 3�� �����
		// ���ʽ��� ���������� �Է�(10) <- 10��
		// ���ʽ� �����ϴ� �޼��� 1��
			
		// ���� �����ϴ� �޼��� 1��(5000)
		
		// ����, �������� ���ʽ� ����ϴ� �޼���() <- ��ȣ �ȿ� ������ �ʿ����
		
		Bonus m = new Bonus();
//		System.out.println("������ �Է�");
		m.setIncome(6000); // ������ �Է�
//		System.out.println("���ʽ� %�� �Է�");
		m.setBonus(10); // ���ʽ� �ۼ�Ʈ�� �Է�
		
//		System.out.println("�������");
		m.calculate(); // ���� �Է��� ������ ���� ������
	}
}
