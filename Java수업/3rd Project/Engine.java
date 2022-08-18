
public class Engine {
	int cc; // 클래스변수, 필드, 전역변수 라고도 한다.
	String oil;
	
	public Engine() {
		this(2000,"가솔린"); // 생성자 재사용
	}
	public Engine(int cc, String oil) {
		this.cc=cc; //클래스 변수 cc에 지역변수 cc를 넣어준다.
		this.oil=oil;
	}
	public void printInfo() {
		System.out.println(cc+"cc엔진이며 "+oil+"을 사용합니다.");
	}
}
