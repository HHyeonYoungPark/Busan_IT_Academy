class ForEx1{
	public static void main(String args[]){
		
		//for(초기값-변수;-조건식-참,거짓;증감식-증가 또는 감소){
			//반복될 내용
		//}
		
		int i;
		for(i=0;i<10;i++){ //2씩 증가시키려면 i=i+2 => i+=2
			System.out.println("헬로"); //꼭 i변수를 사용해야 하는 것은 아니다.
			//for(;;) <= 아무런 조건이 없다면 무한 반복됨.
		}
		
		/*밑처럼 줄여서 씀
		for(int i=0;i<10;i++){
			System.out.println(i);
		}*/
		
		
	}
}