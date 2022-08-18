import java.util.Scanner;
//학점계산기
class IfTest3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요:");
		int a = sc.nextInt();
		
		if(a<=100 && a>=90){
			System.out.print("A");
		}
		if(a<=89 && a>=80){
			System.out.print("B");
		}
		if(a<=79 && a>=70){
			System.out.print("C");
		}
		if(a<=69 && a>=60){
			System.out.print("D");
		}
		if(a<60){
			System.out.print("F");
		}
		
	}
}