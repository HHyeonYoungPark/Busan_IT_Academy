package secondproject;

class Timetables{
	void ttable(int i) {
		for(int z=1;z<=9;z++) {
			System.out.println(i+"x"+z+"="+(i*z));
		}
	}
}

public class TtTest{ //Ŭ������ 2���� ��� main�� �ִ� Ŭ���� �̸����� �ؾ� ��
	public static void main(String[] args) {
		//Ŭ������ 2���� ��� ���ϸ�=Ŭ������ �� public�� ���δ�.
		
		Timetables tt = new Timetables();
			tt.ttable(2); //2�� ������ ���
			tt.ttable(3); //3��

	}
}