class ElseIf{
	public static void main(String args[]){
		
		/*
		if(조건){ //
			
		}else if(조건){
			
		}else if(조건){
			
		}else if(조건){
			
		}else if(조건){
			
		}else{
			위의 if문 조건이 맞지않을때 실행
		}
		*/
		
		int userInput = 90;
		
		if(userInput <= 100 && userInput >=90){
			System.out.print("A");
		}else if(userInput <=89 && userInput >==80){
			System.out.print("B");
		}else{
			System.out.print("F");
		}
	}
}