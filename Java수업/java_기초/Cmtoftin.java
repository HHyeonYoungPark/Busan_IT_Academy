import java.util.Scanner;

class Cmtoftin{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("키(cm)를 입력하세요.");
		double height_cm = sc.nextDouble();
				
		System.out.println("ft.in로 변환한 키는"+((height_cm/2.54)/12)+"입니다.");
		
		
		
	}
}