// �� �ֱ� ���, �� ���� ���
// �� ���� ��� �ִ� ������ �� ���� ���ٸ� �ܾ׺��� ���
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
		
		BankingUser u = new BankingUser("������","110-437-282138",20000);
		
		b.moneyDeposit();
		}
}
