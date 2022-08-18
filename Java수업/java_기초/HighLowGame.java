import java.util.Scanner;
class HighLowGame{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      while(true){// 메뉴 선택 반복문
         System.out.print("1.새게임 2.점수확인 3.게임종료");
         int menu = sc.nextInt();// 메뉴 입력
         if(menu==1){// 메뉴중에서 고르기
            System.out.println("새게임을 시작합니다.");
            int ranNum = (int)(Math.random()*100)+1;
            int cnt = 0;
            
			while(true){// 게임용 반복문            
               System.out.println("숫자를 입력해 주세요(강제종료(0)):");
               int input = sc.nextInt();// 게임 숫자 입력
               if(input>ranNum){
                  System.out.println("더 작은수를 입력하세요");
				  cnt++;
               }else if(input<ranNum){
                  System.out.println("더 큰수를 입력하세요");
				  cnt++;
               }else if(input==0){
                  System.out.println("강제 종료합니다.");
                  break;
               }else{
                  System.out.println("빙고");
                  break;
               }
            }
         }else if(menu==2){
            System.out.println("점수를 확인합니다.");
         }else if(menu==3){
            System.out.println("프로그램을 종료합니다.");
            break;
         }
      }     
   }
}