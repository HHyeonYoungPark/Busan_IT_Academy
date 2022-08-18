
class ConEx2{
	int i;
	String s;
	
	ConEx2() {// 기본생성자가 필수는 아니다.
		i=10;
		s="안녕";
	}
	ConEx2(int k) {// 변수명은 틀리던 말던 상관이 없다. 타입과 개수, 순서로 구분한다.
		i=k;
		s="안녕";
	}	
	ConEx2(String str) {// 생성할때 new 뒤에 생성자 명()괄호에 넣는거에 따라서 골라실행
		i=10;
		s=str;
	}
	ConEx2(int k,String str){
		i=k;
		s=str;
	}//숫자,문자
	ConEx2(String str,int k){
		System.out.println("문자 숫자");
		i=k;
		s=str;
	}//문자,숫자
}
public class ConEx3 {
	public static void main(String[] args) {
		ConEx2 c = new ConEx2();
		System.out.println(c.i+" "+c.s);
		
		ConEx2 c2 = new ConEx2(100);
		System.out.println(c2.i+" "+c2.s);
		
		ConEx2 c3 = new ConEx2("헬로헬로");
		System.out.println(c3.i+" "+c3.s);
		
		ConEx2 c4 = new ConEx2(1000,"올라올라");
		System.out.println(c4.i+" "+c4.s);
		
		ConEx2 c5 = new ConEx2("반갑구여",500);
		System.out.println(c5.i+" "+c5.s);
	}
}



