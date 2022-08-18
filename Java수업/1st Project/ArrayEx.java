package firstproject;

import java.util.Scanner;

public class ArrayEx {
	int k;
	
	ArrayEx(){ //없으면 하나 만들어줌. 내용을 수정할 일이 있으면 만들면 된다
		k=10; // 생성할때 불러지는 부분이므로 바로 출력은 안되지만 변수,메서드등 사용은 가능하다.
	}
	
	public static void main(String[] args) {
		int[] arr = new int[10]; //new한다 = 생성(construct)한다.
		//배열도 메모리에 올려서 사용해야한다.
		//여기서 arr은 주소를 가진다. 스택에 int arr이 있고 int[10]-힙에 10개짜리 칸이 만들어짐
		
		System.out.println(arr);
		
		//ArrayEx ae = new ArrayEx(); //new 뒤에는 반드시 생성자가 와야한다.
		// ArrayEx(); 이런건 안보인다. 하지만 가상머신이 한개 만들어준다. 생성자=construcor
		
		//Scanner sc =new Scanner(System.in);
		
		int[] i = new int[10];
		i[0]=10; //정수니까 숫자를 넣는다
		i[1]=20;
		
		Scanner[] scs = new Scanner[10];
		scs[0]=new Scanner(System.in); //Scanner라는 클래스이니까 만들어진(new) Scanner를 넣는다.
		scs[1]=new Scanner(System.in); //10개니까 0~9까지 가능
		scs[2]=new Scanner(System.in);
		scs[3]=new Scanner(System.in);
		
		int x = scs[0].nextInt();
		System.out.println(x);
	}
}
