import java.util.Scanner;
//연봉과 보너스 계산기
// 4년차까지 연봉의 5프로씩 올려줌
//4년차 이상은 연봉 동결이나 10년 넘으면 플러스 10%
class Salary{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("기본연봉을 입력하세요:");
		int i = sc.nextInt();
		System.out.print("연차를 입력하세요: ");
		int j = sc.nextInt();
		
		if(j==2){
			System.out.print(i*1.05);
		}else if(j==3){
			System.out.print((i*1.05)*1.05);
		}else if(j>=4 && j<10){
			System.out.print(((i*1.05)*1.05)*1.05);
		}else if(j>=10){
			System.out.print((((i*1.05)*1.05)*1.05)*1.1);
		}
	}
}