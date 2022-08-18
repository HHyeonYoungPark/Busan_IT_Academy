class MultiTable{
	//구구단 만들기
	public static void main(String args[]){
		//단(dan)은 고정되어 있다.
		//단에 곱하는 수(num)는 1부터 시작해서 9까지 1씩 증가한다.
		//for(초기값;조건식;증감식) 조건에 들어가는 내용은 초기값의 최대치가 되는 값
		
		int dan = 2;
		for(int num=1; num<=9; num++){
			System.out.println(dan +"x" + num + "=" + (dan*num));
		}
		
		
		
		//문제: 1~100사이의 3의 배수의 합
		//풀이: 3의 배수의 합의 결과를 담는 변수
		/*int sum=0;
		for(int i=3; i<=100; i=i+3){
			sum=sum+i;
		}
		System.out.println(sum);
		
		int sum1=0;
		for(int i=1;i<=100;i++){
			if(i%3==0)
				sum1 = sum1+i;
		}
		System.out.println(sum);
	}*/
		
		
		//1~100까지의 전체 합
		//1~100까지 홀수의 합, 짝수의 합
		//3개를 동시에 출력하세요
		
	
	
	}
}