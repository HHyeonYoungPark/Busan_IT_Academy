import java.util.Scanner;

class HighLow{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double ran = Math.random(); //0~1이 아닌 가장 큰 수 사이의 실수를 랜덤하게 가져옴
		int answer = (int)(ran*100)+1;
		//System.out.println(answer);
		//우리가 프로그램을 실행하려면 ctrl+1 (컴파일) - 코드가 수정되면 반드시 해줘야 한다.
		// 이후 ctrl+2 (실행) - 코드가 수정되지 않으면 굳이 컴파일이 필요없이 실행만 하면된다.
		
		System.out.println("==하이 로우 게임==");
		System.out.println("랜덤 숫자가 생성되었습니다.");
		
		for(;;){ //맞출때까지 무한반복
		
			System.out.print("숫자를 입력하세요: ");
			int user = sc.nextInt(); //숫자입력받기
			if(user>answer){
				System.out.println("더 낮은수를 입력하세요");
				cnt++;
			}else if(user<answer){
				System.out.println("더 높은수를 입력하세요");
				cnt++;
			}else{
				System.out.println("딩동댕동!"+cnt+""번만에 맞춤); break;
			}
		}
		
		
		//맞췄을떄 "xx번째 만에 맞췄네"
	}
}