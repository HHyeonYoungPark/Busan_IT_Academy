package secondproject;

public class MethodEx6 {
	char charAt(String s, int i){
//		String[] sarr = s.split(""); // 한글자씩 잘라서 배열로 만드는 메서드
		char[] carr = s.toCharArray(); //문자열을 배열로 만들기
		
		return carr[i];
	}
	
	
	public static void main(String[] args) {
		MethodEx6 me = new MethodEx6();
		char a = me.charAt("abcde",1);
		
		System.out.println(a);
		//원래라면 me <- 문자열이여야 한다.
	}
}
