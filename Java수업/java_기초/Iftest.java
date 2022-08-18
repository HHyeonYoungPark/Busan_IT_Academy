class Iftest{
	// if만약에
	// if(조건) 조건의 결과는 반드시 true/false가 나올 수 있는 조건이 드가야함
	// ==>조건의 결과는 참/거짓이 될것이다
	public static void main(String args[]){
		
		int randomNum = 10; //임의로 줌. 실제 실행할때마다 랜덤숫자나와야함
		int userInput = 5; //임의로 줌. 실제로는 sc.nextInt를 통해 입력예정
		
		
		if(randomNum>userInput){ //조건이 참일 때만 실행됨.
			System.out.println("더 작은수를 입력하세요");
		}else{//if의 조건이 맞지 않을 때만 실행.
			System.out.println("더 큰수를 입력하세요");
		}
	}
}