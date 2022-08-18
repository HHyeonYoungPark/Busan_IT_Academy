interface Tire{ void printInfo();}

class Kumho implements Tire{

	@Override
	public void printInfo() { }
	public void setKumho() { }
}

class Hankook implements Tire{

	@Override
	public void printInfo() { }
	public void setHankook() { }
}

class Michelin extends Hankook{
	void setMichelin() { }
}

public class CastingEx {
	public static void main(String[] args) {
		Hankook h = new Hankook();
		h.setHankook();
		Kumho k = new Kumho();
		k.setKumho();
		
		Tire t1 = new Hankook();
		//t1.setHankook(); //��������.
		
		Tire t2 = new Kumho();
		Kumho k2 = (Kumho) t2;
		k2.setKumho(); // ��ӿ��� �ߴ���, k2�� ���󰡺��� ���� ó���� ������� ���� Kumho�̹Ƿ� 
					   // ������ k2�� new Kumho();�̴�.
		
		Tire t3 = new Tire() {			
			@Override
			public void printInfo() {}
		};
		Kumho k3 = (Kumho) t3; // ���������� ������ ������ ��ü�� Tire���� Kumho�� ����ȯ�� �ȵ�
		k3.setKumho(); //�����߻� , t2�� Kumho / t3�� Tire, Kumho�� ����ȯ�ϴ��� Tire�̱� ������ Kumho�� �޼��带 ��������
		
		
		Hankook m = new Michelin();
		//m.setMichelin(); // ����϶��� �翬�� �ȵ�
	}
}
