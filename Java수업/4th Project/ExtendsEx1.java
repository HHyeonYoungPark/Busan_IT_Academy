class Ext1{
	int x;
	int y;
	public void print() {
		System.out.println(x+":"+y);
	}
}


public class ExtendsEx1 extends Ext1 {
	//내부적으로 Ext1을 가지고있다.
	
	public static void main(String[] args) {
		ExtendsEx1 ee = new ExtendsEx1();
		ee.print(); //부모의 메서드를 사용하고 있다.
		System.out.println(ee.x); //부모의 변수도 내것처럼 사용가능하다.
	}
}
