package secondproject;

public class RectTest { //사각형을 만들어서 쓰는 클래스
	public static void main(String[] args) {
		Rect r = new Rect(); //사각형이라는 클래스
		
		// 최대크기는 가로1000, 세로1000
		r.setSize(500,700); // 가로100 세로100 크기가 만들어짐
		// 메서드에서 제어를 통해 잘못된 값이 들어가지 않게 막을 수 있다.
		
//		//문제 발생한거
		//r.width=1500;
		//r.height=2000;
		
		Rect r2 = new Rect(500,200);
//		r.printSize(); //가로는 100 세로는 100인 사각형입니다.
	}
}
