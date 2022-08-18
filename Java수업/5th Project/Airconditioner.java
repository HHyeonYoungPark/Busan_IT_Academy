interface AirconditionerRemote extends RemoteController{
	void speedUP();
	void speedDown();
	void tempUp();
	void tempDown();
}
public class Airconditioner implements AirconditionerRemote{

	@Override
	public void turnOn() {
		System.out.println("에어컨을 켭니다");		
	}

	@Override
	public void turnOff() {
		System.out.println("에어컨을 켭니다");		
	}

	@Override
	public void soundUp() {			
	}

	@Override
	public void soundDown() {		
	}

	@Override
	public void speedUP() {
		System.out.println("바람세기를 높입니다");
	}

	@Override
	public void speedDown() {
		System.out.println("바람세기를 낮춥니다");
	}

	@Override
	public void tempUp() {
		System.out.println("온도를 높입니다");
	}

	@Override
	public void tempDown() {
		System.out.println("온도를 낮춥니다");
	}
	public static void main(String[] args) {
		Airconditioner ac = new Airconditioner();
		ac.turnOn();
		ac.turnOff();
		ac.speedUP();
		ac.speedDown();
		ac.tempUp();
		ac.tempDown();			
	}

}
