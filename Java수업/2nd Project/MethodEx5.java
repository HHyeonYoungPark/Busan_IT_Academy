package secondproject;

public class MethodEx5 {
	public static void main(String[] args) {
		String str = "aabcdefg";
		String str2 = new String("aabcdefg");
		//���� ���� ����.
		
		char c = str.charAt(0); //���������� ������ ����
		//char c2 = str.charAt(100); //api�� ���鼭 ������ �д´ٸ�
		                           // �� �޼��尡 �ϴ���, �Ű�����(100)�� �ǹ̸� �� �� �ִ�.
		
		int i = str.indexOf("d"); //d�� ������� �ִ°�?
		
		System.out.println(c);
		//System.out.println(c2);
	}
}
