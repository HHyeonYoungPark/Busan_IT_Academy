import java.util.Scanner;
class WhileEx3{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);// 키보드 입력 받을 준비
      
      System.out.println("== 하이 로우 게임 ==");      
      /*
      while(true){
         System.out.print("1.새게임 2.점수확인 3.게임종료 : ");
         int input = sc.nextInt();         
         if(input==1){
            System.out.println("새 게임을 시작합니다.");
         }else if(input==2){
            System.out.println("최근 점수를 확인합니다.");
         }else if(input==3){
            System.out.println("게임을 종료합니다.");
            break;
         }else{
            System.out.println("없는 메뉴입니다.");
         }
      */   
         
		 boolean isRun = true;
      while(isRun){
		System.out.print("1.새게임 2.점수확인 3.게임종료 : ");
		int input = sc.nextInt();         
        switch(input){
            case 1:System.out.println("새 게임을 시작합니다.");break;
            case 2:System.out.println("최근 점수를 확인합니다.");break;
            case 3:System.out.println("게임을 종료합니다.");
					isRun =false; //isRun을 false로 주고 빠져나온다
					break;
            default:System.out.println("없는 메뉴 입니다.");
         }
      }    
   }
}
