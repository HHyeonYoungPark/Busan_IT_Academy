// 클래스 3개를 만듬

// 제품,사용자,주문
 
//			클래스변수				메서드
// 제품 - 제품명,가격,무게,재고 / 재고개수 가감,전체내용 출력하는 메서드

// 사용자 - 아이디,이름,주소,전화번호 / 전체내용 출력 메서드

// 주문 - 제품,사용자,개수,금액 / 사용자 아이디로 구매한 제품 출력
//						    전체 사용자 출력 - 사용자 입력(new 사용자)
//  					    전체 제품 출력 - 제품입력(new 제품)
////////////////////////////////////////////////////////////
class Product{
	String product;
	int price;
	double weight;
	int count;
	
	public Product() {
		this("키보드",20000,0.7,10);
	}
	public Product(String product,int price,double weight,int count ) {
		this.product=product;
		this.price=price;
		this.weight=weight;
		this.count=count;
	}
	public void printInfo() {
		System.out.println("제품명:"+product+", 가격:"+price+"원, 무게:"+weight+"kg, 재고량:"+count+"개");
	}
	public void printInfor() {
		System.out.println("제품명:"+product);
	}
}

/////////////////////////////////////////////////////////////
class User{
	String userid;
	String name;
	String addr;
	String call;
	
	public User() {
		this("aud8637282","박현영","수원시","01064634837");
	}
	public User(String userid,String name,String addr,String call) {
		this.userid=userid;
		this.name=name;
		this.addr=addr;
		this.call=call;
	}
	public void printInfo() {
		System.out.println("아이디:"+userid+", 이름:"+name+", 주소:"+addr+", 전화번호:"+call);
	}
	public void printInfor() {
		System.out.println("아이디:"+userid);
	}
}

///////////////////////////////////////////////////////////
public class Order {
	Product product;
	User user;
	int quantity;
	int allPrice;
	
	public Order() {
		this(new Product(),new User(),1,20000);
	}
	public Order(Product product,User user,int quantity,int allPrice) {
		this.product=product;
		this.user=user;
		this.quantity= quantity;
		this.allPrice=allPrice;
	}
	
	
	public void printInfo() {
		System.out.println("==========주문내역==========");
		product.printInfor();
		user.printInfor();
		System.out.println("주문수량:"+quantity+"개");
		System.out.println("총가격:"+allPrice+"원");
		System.out.println("===================제품 및 구매자정보=====================");
		product.printInfo();
		user.printInfo();
		System.out.println(" ");
	}
	
	
	public static void main(String[] args) {
		Order o = new Order();
		o.printInfo();
		
		Order o2 = new Order(new Product(),new User(),3,60000);
		o2.printInfo();
		
		Order o3 = new Order(new Product("모니터",90000,2.5,60),new User("abc123","노진구","해운대구","01012345678"),8,720000);
		o3.printInfo();
	}
}
