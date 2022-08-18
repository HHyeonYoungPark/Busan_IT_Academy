// 선생님이 만든거
public class TVRemote implements RemoteController{
	int vol;
	int ch;
	boolean power;
	
	@Override
	public void turnOn() {
		//이미 인터페이스를 구현함에 제조사가 실제로 키는 기능을 만들어 둠.
		System.out.println("전원켜짐");
		power = true;
	}
	@Override
	public void turnOff() {
		power = false;
	}
	@Override
	public void soundUp() {
		vol++;
		
	}
	@Override
	public void soundDown() {
		vol--;
		
	}
	void printVol() {
		System.out.println(vol);
	}
	
}
