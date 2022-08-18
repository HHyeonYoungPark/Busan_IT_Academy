
public abstract class Phone { // 생성자를 강제화 시킨다.
	public String owner;
	public Phone(String owner) {
		this.owner=owner;
	}
	public void turnOn() {
		System.out.println("폰 전원을 켭니다");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}
}
