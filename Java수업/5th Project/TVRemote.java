// �������� �����
public class TVRemote implements RemoteController{
	int vol;
	int ch;
	boolean power;
	
	@Override
	public void turnOn() {
		//�̹� �������̽��� �����Կ� �����簡 ������ Ű�� ����� ����� ��.
		System.out.println("��������");
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
