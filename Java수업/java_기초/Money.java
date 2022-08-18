import java.util. Scanner;

class Money{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("500원의 갯수는?");
		int numof500won = sc.nextInt();
		System.out.println("100원의 갯수는?");
		int numof100won = sc.nextInt();
		System.out.println("50원의 갯수는?");
		int numof50won = sc.nextInt();
		System.out.println("10원의 갯수는?");
		int numof10won = sc.nextInt();
		
		System.out.println("총 " + (numof500won*500+numof100won*100+numof50won*50+numof10won*10) + "원 입니다.");
		
	}
}