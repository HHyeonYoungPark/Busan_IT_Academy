import java.util.Scanner;

class Sal{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시급은? :");
		int wage = sc.nextInt();
		System.out.println("하루당 일한 시간은? :");
		int time = sc.nextInt();
		System.out.println("총 일한 날짜 :");
		int day = sc.nextInt();
		
		System.out.println();
		int hourlySal = sc.nextInt(time*wage);
		
		System.out.println("주휴수당을 포함한 이번달 총 급여는"+ (wage*time)*day + (hourlySal*4)) +"원입니다.");
		
	}
}