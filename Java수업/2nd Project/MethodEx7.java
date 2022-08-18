package secondproject;

public class MethodEx7 {
	// 여기에 메서드를 만들어주세요
	
	int plus(int i, int j) {
		return i+j;
		
		// int a = i+j;  <-이런식으로 변수를 한번 더 줘서 해도 됨
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
