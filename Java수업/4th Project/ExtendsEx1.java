class Ext1{
	int x;
	int y;
	public void print() {
		System.out.println(x+":"+y);
	}
}


public class ExtendsEx1 extends Ext1 {
	//���������� Ext1�� �������ִ�.
	
	public static void main(String[] args) {
		ExtendsEx1 ee = new ExtendsEx1();
		ee.print(); //�θ��� �޼��带 ����ϰ� �ִ�.
		System.out.println(ee.x); //�θ��� ������ ����ó�� ��밡���ϴ�.
	}
}
