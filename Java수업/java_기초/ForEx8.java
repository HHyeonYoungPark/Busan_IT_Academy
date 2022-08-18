// 구구단 2~9단까지
// 2x1=2 2x2=4 2x3=6 ~~~ 2x9=18
// ~~~~~~~~~~~9x9=81
//============================
//2x1=2 3x1=3 4x1=4 ~~~~9x1=9
//2x2=4 ~~~~~~~~~~~~~~~~~~
class ForEx8{
	public static void main(String args[]){		
		
		
		for(int num=2;num<=9;num++){
			for(int i=1;i<=9;i++){
				System.out.print(num +"x" + i + "=" + (i*num)+"    ");
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=9;i++){
			for(int j=2;j<=9;j++){
				System.out.print(j +"x" + i + "=" + (i*j)+"    ");
			}
			System.out.println();
		}
	}
}