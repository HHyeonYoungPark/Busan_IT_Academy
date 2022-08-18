class ForEx9{	
	/* 별 차려대로 출력하기
	*
	**
	***
	****
	*****
	*/
	
	public static void main(String args[]){
    
      for(int i=0;i<5;i++){// 0 1 2 3 4
         for(int j=0;j<=i;j++){// 0(j)<=0(i)
            System.out.print("*");
         }
         System.out.println();
      }
      
	  
      System.out.println("===================");
      for(int i=5;i>0;i--){//5 4 3 2 1 
         for(int j=0;j<i;j++){//j=0 i=5, j=0,i=4
            System.out.print("*");
         }
         System.out.println();
      }
      
  
      System.out.println("===================");
      for(int i=5;i>0;i--){// i= 5 4 3 2 1
         
         for(int j=0;j<i-1;j++){ // 0~4,3 2 1
            System.out.print(" ");
         }
         
         for(int k=5;k>=i;k--){//i=5, k의 반복회수=1, i=4 k의 반복회수=2
            System.out.print("*");
         }
         System.out.println();
      }
      
        
      System.out.println("===================");
      for(int i=0;i<5;i++){//0 1 2 3 4
       
         for(int j=0;j<i;j++){// x,1,2,3,4 
            System.out.print(" ");
         }
         for(int k=5;k>i;k--){// i=0 k=5,4,3,2,1
            System.out.print("*");
         }
         System.out.println();
      }      
      
   
      System.out.println("===================");
      
      for (int i = 0; i < 5; i++){// 0 1 2 3 4
         
         for (int j=i; j <= 5-1; j++) {// 0 1 2 3 4
            System.out.print(" ");// 1 2 3 4
                             // 2 3 4
         }
         for (int k = 0; k <=(i*2); k++) {// i*2 = 0 => 1
            System.out.print("*");       // i(1)*2 = 2 =>3
         }                        // // i(2)*2 = 4 =>0~ => 5
         System.out.println();
      }
   }
}