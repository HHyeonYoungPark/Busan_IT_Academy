package firstproject;

public class ValiableEx { // Ŭ����
	int k=100; //Ŭ�������� ������ �����ִ�. Ŭ���������� Ŭ������ �Ҽ�{}�̴�. �� ������ �� Ŭ���� ���ο� ��� ��밡���ϴ�.(���������̴�) 
	String str= "���";
	
	public static void main(String[] args) { // �޼���(���) - �� �޼��嵵 Ŭ���� �Ҽ��̴�.
		//System.out.println(k); //��밡���ϴ�. �ٸ� �׳� ����� �ȵ�. -> �޸𸮿� �÷��� ����ؾ� �Ѵ�.
	
		
		int i =10; // �޼��忡 ���Ե� �����̴�. �޼��� ������ {} �����̴�. �� ������ �� �޼��� ���ο����� ��밡���ϴ�.
		int j =10;
		System.out.println(i==j);
		
		String str1= "�ȳ�";
		String str2= new String("�ȳ�"); // new -> ���� �޸𸮿� ������,,
		System.out.println(str1+":"+str2);
		System.out.println(str1==str2);
		
		String str3=str2; //str2�� ���� str3�� ������ �ƴ�!! �ּҸ� ������ ��� ������ true
		System.out.println(str2==str3);
		
		String str4="�ȳ�"; // String �� �̷���
		System.out.println(str1==str4);
		
		//== ���ú�   ,    .equals() ����
		System.out.println(str1.equals(str2)); // ���۷��� Ÿ�� ��
		//System.out.println(i.equals(j)); // �⺻ Ÿ���� �񱳰� �ȵ�
	}
}