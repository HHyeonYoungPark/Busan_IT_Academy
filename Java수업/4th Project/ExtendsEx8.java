class Ext8Parents{
	int x;
	public void printEx8Parents() {
		x++;
		System.out.println("�θ�Ŭ����"+x);
	}
}
class Ext8Child extends Ext8Parents{
	int y;
	public void printExt8Child(){
		y++;
		System.out.println("�ڽ�Ŭ����"+y);
	}
}
public class ExtendsEx8 {
	public static void main(String[] args) {
		Ext8Parents p = new Ext8Child();
		p.printEx8Parents();
		// p.printExt8Child(); -> ��� ������ �ڽ�Ŭ������ ���������
							  //  �θ�Ŭ���� Ÿ������ �ٲ���⶧���� �ڽ�Ŭ���� �޼��� ���Ұ�
		
		// Ext8Child c = new Ext8Child(); -> �θ� �����ؼ� �ڽĿ� ���� �� ����
		Ext8Child c = (Ext8Child) p; // ���� �� ��ȯ, �θ� �ڽ����� ����ȯ
									 // �ڽ�Ÿ�� ���� = (�ڽ�Ÿ��) �θ�Ÿ�� 
		
		c.printEx8Parents();
		c.printExt8Child();
	}
}
