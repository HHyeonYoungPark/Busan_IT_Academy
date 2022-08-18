import java.util.Scanner;
//나이와 자격증에 따라 연봉구하기
class IfTest2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("나이는 얼마 입니까?");
		int age = sc.nextInt();
		if(age>30){
			System.out.println("경력이 있습니까? O:1 X:2");
			int career = sc.nextInt();
			if(career==1){
				System.out.println("자격증이 있습니까? O:1 X:2");
				int certi = sc.nextInt();
				if(certi==1){
					System.out.println("당신의 연봉은 7000 부터 시작합니다.");				
				}else{
					System.out.println("당신의 연봉은 5000 부터 시작합니다.");				
				}				
			}else{
				System.out.println("당신의 연봉은 3500 부터 시작합니다.");
			}
		}else{
			System.out.println("자격증이 있습니까? O:1 X:2");
			int certi = sc.nextInt();
			if(certi==1){
				System.out.println("경력이 있습니까? O:1 X:2");
				int career = sc.nextInt();
				if(career==1){
					System.out.println("당신의 연봉은 7000 부터 시작합니다.");	
				}else{
					System.out.println("당신의 연봉은 4000 부터 시작합니다.");		
				}				
			}else{
				System.out.println("당신의 연봉은 3500 부터 시작합니다.");	
			}
		}
		
	}
}