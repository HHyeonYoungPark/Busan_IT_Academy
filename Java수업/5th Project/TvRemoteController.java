
interface RemoteController {
	void turnOn();
	void turnOff();
	void soundUp();
	void soundDown();
}

interface tvRemot extends RemoteController{
	void channelUp();
	void channelDown();
}

public class TvRemoteController implements tvRemot{

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
		
	}

	@Override
	public void soundUp() {
		System.out.println("TV 볼륨을 높입니다");
		
	}

	@Override
	public void soundDown() {
		System.out.println("TV 볼륨을 줄입니다");
		
	}
	@Override
	public void channelUp() {
		System.out.println("채널을 올립니다");
	}

	@Override
	public void channelDown() {
		System.out.println("채널을 내립니다");
	}	
	public static void main(String[] args) {
		TvRemoteController tvrc = new TvRemoteController();
		tvrc.turnOn();
		tvrc.turnOff();
		tvrc.soundUp();
		tvrc.soundDown();
		tvrc.channelUp();
		tvrc.channelDown();
	}

}
// 상위의 인터페이스를 이용하여
// 티비리모컨, 에어컨리모컨, 셋탑박스리모컨 만들기
// 각각의 특이한 메서드 추가하기
