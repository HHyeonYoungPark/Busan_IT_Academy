
class Constructor{
	int num;
	String str;
	//�����ڸ� �ϳ��� �� ����� �ȴ�(����). �ߺ��ڵ尡 �پ���.
	public Constructor() { // () <-��ȣ ���� �Ű������� ����,Ÿ��,������ �޶�� �Ѵ�.
		this("�ȳ�",10); // this�� �� Ŭ������ �ǹ��ϰ�, super�� �θ�Ŭ������ �ǹ��Ѵ�.
	}
	public Constructor(int a) {
		this("�ȳ�",a); // Constructor("�ȳ�",a);
	}
	public Constructor(String str, int num) { // this�� Ŭ�������̶�� �����ϸ� �ȴ�.
		this.num=num; // Constructor.num �� �ǹ��̴�.
		this.str=str; // this�� ���� ������ �������� ������ �� ��Ȯ�ϰ� ���ֱ� ���ؼ� �̴�.
	}
}


public class ConstructEx {
	public static void main(String[] args) {
		
	}
}
