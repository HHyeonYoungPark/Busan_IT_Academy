interface setTopBoxRemote extends RemoteController{
	void disney();
	void netflix();
	void youtubeOn();
	void VODOn();
}

public class SetTopBox implements setTopBoxRemote{

	@Override
	public void youtubeOn() {
		System.out.println("��Ʃ�긦 �����մϴ�");
	}

	@Override
	public void VODOn() {
		System.out.println("VOD�� ����մϴ�");
	}

	@Override
	public void turnOn() {
		System.out.println("����ڽ��� �մϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("����ڽ��� ���ϴ�");
	}

	@Override
	public void soundUp() {
		System.out.println("����ڽ� ������ ���Դϴ�");
	}

	@Override
	public void soundDown() {
		System.out.println("����ڽ� ������ ���Դϴ�");
	}

	@Override
	public void disney() {
		System.out.println("�����+�� �����մϴ�.");
	}

	@Override
	public void netflix() {
		System.out.println("���ø����� �����մϴ�");
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
