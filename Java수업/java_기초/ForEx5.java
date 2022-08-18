class ForEx5{
	public static void main(String args[]){
		int num = 0;
		
		for(int i=0;i<10;i++){ // i는 0~9 10개
			for(int j=0;j<10;j++){// j는 0~9 10개
				for(int k=0;k<10;k++){ //k도 0~9 10개
					num++;
				}
				
				//처음 i값이 0이면 참, 밑에 j 0으로 감 = 하이 출력
				// 다시 i값 0으로 돌아감, j가 0~9까지 실행 후 i값이 2가 됨 >> 이후 계속 반복 i값이 9일때까지
				//그래서 100번이 나옴
			}
		}
		System.out.println(num);
	}
}