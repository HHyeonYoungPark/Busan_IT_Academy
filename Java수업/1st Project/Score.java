package firstproject;

import java.util.Arrays;
import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		int[][] schoolScore=new int[3][3]; //9칸짜리 배열 , 각 3칸씩 3줄
		Scanner sc =new Scanner(System.in);
		String[] cls = {"국어", "영어", "수학"};
		
		
		for(int i=0;i<schoolScore.length;i++) {  //줄 (행에 대한 for문)
			for(int j=0;j<schoolScore[0].length;j++) { // 칸(열)
				System.out.println((i+1)+"번째 학생의" +cls[j]+"점수를 입력하세요");
				schoolScore[i][j]= sc.nextInt();
			}
		}
		
		System.out.println(Arrays.toString(schoolScore[0]));
		System.out.println(Arrays.toString(schoolScore[1]));
		System.out.println(Arrays.toString(schoolScore[2]));
		
		int[] sum = {0,0,0};
		double[] avg = {0.0, 0.0, 0.0};
		
		for(int i=0;i<schoolScore.length;i++) {
			for(int j=0; j<3;j++) {
				sum[j] = sum[j]+schoolScore[i][j];
			}
		}
		System.out.println(Arrays.toString(sum)); // 각 과목의 총 점수
		System.out.println(sum[0]/3); //각 과목의 평균
		System.out.println(sum[1]/3);
		System.out.println(sum[2]/3);
		
/*		System.out.println("1번째 학생의 국어 점수를 입력하세요");
		schoolScore[0][0]= sc.nextInt();
		System.out.println("1번째 학생의 영어 점수를 입력하세요");
		schoolScore[0][1]= sc.nextInt();
		System.out.println("1번째 학생의 수학 점수를 입력하세요");
		schoolScore[0][2]= sc.nextInt();*/
		
	}
}
