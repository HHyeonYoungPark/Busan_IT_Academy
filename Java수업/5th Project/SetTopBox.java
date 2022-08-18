interface setTopBoxRemote extends RemoteController{
	void disney();
	void netflix();
	void youtubeOn();
	void VODOn();
}

public class SetTopBox implements setTopBoxRemote{

	@Override
	public void youtubeOn() {
		System.out.println("유튜브를 실행합니다");
	}

	@Override
	public void VODOn() {
		System.out.println("VOD를 재생합니다");
	}

	@Override
	public void turnOn() {
		System.out.println("셋톱박스를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("셋톱박스를 끕니다");
	}

	@Override
	public void soundUp() {
		System.out.println("셋톱박스 볼륨을 높입니다");
	}

	@Override
	public void soundDown() {
		System.out.println("셋톱박스 볼륨을 줄입니다");
	}

	@Override
	public void disney() {
		System.out.println("디즈니+를 실행합니다.");
	}

	@Override
	public void netflix() {
		System.out.println("넷플릭스를 실행합니다");
	}
	public static void main(String[] args) {
		SetTopBox stb = new SetTopBox();
		
		stb.turnOn();
		stb.turnOff();
		stb.soundUp();
		stb.soundDown();
		stb.youtubeOn();
		stb.disney();
		stb.netflix();
		stb.VODOn();
	}

}
