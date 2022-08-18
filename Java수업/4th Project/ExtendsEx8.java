class Ext8Parents{
	int x;
	public void printEx8Parents() {
		x++;
		System.out.println("부모클래스"+x);
	}
}
class Ext8Child extends Ext8Parents{
	int y;
	public void printExt8Child(){
		y++;
		System.out.println("자식클래스"+y);
	}
}
public class ExtendsEx8 {
	public static void main(String[] args) {
		Ext8Parents p = new Ext8Child();
		p.printEx8Parents();
		// p.printExt8Child(); -> 비록 만들기는 자식클래스를 만들었지만
							  //  부모클래스 타입으로 바뀌었기때문에 자식클래스 메서드 사용불가
		
		// Ext8Child c = new Ext8Child(); -> 부모를 생성해서 자식에 넣을 수 없다
		Ext8Child c = (Ext8Child) p; // 강제 형 변환, 부모를 자식으로 형변환
									 // 자식타입 변수 = (자식타입) 부모타입 
		
		c.printEx8Parents();
		c.printExt8Child();
	}
}
