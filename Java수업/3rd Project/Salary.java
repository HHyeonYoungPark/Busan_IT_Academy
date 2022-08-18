
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
		System.out.println("월급:"+salary+"만원, 세금:"+tax+"%, 보험료:"+insurance+"만원");
		System.out.println("실 수령액:"+(int)(salary-(salary*(double)(tax*0.01))-insurance)+"만원");
	}
	
	public static void main(String args[]){
	    Salary s = new Salary();
	    s.insertSalary(1000);
	    s.calTax(5);
	    s.calInsurance(50);
	    s.showRealSalary();
	// 월급 1000만원, 세금 5%, 보험료 50만원
	// 실 수령액 xxx 만원
	}
}
