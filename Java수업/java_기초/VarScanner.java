import java.util.Scanner;// 스캐너를 쓰기 위한 준비

class VarScanner{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		// 키보드(System.in)으로 부터 입력 받을 수 있도록 준비.
		
		System.out.print("첫 번째 숫자를 입력하세요 :");
		int i = sc.nextInt();// 키보드로부터 입력받은 정수값을 i에 담는다.
		// double d = sc.nextDouble(); // 실수 받기
		// string str = sc.next(); 또는 sc.nextLine(); // 문자열 받기
		// boolean b = sc.nextBoolean() // true,false 받기
		System.out.println("입력받은 숫자는"+i+"입니다.");
		//System.out.print("입력받은 숫자는 ");
		//System.out.print(i);
		//System.out.println("입니다.");
		System.out.print("두 번째 숫자를 입력하세요 :");
		int j = sc.nextInt();// 키보드로부터 입력받은 값을 j에 담는다.
		System.out.print("입력받은 숫자는 ");
		System.out.print(j);
		System.out.println("입니다.");
		System.out.print("두 숫자를 더한 값은 :");
		System.out.print(i+j);// i+j 값을 출력
		System.out.println("입니다.");
	}
}