class Ext5{ //class �տ� final�� ������ ���ó�� ���̻� ������ �Ұ����ϴ� = ��ӺҰ�
	public void printExt5() { // ��ȯ�� �տ� final���̸� �������̵� �Ұ�
		System.out.println("�̰��� Ext5");
	}
}


public class ExtendsEx5 extends Ext5{
	
	@Override  // ���̸� �������̵�(�ؿ� ������ Ʋ���� ���ٷ� Ʋ���κ� �˷���)
	public void printExt5() { //�������̵� - �θ��� �޼��� ������(���� �켱����)
		System.out.println("ExtendsEx5");
	}
	
	public void printSuper() {
		super.printExt5();
	}
	
	public static void main(String[] args) {
		// �������̵� �� �޼����� ��� main���� ��밡��������
		// �θ� �޼���� �Ϲ����� ������� main���� ����� �Ұ���
		final int i = 10;
		
		ExtendsEx5 ee5 = new ExtendsEx5();
		ee5.printExt5();
		ee5.printSuper();
	}
}
