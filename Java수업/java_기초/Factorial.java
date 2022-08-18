import java.util.Scanner;
class Factorial{ //차례곱 수학표현에서는 5! <=5팩토리얼
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//숫자입력을 1개 받는다
		//1부터 입력받은 숫자까지의 곱
		//ex 5를 입력받으면 1*2*3*4*5 의 값을 출력
		System.out.println("숫자를 입력하세요:");
		int input = sc.nextInt();
		int sum=1;
		for(int i=input;i>=1;i--){ //5 4 3 2 1
			sum *=i;
		}
		System.out.println(sum);
		
		
		/*
		int input = 5;
		int sum=1;
		for(int i=1;i<=input;i++){
			sum=sum*i;
			}
			System.out.println(sum);
			*/

		
	}
}