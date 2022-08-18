
public class StringTest {
	// 오버로딩 add 메서드 - 메서드 이름이 같을때 괄호 안의 매개변수가 순서,타입,개수를 다르게해서
	//                 여러개의  같은 이름 메서드를 다르게 사용하는 것
	String s;
	boolean t;
	int n;
	
	
	void add(String s) {
		this.s = s;
	}
	void add(boolean t) {
		this.t = t;
	}
	void add(int n) {
		this.n = n;
	}

	void showData() {
		System.out.println(s+" "+t+" "+n);
	}
	
	
	public static void main(String args[]){
	    StringTest st = new StringTest();

	    st.add("안녕");
	    st.add(true);
	    st.add(1);
//	    st.add("방가");
	    st.showData(); // 출력: 안녕 true 1 방가

	}
}
