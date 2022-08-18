package firstproject;

import java.util.Scanner;

public class ScoreEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] schoolScore=new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("1번째 학생의 국어 점수를 입력하세요");
				schoolScore[0][0] = sc.nextInt();
				System.out.println("1번째 학생의 영어 점수를 입력하세요");
				schoolScore[0][1] = sc.nextInt();
				System.out.println("1번째 학생의 수학 점수를 입력하세요");
				schoolScore[0][2] = sc.nextInt();
				
				
			}
			
		}
		
	}
}
