
public class SmartPhone extends Phone{ // 부모 생성자를 무조건 써야함
	public SmartPhone(String owner) {
		super(owner); //부모클래스를 무조건 생성해야 함
	}
	public void internetSearch() {
		System.out.println("인터넷을 검색합니다");
	}
}
