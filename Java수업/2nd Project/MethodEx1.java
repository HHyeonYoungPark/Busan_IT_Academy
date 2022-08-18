package secondproject;

public class MethodEx1 {
	
	public MethodEx1() { // 이름이 클래스와 대소문자까지 같다 = 생성자 constructor
	// 접근제어자 -> public, private, default,protected
	// 누가 이 생성자, 클래스, 메서드 등 외부로부터 사용 가능한 것들에 대한 접근 설정
	// public=공용, private=나만, default=(안쓰면 default) 같은 폴더안에서
	// protected => 상속 받은 경우
	}
	
	//메서드
	// [접근제어자] [반환형] 메서드 이름([매개변수]){
	//		반환형이 void가 아니라면 return이 필수.
	// }
	// 메세드 이름은 마음대로 지으면 된다.
	// 다만 묵시적으로 값을 외부로 받아와서 내 정보(변수)를 바꾸는 기능이라면 set으로 시작
	// 내 정보를 외부로 보내야(return) 하는 메서드일 경우 get으로 시작
	
	// 메서드와 생성자의 차이점
	// 생성자도 일종의 메서드이다. => 형태가 유사하다. 메서드에는 반환형이 있지만 생성자는 없다.
	
	public void plus() { // void가 없으면 생성자와 형태가 같아짐. => 에러발생(생성자이름=클래스)
		
	}
	
}
