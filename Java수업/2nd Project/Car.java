package secondproject;

class Car {
	//������ ����� - �ʱ�ȭ (Ŭ���� ����)
	String name;
	String color;
	int price;
	Car(){ // ������(�޼���) �̸��� Car() �Ȱ���. ()��ȣ �ȿ� �ִ� Ÿ��,����,����
		this.name="���׽ý�"; // �̰� �ٸ��ٸ� �����ε� �Ǿ���.
		this.color="����";
		this.price=1000;
	}
		Car(String name){
			this.name=name; //Ŭ���������� name = �޾ƿ� ������ ��� name
			this.color="����";
			this.price=800; // this�� �� Ŭ������ ����Ű�� this.price�� �� Ŭ���� ���� price�� ���Ѵ�
		}
		Car(String name,String color){
			this.name=name;
			this.color=color;
			this.price=700;
		}
		Car(String name,String color,int price){
			this.name=name;
			this.color=color;
			this.price=price;
		}
	
}
