import java.util.Scanner;

class Alba{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("==알바비 계산기==");
		
		System.out.println("일한 날짜: ");
		int i = sc.nextInt();
		System.out.println("하루 일한 시간 :");
		int j = sc.nextInt();
		System.out.println("시급 :");
		int k = sc.nextInt();
		System.out.println("주휴수당 포함한 이번달 총급여는 " + (i*j*k)+"원 입니다.");
	}
}