
public class Salary {
	int salary;
	int tax;
	int insurance;
	
	void insertSalary(int s) {
		salary = s;
	}
	void calTax(int t) {
		tax = t;
	}
	void calInsurance(int i) {
		insurance = i;
	}
	
	void showRealSalary() {
		System.out.println("����:"+salary+"����, ����:"+tax+"%, �����:"+insurance+"����");
		System.out.println("�� ���ɾ�:"+(int)(salary-(salary*(double)(tax*0.01))-insurance)+"����");
	}
	
	public static void main(String args[]){
	    Salary s = new Salary();
	    s.insertSalary(1000);
	    s.calTax(5);
	    s.calInsurance(50);
	    s.showRealSalary();
	// ���� 1000����, ���� 5%, ����� 50����
	// �� ���ɾ� xxx ����
	}
}
