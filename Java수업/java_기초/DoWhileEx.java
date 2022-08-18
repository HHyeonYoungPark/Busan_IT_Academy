class DoWhileEx{
	public static void main(String args[]){
		/*
		int num=5;		
		do{ //while(조건) 과 상관없이 무조건 1번은 실행됨.
			System.out.println("출력");
		}while(num < 2);
		*/
		
		int num=4;
		do{
			num++;
			System.out.println("내부"+num);
			
		}while(num<5);
		System.out.println("외부"+num);
		
	}
}