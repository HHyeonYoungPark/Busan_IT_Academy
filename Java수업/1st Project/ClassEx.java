package firstproject;

public class ClassEx {
	int k; // Ŭ���� ����-���������� ���� �ȳ����� �˾Ƽ� �ʱ�ȭ�ȴ�.
	double d;
	boolean b;
	String str;
	
	//Ŭ���� �Ҽ� ������ �׳� ����� �ȵȴ�. �ݵ�� �޸𸮿� �÷��� ����ؾ� �Ѵ�. ->�޸𸮿� new ���� �÷���!
    // new �޸𸮿� ������ ����϶�.
	
	public static void main(String[] args) {
		
		//System.out.println(str);
		
		String str="���"; //�޼��� �Ҽ� �����̴� �׳ɻ�밡��
		// ���ڿ�Ÿ�� ����= ���ڿ�
		// �� Ÿ�Կ� �´� ���� ������ �ִ´� ��� ���̴�.
		
		//ClassEx ce = ClassEx Ÿ���� ������ �ȴ�.
		//int x = ����
		//System.out.println(k); -> ���� �޸𸮿� �ö� ���� ���� ���� k 
		
		//ClassEx ce = new ClassEx(); // ce���� ������� (�޸𸮿� �ö� �ִ�) ClassEx�� ����ִ�.
		//ce.k=100;
		//System.out.println(ce.k); // �޸𸮿� �÷��� �ִ� ���� k = Ŭ���� �Ҽ� ���� �϶��� �̷��� ���
		//Ŭ��������- ���������� ���Ǵ� �׳� �ϸ� ������ ����� �ݵ�� new ���Ŀ� ��밡��
		
		//ClassEx ce2 = new ClassEx();
		//ce2.k=200;
		//System.out.println(ce2.k);
		
		//System.out.println(ce.k); //���ٸ� 200, Ʋ���ٸ� 100�� ���ð��̴�
		//System.out.println(ce2.k);
		
		ClassEx ce3 = new ClassEx();
		System.out.println(ce3.k); //����
		System.out.println(ce3.d); //�Ǽ�
		System.out.println(ce3.b); //�Ҹ���
		System.out.println(ce3.str); //���ڿ�
		
		//System.out.println(ce3.str.equals(nul)); //null�� ���� �ƴ϶� �񱳰� �Ұ�����
		System.out.println(ce3.str==null);
		
	}
}
