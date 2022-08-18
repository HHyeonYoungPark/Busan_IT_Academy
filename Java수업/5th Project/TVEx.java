interface tvInterFace extends MonitorInterface{
	void channelUp();
	void channelDown();
}

public class TVEx implements tvInterFace{
	boolean power;
	
	@Override
	public void screenOn() {		
		System.out.println("ȭ������");
		power = true;
	}

	@Override
	public void screenOff() {	
		System.out.println("ȭ�鲨��");
		power = false;
	}

	@Override
	public void brightnessUp() {		
		System.out.println("������");
	}

	@Override
	public void brightnessDown() {		
		System.out.println("��⳷��");
	}

	@Override
	public void volumeUp() {	
		System.out.println("��������");
	}

	@Override
	public void volumeDown() {	
		System.out.println("��������");
	}

	@Override
	public void channelUp() {
		System.out.println("ä�γ���");		
	}

	@Override
	public void channelDown() {
		System.out.println("ä�γ���");
	}
	
	
	public static void main(String[] args) {
		TVEx tvex = new TVEx();
		tvex.screenOn();
		tvex.screenOff();
		tvex.brightnessUp();
		tvex.brightnessDown();
		tvex.volumeUp();
		tvex.volumeDown();
		tvex.channelUp();
		tvex.channelDown();
	}

}
