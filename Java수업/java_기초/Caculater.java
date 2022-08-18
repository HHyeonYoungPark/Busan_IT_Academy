import java.util.Scanner;
//4칙 계산기
class Caculater{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요");
		int i = sc.nextInt();
		System.out.print("두번째 수를 입력하세요");
		int j = sc.nextInt();
		System.out.print("수식을 입력하세요");
		char ch = sc.next().charAt(0); //문자열에서 0번째(실제로는 첫번째) 글자하나를 가져온다.
									   //글자하나이기때문에 char 타입이다
									   //charAt(0)의 결과가 char이지만 필요에 따라 int로 받기가능
									   //char와 int 자동으로 바뀐다. int에 대응하는 숫자는 아스키코드표 참조
									   //ex)) int ch 로 하고 +대신 42를 넣어도 +한 값으로 출력됨
		if(ch=='+'){
			System.out.print(i+j);
		}else if(ch=='-'){
			System.out.print(i-j);
		}else if(ch=='*'){
			System.out.print(i*j);
		}else if(ch=='/'){
			System.out.print(i/j);
		}
	}
}