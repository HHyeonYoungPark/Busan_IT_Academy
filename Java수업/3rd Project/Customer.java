//�������� �����

public class Customer {
	String id, cName, addr, tel;
	

	public Customer(String id, String cName){ //new���� ���
		this(id,cName,"����","010-0000-0000");
	}
	public Customer(String id, String cName, String addr, String tel) {
		this.id = id;
		this.cName = cName;
		this.addr = addr;
		this.tel = tel;
	}

	void setAdd(String add) { // ���� �������� �������� �����ɶ��� ���Ǵ� �޼���
		this.addr=addr;
	}
	void setATel(String tel) {
		this.tel=tel;
	}
	
	void printCus() {
		System.out.print(" �����̵�:"+id);
		System.out.print(" ����:"+cName);
		System.out.print(" �ּ�:"+addr);
		System.out.println(" ��ȣ:"+tel);
	}
	
	//test code
	/*
	public static void main(String[] args) {
		//String id = �Ѿ�� ���̵�
		//String name = �Ѿ�� �̸� ���
		
		Customer c = new Customer("id1","���̸�","�λ�","01064364837"); //ȸ�������� �ȴ�
		c.printCus(); // ������ ��������� ���
		
		Customer c2 = new Customer("id2","���̸�");
		c2.printCus();
		c2.setAdd("����"); // �ּҺ���.������ �λ������� ���ַ� �ٲ�
		c2.printCus();
	}
	*/
}
