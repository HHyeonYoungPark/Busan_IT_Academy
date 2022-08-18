package secondproject;

class Timetables{
	void ttable(int i) {
		for(int z=1;z<=9;z++) {
			System.out.println(i+"x"+z+"="+(i*z));
		}
	}
}

public class TtTest{ //클래스가 2개일 경우 main이 있는 클래스 이름으로 해야 함
	public static void main(String[] args) {
		//클래스가 2개일 경우 파일명=클래스명 의 public을 붙인다.
		
		Timetables tt = new Timetables();
			tt.ttable(2); //2의 구구단 출력
			tt.ttable(3); //3단

	}
}