// ÀºÇà°èÁÂ, µ·

public class BankingUser {
	String userName, account;
	int money;
	
	public BankingUser(){}
	
	public BankingUser(String userName, String account, int money) {
		this.userName=userName;
		this.account=account;
		this.money=money;
	}
	
	public void setInfo(String userName, String account, int money) {
		this.userName=userName;
		this.account=account;
		this.money=money;
	}

	void printInfo() {
		System.out.print(" ¿¹±İÁÖ:"+userName);
		System.out.print(" °èÁÂ:"+account);
		System.out.println(" ÀÜ¾×:"+money);
	}
}
