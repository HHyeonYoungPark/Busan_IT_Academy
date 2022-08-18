//선생님이 만든거

public class Customer {
	String id, cName, addr, tel;
	

	public Customer(String id, String cName){ //new에서 사용
		this(id,cName,"서울","010-0000-0000");
	}
	public Customer(String id, String cName, String addr, String tel) {
		this.id = id;
		this.cName = cName;
		this.addr = addr;
		this.tel = tel;
	}

	void setAdd(String add) { // 값을 넣을때도 사용되지만 수정될때도 사용되는 메서드
		this.addr=addr;
	}
	void setATel(String tel) {
		this.tel=tel;
	}
	
	void printCus() {
		System.out.print(" 고객아이디:"+id);
		System.out.print(" 고객명:"+cName);
		System.out.print(" 주소:"+addr);
		System.out.println(" 번호:"+tel);
	}
	
	//test code
	/*
	public static void main(String[] args) {
		//String id = 넘어온 아이디
		//String name = 넘어온 이름 등등
		
		Customer c = new Customer("id1","최이름","부산","01064364837"); //회원가입이 된다
		c.printCus(); // 정보를 보고싶으면 사용
		
		Customer c2 = new Customer("id2","김이름");
		c2.printCus();
		c2.setAdd("경주"); // 주소변경.원래는 부산이지만 경주로 바뀜
		c2.printCus();
	}
	*/
}
