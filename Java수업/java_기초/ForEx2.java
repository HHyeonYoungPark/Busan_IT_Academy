class ForEx2{
	//1~100까지의 전체 합
	//1~100까지 홀수의 합, 짝수의 합
	//3개를 동시에 출력하세요
	
	public static void main(String args[]){
	
		int sum1=0,sum2=0,sum3=0;
	
			for(int i=1; i<=100; i++){
				sum1 = sum1+i;
				if(i%2==0){ //짝수
					sum2 = sum2+i;
				}else{  //홀수
					sum3 = sum3+i;
				}
		}
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
	}
}