package secondproject;

public class MethodEx5 {
	public static void main(String[] args) {
		String str = "aabcdefg";
		String str2 = new String("aabcdefg");
		//위의 둘은 같다.
		
		char c = str.charAt(0); //문법적으로 문제가 없음
		//char c2 = str.charAt(100); //api를 보면서 설명을 읽는다면
		                           // 이 메서드가 하는일, 매개변수(100)의 의미를 알 수 있다.
		
		int i = str.indexOf("d"); //d가 몇번쨰에 있는가?
		
		System.out.println(c);
		//System.out.println(c2);
	}
}
