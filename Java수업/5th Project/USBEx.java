interface USBA{
	String TYPE = "A";
	void speed();
	void printType();
}

interface Samsung extends USBA{ // 인터페이스는 인터페이스끼리 상속이 가능
	void warranty();            // 그냥 두개의 인터페이스 더하기라고 생각하면 된다.
}


public class USBEx implements Samsung{ //Samsung 앞에 있었던 USBA를 지워도 된다 - 상속했으니까
	// 상속은 반드시 한개만 가능하지만 구현(implements)은 여러개 가능함.
	
	@Override
	public void speed() {
		System.out.println("2.0 스피드입니다");
	
	}
	@Override
	public void printType() {
		System.out.println("A타입, 브랜드 삼성");
		
	}
	
	@Override
	public void warranty() {
		System.out.println("워런티는 5년까지 입니다");
	}
	
	public static void main(String[] args) {
		USBEx ue = new USBEx();
		ue.speed();
		ue.printType();
		ue.warranty();
		System.out.println(ue.TYPE);
	}
	
}
