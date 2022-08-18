import java.util.Scanner;

class Bonus{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("==보너스 계산기==");
		
		System.out.println("월급 :");
		int i = sc.nextInt();
		System.out.println("판매량 :");
		int j = sc.nextInt();
		
		//double k = j>=10?0.1:0;
		//System.out.println("보너스를 포함한 월급여는" +(i+(i*k))+ "원 입니다.");
		
		//or
		
		double k = j>=10?0.1*i:0;
		System.out.println("보너스를 포함한 월급여는" +(i+k)+ "원 입니다.");
		
	
	}
}