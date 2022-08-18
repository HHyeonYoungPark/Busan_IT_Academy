class ArrayEx{
	// 1.배열 -> 2.collection
	// 배열은 변수의 묶음이다.
	// 배열은 미리 공간을 만들어야 한다.(몇개짜리 묶음인가?)
	// 배열은 변수+[숫자] 형태로 만들어진다. ex) book[1]  ==book1과 같은 느낌
	// 배열의 시작은 0부터이고 배열의 전체 크기는 "배열이름.length"로 확인가능
	//                                  book.length(o), book[1].length (x)
	// 배열을 만들때는 type 배열명[] = new type[개수];
	//           ex) int arr[] = new int[10]; // 10개짜리 변수묶음
	// 또는 미리 값을 넣어도 된다. int arr2[] = {1,2,3,4,5}; //미리 1~5까지 가지고 있는 배열
	//                      당연히 이것의 length는 5이다.
	
	public static void main(String args[]){
		/*
		String book1 = "노인과 바다";
		String book2 = "오만과 편견";
		String book3 = "데미안";
		
		//도서관에 있는 모든 책을 출력해보쟈
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
		*/
		int size=7;
		
		String book[] = new String[size];  //7이기때문에 번호는 0 1 2 3 4 5 6 의 번호를 가진다
		book[0]="노인과 바다";
		book[1]="오만과 편견";
		book[2]="달과 6펜스";
		book[3]="데미안";
		book[4]="장발장";
		book[5]="60일간의 세계일주";
		book[6]="인간 관계론";
		
		for(int i=0;i<book.length;i++){ //0 1 2 3 4 5 6 
			System.out.println(book[i]);
		}	
	}
}