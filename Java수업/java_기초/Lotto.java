class Lotto{
   public static void main(String[] args){// 특별한 녀석이라서 사용이 조금 틀리다.
      int[] nums = new int[6]; // 당첨번호 6개
      
      for(int i=0;i<nums.length;i++){
         int ran  = (int)(Math.random()*45)+1; // 1~45  (0~44인걸 마지막에 +1해줘서 1~45)      
         nums[i]=ran;  //i=0일때 1 2 3 4 5 비어있다
		 
		 //두번째 (i=1)일때부터 비교 ->nums[0(i)]랑만 비교하면 된다
		 
		 //중복제거 코드 - i가 1일때부터 작동
		 for(int j=0;j<i;j++){  //처음에는 i=0, j=0 이라서 실행안됨.
			 if(nums[j]==nums[i]){ 
				 i--;
				 break;
			}
		}//여기까지가 중복제거 코드
	}
		////여기까지가 nums[0] ~ num[5]까지 각기 다른 숫자들로 채워짐
		//todo 숫자들을 작은순부터 정렬하는 코드
		int min = 0;
		for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i]>nums[j]){ //i=0일때 j는 1 2 3 4 5 까지 다 나옴
					min=j; // 처음 for 돌때 nums[0]이랑 1 2 3 4 5 다 비교
								 // 가장 작은수를 변수 min에 넣기
								 
				}
			}
			int tmp = nums[i];       //nums[i] <=> nums[min] 값바꾸기
			nums[i]= nums[min];		 // 임시로 변수를 만들어서 값을 바꾼다
			nums[min]=tmp;
		}	
		
		for(int i=0;i<nums.length;i++){
         System.out.print(nums[i]+"   ");
		}      
   }
}