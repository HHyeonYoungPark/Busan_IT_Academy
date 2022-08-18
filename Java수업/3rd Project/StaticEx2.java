
public class StaticEx2 { // staric은 new 안해도 쓸 수 있다.
	public static void main(String[] args) {
		
		// 변하지 않는 자주 쓰는 변수나 메서드를 주로 정적처리하여 사용한다.
		System.out.println(Math.PI);
		System.out.println(Math.random()); // Math를 생성한 적이 없지만 사용가능하다.
		
		System.out.println(Static.i); // 정적변수 클래스명. 변수로 접근가능
		
		Static s = new Static();
		System.out.println(s.j);
		
	}
}
