package secondproject;

public class MethodEx3 {
	//메서드 만들어보기
	

	void plus(int x, int y){
		System.out.println(x+y);
	}
	
	void minus(int x, int y){
		System.out.println(x-y);
	}
	
	void muiti(int x, int y){
		System.out.println(x*y);
	}
	
	void divide(int x, int y){
		System.out.println(x/y);
	}
	
	public static void main(String[] args) {
		MethodEx3 me = new MethodEx3();
		me.plus(100,200); //300 +
		me.minus(50,10); //40 -
		me.muiti(20,7); //140 *
		me.divide(30,3); //10 /
	}
}
