package firstproject;

class Aircon{
	int power;
}


public class EnumEx1 {
	public static void main(String[] args) {
		// ��� = ������ �ʴ� �� - ������ �ݴ븻 - ������ ���� ���� �� �ִ� ����
		// 100 <-���, "�ȳ�" <-���
		// ����� �׻� �����Ǿ� �ִ� ��
		Aircon a = new Aircon();
		final int ON = 1; // 1�� �ǹ��ϴ� �ٸ� �𸣴ϱ� �������� �˱⽱�� �ؼ� ����ϰ� ����
		final int OFF = 0; // final�� ���̸� ����� ������� ����. ON=2; �̰� �ȵ�
		
		a.power=ON; //�ܺηκ��� �Է¹ڴ´ٰ� ����	
		if(a.power==ON) {
			System.out.println("��������");
		}else if(a.power==OFF) {
			System.out.println("��������");
		}
	}
}
