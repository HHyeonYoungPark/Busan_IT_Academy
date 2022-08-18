class Operator{
	/* 
	    전부 주석
		연산자 = 기본 사칙연산 +a
		+,-,*,/,%
	*/
	public static void main(String args[]){	
	int i = 10;
	int j = 3;
	
	
	// 삼(3)항 연산자
	// (조건) ? 참 : 거짓
	//System.out.println(i%j?"참":"거짓");


	// =이 하나면 대입연산자(오른쪽 수를 왼쪽에 넣음), ==이면 비교연산자(양쪽 값이 같음)
	//System.out.println(10 == 20); // false
	//System.out.println(10 != 20); // true
	
	
	/*
	System.out.println(i > j);
	System.out.println(i < j);
	System.out.println(i >= j); //같다는 항상 뒤에 붙음
	System.out.println(i <= j);
	
	
	// and (&&)
	//그리고이며 양쪽 다 true일때만 결과가 트루
	System.out.println((10>2) && (5>2)); //true
	System.out.println(true && true); //false
	System.out.println((10<2) && (5<2)); //true
	System.out.println(true && false); //false
	// or (||) 
	//또는 으로 양쪽중 한쪽만 true면 결과가 트루
	System.out.println((10>2) || (5>2)); //true
	System.out.println(true || true); //true
	System.out.println((10>2) || (5<2)); //true
	System.out.println(true || false); //true
	*/
	
	
	/*
	i = i+2; 밑내용으로 줄여 쓸 수 있음
	i+=2; // 위와 동일
	i-=2;
	i*=2;
	i/=2;
	i%=2; 
	*/
	
	/*
	System.out.println("+ : "+(i+j));
	System.out.println("- : "+(i-j));
	System.out.println("* : "+(i*j));
	System.out.println("/ : "+(i/j)); // 나누기(나머지는 표시안됨)
	System.out.println("% : "+(i%j)); // 나눈 나머지 -> mod라고도 함
	*/
	
	
	System.out.println(i++); // i = i+1; //출력먼저! 이후에 +1해줌
	System.out.println(i);
	
	System.out.println(++i); // 일단 +1부터함 ++가 앞에 붙냐 뒤에 붙냐 차이에 따라 달라짐
	
	
	
	i++;
	System.out.println("%++ : "+i); // i = i+1
	j--;
	System.out.println("% : "+j);   // j = j+1
	
	
	}
}