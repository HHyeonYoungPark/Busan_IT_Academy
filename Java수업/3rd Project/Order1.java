//�������� �����

public class Order1 {
	Product1 p;
	Customer c;
	int orderCnt; // �� �ֹ���
	int price; // �� �ֹ��� ó���ϰ� �� �ݾ�
	
	void sellProduct(Product1 p, Customer c) {
		orderCnt++; //�� �޼��尡 ����ɶ����� ������ 1�� ����
		price = price+p.price; // ���� price�� ��ǰ�� price�� ������
		p.minusStock(); //��� 1�� ����
	}
	
	void printOrder1All() {
		System.out.println("���ֹ�����: "+orderCnt);
		System.out.println("�Ѽ���: "+price);
		System.out.println("======================================");
	}
	
	void printAllStock(Product1...p) { // ���Ȯ��
		for(int i=0;i<p.length;i++) {
			p[i].printProduct1();
		}
	}
	
	
	public static void main(String[] args) {
		Order1 o = new Order1(); //�ֹ� ���α׷��� �ѹ��� �����ϸ� �ȴ�.
		
		
		Customer c = new Customer("���̵�","���̸�");
		Customer c2 = new Customer("���̵�2","���̸�");
		Customer c3 = new Customer("���̵�3","���̸�");// ����� ��� �߰� ����
		
		Product1 shoes = new Product1("�Ź�",70000,700,10);
		Product1 phone = new Product1("������",1000000,500,100);
		Product1 mouse = new Product1("���콺",40000,500,20);
		Product1 pencil = new Product1("����",500,100,50); //��ǰ ��� �߰� ����
		
		o.sellProduct(shoes,c); // ������ �Ⱦ����� 
		o.sellProduct(phone,c2); // ������ �Ⱦ����� 
		o.sellProduct(pencil,c2); // ������ �Ⱦ����� 
		o.sellProduct(pencil,c2); // ������ �Ⱦ����� 
		o.sellProduct(phone,c); // ������ �Ⱦ����� 
		o.sellProduct(mouse,c3);
		o.sellProduct(mouse,c3);
		o.sellProduct(mouse,c3);
		
		
		o.printOrder1All();
		
		o.printAllStock(shoes,pencil,phone,mouse);
		
	}
}
