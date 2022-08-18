package firstproject;

import java.util.Arrays;

public class ArrayEx2 {
	public static void main(String[] args) {
		int[] x = new int[10]; // 1차원 배열, 1열로 10칸
		
		for(int i=0;i<10;i++) {
			x[1]=0;
		}
		System.out.println(Arrays.toString(x));
		
		
		int[][] k = new int[5][10]; // 2차원 배열, 5열에 10칸씩
		for(int i=0;i<5;i++) { //5줄 -행
			for(int j=0;j<10;j++) { //10칸 -열
				k[i][j]=0;
			}
		}
		System.out.println(Arrays.toString(k[0]));
		System.out.println(Arrays.toString(k[1]));
		System.out.println(Arrays.toString(k[2]));
		System.out.println(Arrays.toString(k[3]));
		System.out.println(Arrays.toString(k[4]));
	}
}
