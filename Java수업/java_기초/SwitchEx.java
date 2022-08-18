import java.util.Scanner;

class SwitchEx{
	//switch - case
	//if문과 유사한 기능
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("영어로 출력을 원하는 달을 입력하세요:");
		int month= sc.nextInt();
		
		switch(1){ //if(조건)  //switch(변수-값)
			case 1: System.out.println("January"); break;					
			case 2: System.out.println("February"); break;			
			case 3:System.out.println("March"); break;			
			case 4:System.out.println("April"); break;			
			case 5:System.out.println("May"); break;
			default:System.out.println("잘못입력됨.");
		
		}
	}
}