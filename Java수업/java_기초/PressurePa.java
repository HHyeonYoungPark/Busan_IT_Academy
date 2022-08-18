import java.util.Scanner;

class PressurePa{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가하는 힘(N)을 입력하세요.");
		double forceN = sc.nextDouble();
		System.out.println("힘들 받는 면적(m^2)을 입력하세요.");
		double aream2 = sc.nextDouble();
				
		System.out.println("주어진 면적에 가해지는 압력의 세기는"+(forceN/aream2)+"Pa 입니다.");
		
		
		
	}
}