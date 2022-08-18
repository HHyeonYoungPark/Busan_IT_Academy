class Ext6{ // 부모클래스라고 특별한건 아니다.
	int x;
	String str;
	
	void printExt6() {
		System.out.println("Ext6");
	}
}

class ExtendsEx6_2 extends Ext6{}
class ExtendsEx6_3 extends Ext6{}
class ExtendsEx6_4 extends Ext6{}


public class ExtendsEx6 extends Ext6{ // 상속받았다 == ExtendsEx6 + Ext6
									  // ExtendsEx6 안에 Ext6의 내용이 들어가있음 super
	int y;
	int z;
	double[] dd;
	
	void printclass() {
		System.out.println("ExtendsEx6");
	}
}

// 상속받은 내용 전체는 눈에 보이지 않음
// 상속받은 클래스가 들고 있는 메서드와 똑같은 내 메서드 - 오버라이딩 되었다

// 부모클래스  = super class
// 자식 클래스 = sub class