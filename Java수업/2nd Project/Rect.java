package secondproject;

public class Rect { //사각형 클래스
	private int width; //접근제어자
	private int height;
	
	
	Rect(){} //자동으로 만들어지기만 하면 되는 빈 생성자
	//r.setSize(100,100); 이렇게 실행되도록 만들어보자
	
	Rect (int w, int h){ //생성자가
		width=w;
		height=h;
	}
	void setSize(int w, int h) { //받아온 값 w, h를
		if(w>=1000) w=1000;
		
		if(h>=1000) h=1000;  //{}없을땐 하나만 쓸수읶다
		
		
		this.width= w;           // 클래스 변수 width와 height에 넣어주는 매서드
		this.height=h;
	}
	
	void printSize() {
		System.out.println("가로는 "+width+"이고 세로는 "+height);
	}
}
