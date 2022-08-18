import java.util.Scanner;

class Rectangle_perimeter {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("한 변의 길이(m)를 입력하세요.");
		double length1 = sc.nextDouble();
		System.out.println("나머지 한 변의 길이(m)를 입력하세요.");
		double length2 = sc.nextDouble();
		
		System.out.println("직사각형 네변의 길이 합은"+((length1+length2)*2)+"입니다.");
		
		
		
	}
}