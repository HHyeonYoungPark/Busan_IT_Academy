import java.util.Scanner;

class OddEven{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력: ");
		
		int i = sc.nextInt(); //숫자입력받기
		System.out.println(i%2==0? "짝수":"홀수");
		
	}
}