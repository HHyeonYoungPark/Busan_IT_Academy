
class Constructor{
	int num;
	String str;
	//생성자를 하나만 잘 만들면 된다(재사용). 중복코드가 줄어든다.
	public Constructor() { // () <-괄호 안의 매개변수가 개수,타입,순서가 달라야 한다.
		this("안녕",10); // this는 이 클래스를 의미하고, super는 부모클래스를 의미한다.
	}
	public Constructor(int a) {
		this("안녕",a); // Constructor("안녕",a);
	}
	public Constructor(String str, int num) { // this는 클래스명이라고 생각하면 된다.
		this.num=num; // Constructor.num 의 의미이다.
		this.str=str; // this를 쓰는 이유는 변수명이 같았을 때 명확하게 해주기 위해서 이다.
	}
}


public class ConstructEx {
	public static void main(String[] args) {
		
	}
}
