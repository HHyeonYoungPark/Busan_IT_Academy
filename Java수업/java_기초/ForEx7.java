class ForEx7{
	//3 6 9 게임,,,, 3 6 9 포함된 숫자 나오면 "짝"으로 출력
	
	public static void main(String args[]){
		int num= 0 ;  //출력될 숫자
		
		for(int i=1;i<=10;i++){
			for(int j=1;j<=10;j++){
				num++;
				if(j%3==0){
					System.out.print("짝 ");
				}else if(num%30==0){
					System.out.print("짝 ");
				}else if((int)(num*0.1)==3 || (int)(num*0.1)==6 || (int)(num*0.1)==9){
					System.out.print("짝 ");
				}else{
					System.out.print(num +" ");
				}
				
			}
			System.out.println();
		}
	}
}