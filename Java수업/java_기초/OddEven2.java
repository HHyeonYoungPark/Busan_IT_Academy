import java.util.Scanner;

class OddEven2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력: ");
		int i = sc.nextInt(); //숫자입력받기
		
		if(i%2==0){
			System.out.println("짝수입니다.");
		}else{
			System.out.println("홀수입니다.");
		}
		
	}
}