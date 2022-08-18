
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
		System.out.println("TV�� �մϴ�");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");
		
	}

	@Override
	public void soundUp() {
		System.out.println("TV ������ ���Դϴ�");
		
	}

	@Override
	public void soundDown() {
		System.out.println("TV ������ ���Դϴ�");
		
	}
	@Override
	public void channelUp() {
		System.out.println("ä���� �ø��ϴ�");
	}

	@Override
	public void channelDown() {
		System.out.println("ä���� �����ϴ�");
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
// ������ �������̽��� �̿��Ͽ�
// Ƽ�񸮸���, ������������, ��ž�ڽ������� �����
// ������ Ư���� �޼��� �߰��ϱ�
