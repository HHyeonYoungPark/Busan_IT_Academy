class ForEx6{
	//1~100까지 숫자를
	//12345678910
	//11 12 13 14 15 16....
	//이런식으로 100까지 10씩 끊어서 출력해보기
	
	public static void main(String args[]){
		/*
		int num = 0;
		
		for(int i=1;i<=100;i++){
			System.out.print(" "+i);  //ln이 없으면 바로 출력
			if(i%10==0){
				System.out.println(); // ln이 있으면 엔터 포함해서 출력
			}
		}
		*/
		
		int num=0;
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){ //일단 숫자는 없지만 여기안에 내용은 100번 반복됨
				num++;
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}