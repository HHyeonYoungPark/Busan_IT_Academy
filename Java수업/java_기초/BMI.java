import java.util.Scanner;// 스캐너를 쓰기 위한 준비

class BMI{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몸무게(kg)를 입력하세요 :");
		double i = sc.nextDouble();// 키보드로부터 입력받은 실수값을 i에 담는다.
		System.out.print("키(m)를 입력하세요 :");
		double j = sc.nextDouble();// 키보드로부터 입력받은 실수값을 j에 담는다.
		
		System.out.print("당신의 BMI 수치는 :");
		System.out.print(i/(j*j));//i/(j*j) 값을 출력
		System.out.println("입니다.");
	}
}