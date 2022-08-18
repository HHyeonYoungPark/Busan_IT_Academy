interface tvInterFace extends MonitorInterface{
	void channelUp();
	void channelDown();
}

public class TVEx implements tvInterFace{
	boolean power;
	
	@Override
	public void screenOn() {		
		System.out.println("»≠∏Èƒ—¡¸");
		power = true;
	}

	@Override
	public void screenOff() {	
		System.out.println("»≠∏È≤®¡¸");
		power = false;
	}

	@Override
	public void brightnessUp() {		
		System.out.println("π‡±‚≥Ù¿”");
	}

	@Override
	public void brightnessDown() {		
		System.out.println("π‡±‚≥∑√„");
	}

	@Override
	public void volumeUp() {	
		System.out.println("∫º∑˝≥Ù¿”");
	}

	@Override
	public void volumeDown() {	
		System.out.println("∫º∑˝≥∑√„");
	}

	@Override
	public void channelUp() {
		System.out.println("√§≥Œ≥Ù¿”");		
	}

	@Override
	public void channelDown() {
		System.out.println("√§≥Œ≥∑√„");
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
