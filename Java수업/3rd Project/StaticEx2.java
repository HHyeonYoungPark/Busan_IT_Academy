
public class StaticEx2 { // staric�� new ���ص� �� �� �ִ�.
	public static void main(String[] args) {
		
		// ������ �ʴ� ���� ���� ������ �޼��带 �ַ� ����ó���Ͽ� ����Ѵ�.
		System.out.println(Math.PI);
		System.out.println(Math.random()); // Math�� ������ ���� ������ ��밡���ϴ�.
		
		System.out.println(Static.i); // �������� Ŭ������. ������ ���ٰ���
		
		Static s = new Static();
		System.out.println(s.j);
		
	}
}
