package secondproject;

public class MethodEx4 {
	// ��ȯ�Ǵ� Ÿ���� ����Ѵ�. = ����� Ÿ��
	// ��ȯ���� return ���� ���� �ݵ�� Ÿ���� ���� void�� ��� ��
	// ��ȯ���� �ִ� �޼���� ������ ���� �� �ִ�.
	// �̶� ������ Ÿ���� ��ȯ���� Ÿ���̴�.
	int plus(){ //�޼������ �ݵ�� �ҹ��ڷ� ����
		//����
		return 0;
	}
	
	String str(){
		//����
		return "a";
	}
	
	double dr(){
		//����
		return 0.0;
	}
	public static void main(String[] args) {
		MethodEx4 me = new MethodEx4();
		String s = me.str(); // ��ȯ���� �ִ� �޼���->������ ��� ����
							 // s���� return �ڿ� �ִ� ������ ����.
		System.out.println(s);
		System.out.println(me.str());
	}
}
