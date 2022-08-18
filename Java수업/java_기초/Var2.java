class Var2{
	 public static void main(String args[]){
		 int i =100;
		 int j =200;
		 int sum = i +j;
		 //자바에서는 = 한개는 오른쪽 값을 왼쪽에 담는다는 뜻
		 //== 2개일 경우 같다는 뜻.
		 
		 System.out.println(sum); // ""를 쓰면 문자 그대로가 출력 되므로 숫자로 취급하여 ""없이 sum만 쓴다.
		 
		 char c = 'a';// 한글자는 홑따옴표임! 여러글자는 쌍따옴표!
		 char d = 'b';
		 int sum2 = c+d; //문자를 숫자로 자동으로 바꿔 계산됨 = 형변환
		 System.out.println(sum2);
		 
		 System.out.println((int)'A'); //형변환 => type 변환
		 
		 int a = 10;
		 double b = 5.7;
		 System.out.println(a+b);// int와 double을 더하면 double 타입
		 System.out.println((int)(a+b)); // 소수점 이하는 무조건 버림.
		 System.out.println((double)a); // 강제로 소수점을 붙임.
		 
	 }
}
