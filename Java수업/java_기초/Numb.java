import java.util.Scanner;
//작은숫자대로 나열하기
class Numb{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요.");
		int a = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요.");
		int b = sc.nextInt();
		System.out.print("세번째 숫자를 입력하세요.");
		int c = sc.nextInt();
		
		if(a<b && a<c){
			System.out.print(a+" ");
			if(b<c){
				System.out.print(b+" ");
				System.out.print(c+" ");
			}else{
				System.out.print(c+" ");
				System.out.print(b+" ");
			}
			
		}
		
		if(b<a && b<c){
			System.out.print(b+" ");
			if(a<c){
				System.out.print(a+" ");
				System.out.print(c+" ");
			}else{
				System.out.print(c+" ");
				System.out.print(a+" ");
			}
		}
		
		if(c<a && c<b){
			System.out.print(c+" ");
			if(b<a){
				System.out.print(b+" ");
				System.out.print(a+" ");
			}else{
				System.out.print(a+" ");
				System.out.print(b+" ");
			}
		
	}

}
}