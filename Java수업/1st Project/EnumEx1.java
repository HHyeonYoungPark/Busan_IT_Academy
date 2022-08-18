package firstproject;

class Aircon{
	int power;
}


public class EnumEx1 {
	public static void main(String[] args) {
		// 상수 = 변하지 않는 수 - 변수의 반대말 - 변수는 값을 넣을 수 있는 공간
		// 100 <-상수, "안녕" <-상수
		// 상수는 항상 고정되어 있는 값
		Aircon a = new Aircon();
		final int ON = 1; // 1은 의미하는 바를 모르니까 변수명을 알기쉽게 해서 사용하게 만듬
		final int OFF = 0; // final을 붙이면 절대로 변경되지 않음. ON=2; 이게 안됨
		
		a.power=ON; //외부로부터 입력박는다고 가정	
		if(a.power==ON) {
			System.out.println("전원켜짐");
		}else if(a.power==OFF) {
			System.out.println("전원꺼짐");
		}
	}
}
