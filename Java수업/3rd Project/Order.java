// Ŭ���� 3���� ����

// ��ǰ,�����,�ֹ�
 
//			Ŭ��������				�޼���
// ��ǰ - ��ǰ��,����,����,��� / ����� ����,��ü���� ����ϴ� �޼���

// ����� - ���̵�,�̸�,�ּ�,��ȭ��ȣ / ��ü���� ��� �޼���

// �ֹ� - ��ǰ,�����,����,�ݾ� / ����� ���̵�� ������ ��ǰ ���
//						    ��ü ����� ��� - ����� �Է�(new �����)
//  					    ��ü ��ǰ ��� - ��ǰ�Է�(new ��ǰ)
////////////////////////////////////////////////////////////
class Product{
	String product;
	int price;
	double weight;
	int count;
	
	public Product() {
		this("Ű����",20000,0.7,10);
	}
	public Product(String product,int price,double weight,int count ) {
		this.product=product;
		this.price=price;
		this.weight=weight;
		this.count=count;
	}
	public void printInfo() {
		System.out.println("��ǰ��:"+product+", ����:"+price+"��, ����:"+weight+"kg, ���:"+count+"��");
	}
	public void printInfor() {
		System.out.println("��ǰ��:"+product);
	}
}

/////////////////////////////////////////////////////////////
class User{
	String userid;
	String name;
	String addr;
	String call;
	
	public User() {
		this("aud8637282","������","������","01064634837");
	}
	public User(String userid,String name,String addr,String call) {
		this.userid=userid;
		this.name=name;
		this.addr=addr;
		this.call=call;
	}
	public void printInfo() {
		System.out.println("���̵�:"+userid+", �̸�:"+name+", �ּ�:"+addr+", ��ȭ��ȣ:"+call);
	}
	public void printInfor() {
		System.out.println("���̵�:"+userid);
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
		System.out.println("==========�ֹ�����==========");
		product.printInfor();
		user.printInfor();
		System.out.println("�ֹ�����:"+quantity+"��");
		System.out.println("�Ѱ���:"+allPrice+"��");
		System.out.println("===================��ǰ �� ����������=====================");
		product.printInfo();
		user.printInfo();
		System.out.println(" ");
	}
	
	
	public static void main(String[] args) {
		Order o = new Order();
		o.printInfo();
		
		Order o2 = new Order(new Product(),new User(),3,60000);
		o2.printInfo();
		
		Order o3 = new Order(new Product("�����",90000,2.5,60),new User("abc123","������","�ؿ�뱸","01012345678"),8,720000);
		o3.printInfo();
	}
}
