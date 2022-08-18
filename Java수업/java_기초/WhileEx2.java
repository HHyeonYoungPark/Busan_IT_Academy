class WhileEx2{
	public static void main(String args[]){
		
		for(int i=0;i<5;i++){ //5번 반복
			System.out.println("for : "+i);
		}
		
		// cannot find symbol => 이 변수 또는 이 매서드를 찾을 수 없다, 정의되지 않았다.
		// 위 for문의 i는 저 안에서만 사용할 수 있고 밑에 i는 위 for문 과 관계가 없다
		// System.out.println(i); =>i가 정의되지 않음
		
		int j=0;
		while(j<5){ // for문 처럼 만들기 가능
			System.out.println("while : "+j);
			j++;
		}
		System.out.println(j); //이건 가능함. 이유는 int j를 괄호 밖에서 정의했기 떄문에,,
	}
}