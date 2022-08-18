import java.util.Scanner;

class ASCI{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		int i = sc.next().charAt(0);
		
		if(i==1){
			System.out.print(1);
		}else if(i==2)
			System.out.print(2);
	}
}