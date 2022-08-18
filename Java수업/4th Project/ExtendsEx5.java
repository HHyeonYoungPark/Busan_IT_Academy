class Ext5{ //class 앞에 final이 붙으면 상수처럼 더이상 변경이 불가능하다 = 상속불가
	public void printExt5() { // 반환형 앞에 final붙이면 오버라이드 불가
		System.out.println("이것은 Ext5");
	}
}


public class ExtendsEx5 extends Ext5{
	
	@Override  // 붙이면 오버라이드(밑에 내용이 틀리면 밑줄로 틀린부분 알려줌)
	public void printExt5() { //오버라이딩 - 부모의 메서드 재정의(내꺼 우선적용)
		System.out.println("ExtendsEx5");
	}
	
	public void printSuper() {
		super.printExt5();
	}
	
	public static void main(String[] args) {
		// 오버라이드 된 메서드의 경우 main에서 사용가능하지만
		// 부모 메서드는 일반적인 방식으로 main에서 사용이 불가능
		final int i = 10;
		
		ExtendsEx5 ee5 = new ExtendsEx5();
		ee5.printExt5();
		ee5.printSuper();
	}
}
