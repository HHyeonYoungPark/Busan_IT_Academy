package secondproject;

public class MethodEx7 {
	// ���⿡ �޼��带 ������ּ���
	
	int plus(int i, int j) {
		return i+j;
		
		// int a = i+j;  <-�̷������� ������ �ѹ� �� �༭ �ص� ��
		//return a;
	}
	
	int minus(int i, int j) {
		return i-j;
	}
	
	int multi(int i, int j) {
		return i*j;
	}
	
	double divide(double i, double j) {
		return i/j;
	}
	
	public static void main(String[] args) {
		MethodEx7 me = new MethodEx7();
		System.out.println(me.plus(100,50)); //150
		System.out.println(me.minus(100,50)); //50
		System.out.println(me.multi(100,50)); //5000
		System.out.println(me.divide(100,30)); //3.3333333333....
		
	}
}
