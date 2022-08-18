//선생님이 만든거

public class Order1 {
	Product1 p;
	Customer c;
	int orderCnt; // 총 주문수
	int price; // 총 주문을 처리하고 번 금액
	
	void sellProduct(Product1 p, Customer c) {
		orderCnt++; //이 메서드가 실행될때마다 무조건 1씩 증가
		price = price+p.price; // 현재 price에 제품의 price를 더해줌
		p.minusStock(); //재고 1씩 빼기
	}
	
	void printOrder1All() {
		System.out.println("총주문개수: "+orderCnt);
		System.out.println("총수익: "+price);
		System.out.println("======================================");
	}
	
	void printAllStock(Product1...p) { // 재고확인
		for(int i=0;i<p.length;i++) {
			p[i].printProduct1();
		}
	}
	
	
	public static void main(String[] args) {
		Order1 o = new Order1(); //주문 프로그램은 한번만 실행하면 된다.
		
		
		Customer c = new Customer("아이디","최이름");
		Customer c2 = new Customer("아이디2","김이름");
		Customer c3 = new Customer("아이디3","박이름");// 사용자 계속 추가 가능
		
		Product1 shoes = new Product1("신발",70000,700,10);
		Product1 phone = new Product1("아이폰",1000000,500,100);
		Product1 mouse = new Product1("마우스",40000,500,20);
		Product1 pencil = new Product1("연필",500,100,50); //제품 계속 추가 가능
		
		o.sellProduct(shoes,c); // 물건을 팔았을때 
		o.sellProduct(phone,c2); // 물건을 팔았을때 
		o.sellProduct(pencil,c2); // 물건을 팔았을때 
		o.sellProduct(pencil,c2); // 물건을 팔았을때 
		o.sellProduct(phone,c); // 물건을 팔았을때 
		o.sellProduct(mouse,c3);
		o.sellProduct(mouse,c3);
		o.sellProduct(mouse,c3);
		
		
		o.printOrder1All();
		
		o.printAllStock(shoes,pencil,phone,mouse);
		
	}
}
