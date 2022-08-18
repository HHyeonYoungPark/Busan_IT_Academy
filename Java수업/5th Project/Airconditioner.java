interface AirconditionerRemote extends RemoteController{
	void speedUP();
	void speedDown();
	void tempUp();
	void tempDown();
}
public class Airconditioner implements AirconditionerRemote{

	@Override
	public void turnOn() {
		System.out.println("�������� �մϴ�");		
	}

	@Override
	public void turnOff() {
		System.out.println("�������� �մϴ�");		
	}

	@Override
	public void soundUp() {			
	}

	@Override
	public void soundDown() {		
	}

	@Override
	public void speedUP() {
		System.out.println("�ٶ����⸦ ���Դϴ�");
	}

	@Override
	public void speedDown() {
		System.out.println("�ٶ����⸦ ����ϴ�");
	}

	@Override
	public void tempUp() {
		System.out.println("�µ��� ���Դϴ�");
	}

	@Override
	public void tempDown() {
		System.out.println("�µ��� ����ϴ�");
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
