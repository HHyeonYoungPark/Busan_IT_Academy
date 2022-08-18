package firstproject;

public class ValiableEx { // 클래스
	int k=100; //클래스에도 변수를 쓸수있다. 클래스변수는 클래스의 소속{}이다. 이 변수는 이 클래스 내부에 모두 사용가능하다.(전역변수이다) 
	String str= "헬로";
	
	public static void main(String[] args) { // 메서드(기능) - 이 메서드도 클래스 소속이다.
		//System.out.println(k); //사용가능하다. 다만 그냥 사용은 안됨. -> 메모리에 올려서 사용해야 한다.
	
		
		int i =10; // 메서드에 포함된 변수이다. 메서드 영역은 {} 사이이다. 이 변수는 이 메서드 내부에서만 사용가능하다.
		int j =10;
		System.out.println(i==j);
		
		String str1= "안녕";
		String str2= new String("안녕"); // new -> 새로 메모리에 만들어라,,
		System.out.println(str1+":"+str2);
		System.out.println(str1==str2);
		
		String str3=str2; //str2의 값을 str3에 넣은게 아닌!! 주소를 복사해 줬기 때문에 true
		System.out.println(str2==str3);
		
		String str4="안녕"; // String 만 이렇다
		System.out.println(str1==str4);
		
		//== 스택비교   ,    .equals() 값비교
		System.out.println(str1.equals(str2)); // 레퍼런스 타입 비교
		//System.out.println(i.equals(j)); // 기본 타입은 비교가 안됨
	}
}