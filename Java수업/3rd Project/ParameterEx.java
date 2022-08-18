
public class ParameterEx {
	void sum(String y, int ... i) {//배열로 취급하면 된다 
		// 가변인자
		// 여러개 받을 수 있는 변수는 한개만 쓸 수 있다.
		// 다른 탕비의 변수도 같이 받고 싶다면 여러개 받는 변수의 앞에 써야 함.
		// (String s, int ... i) <-이런식으로
		//sum(10) <- int 타입의 매개변수의 개수를 무한대
		int s = 0;
		for(int x=0;x<i.length;x++) {
			s=s+i[x]; //배열로 취급
		}
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		ParameterEx pe = new ParameterEx();
		pe.sum("a",10,20,30,40,50);
		pe.sum("b",20);
	}
}
