import java.util.Scanner;

class BMI {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("키를 입력하세요");
      double height = (sc.nextDouble() * 0.01);
      System.out.println("몸무게를 입력하세요");
      double weight = sc.nextDouble();
      
      System.out.println("당신의 BMI는"+(weight/(height*height))+"입니다.");
         
   }
}