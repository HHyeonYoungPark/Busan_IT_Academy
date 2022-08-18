class Tire{
	public void run() {
		System.out.println("타이어가 굴러갑니다");
	}
	public void trun() {
		System.out.println("타이어가 있다");
	}
	public Tire() {
		System.out.println("일반타이어");
	}
}
class SnowTire extends Tire{
	public SnowTire() {
		// SnowTire 생성전에 먼저 Tire가 생성된다
		System.out.println("스노우타이어");
	}
	
	
	@Override
	public void run() {
		System.out.println("스노우 타이어가 굴러갑니다");
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
		// tire.srun(); -> srun()은 tire 클래스에 없다
		//snowTire.srun();
		
		//Tire tire = new SnowTire(); // tire도 생성되고 snoeTire도 생성된다
		Tire tire = new Tire(); // Tire만 생성되고 SnowTire는 생성안됨
		SnowTire snowTire = (SnowTire)tire; //담아는 지는데 snowTire를 만든적이없음
		snowTire.trun(); //SnowTire가 생성된 이후에 사용할 수 있는 메서드
		// 여기 코드에서는 SnowTire를 생성한 적이 없다 SnowTire 자체를 쓸 수 없다
		
		Tire tire2 = new SnowTire(); //tire도 생성되고 snoeTire도 생성된다
	}
}
