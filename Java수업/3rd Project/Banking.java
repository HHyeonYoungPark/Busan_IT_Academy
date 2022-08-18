// 돈 넣기 기능, 돈 빼기 기능
// 이 고객이 들고 있는 돈보다 더 많이 뺀다면 잔액부족 출력
public class Banking {
	BankingUser u;
	int deposit;
	int withdraw;
	
	void moneyDeposit(BankingUser u) {
		
	}
	
	void printinfo(BankingUser u) {
		System.out.println();
	}
	
	public static void main(String[] args) {
		Banking b = new Banking();
		
		BankingUser u = new BankingUser("박현영","110-437-282138",20000);
		
		b.moneyDeposit();
		}
}
