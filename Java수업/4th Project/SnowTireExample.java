class Tire{
	public void run() {
		System.out.println("Ÿ�̾ �������ϴ�");
	}
	public void trun() {
		System.out.println("Ÿ�̾ �ִ�");
	}
	public Tire() {
		System.out.println("�Ϲ�Ÿ�̾�");
	}
}
class SnowTire extends Tire{
	public SnowTire() {
		// SnowTire �������� ���� Tire�� �����ȴ�
		System.out.println("�����Ÿ�̾�");
	}
	
	
	@Override
	public void run() {
		System.out.println("����� Ÿ�̾ �������ϴ�");
	}
	
	public void srun() {
		super.run();
	}
}

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire st = new SnowTire();
		//SnowTire snowTire = new SnowTire();
		//Tire tire = snowTire;
		
		//snowTire.run();
		//tire.run();
		// tire.srun(); -> srun()�� tire Ŭ������ ����
		//snowTire.srun();
		
		//Tire tire = new SnowTire(); // tire�� �����ǰ� snoeTire�� �����ȴ�
		Tire tire = new Tire(); // Tire�� �����ǰ� SnowTire�� �����ȵ�
		SnowTire snowTire = (SnowTire)tire; //��ƴ� ���µ� snowTire�� �������̾���
		snowTire.trun(); //SnowTire�� ������ ���Ŀ� ����� �� �ִ� �޼���
		// ���� �ڵ忡���� SnowTire�� ������ ���� ���� SnowTire ��ü�� �� �� ����
		
		Tire tire2 = new SnowTire(); //tire�� �����ǰ� snoeTire�� �����ȴ�
	}
}
