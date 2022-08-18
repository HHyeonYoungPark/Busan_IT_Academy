interface USBA{
	String TYPE = "A";
	void speed();
	void printType();
}

interface Samsung extends USBA{ // �������̽��� �������̽����� ����� ����
	void warranty();            // �׳� �ΰ��� �������̽� ���ϱ��� �����ϸ� �ȴ�.
}


public class USBEx implements Samsung{ //Samsung �տ� �־��� USBA�� ������ �ȴ� - ��������ϱ�
	// ����� �ݵ�� �Ѱ��� ���������� ����(implements)�� ������ ������.
	
	@Override
	public void speed() {
		System.out.println("2.0 ���ǵ��Դϴ�");
	
	}
	@Override
	public void printType() {
		System.out.println("AŸ��, �귣�� �Ｚ");
		
	}
	
	@Override
	public void warranty() {
		System.out.println("����Ƽ�� 5����� �Դϴ�");
	}
	
	public static void main(String[] args) {
		USBEx ue = new USBEx();
		ue.speed();
		ue.printType();
		ue.warranty();
		System.out.println(ue.TYPE);
	}
	
}
