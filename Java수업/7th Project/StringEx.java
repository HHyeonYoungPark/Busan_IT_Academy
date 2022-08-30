
public class StringEx {
	public static void main(String[] args) {
		String str = "안녕하세요 안녕하세여";
		int lo = str.indexOf("녕"); // s의 위치를 가져온다
		int lo2 = str.lastIndexOf("녕"); // 녕의 위치를 뒤에서부터 가져옴
										// 하지만 위치는 앞에서부터 센다
		char ch = str.charAt(3); // 3번째 글자를 가져온다
		int len = str.length(); // 전체 글자 개수 => 배열의 크기
		String s1 = str.substring(5); // 글자 자르기 숫자의 의미는 시작번호
		String s2 = str.substring(2,3); // 2번째에서 3번째 잘라서 가져오기
		
		System.out.println(lo);
		System.out.println(lo2);
		System.out.println(ch);
		System.out.println(len);
		System.out.println(s1);
		System.out.println(s2);
		
		String str2 = "  abCdEFghI  ";
		String s3 = str2.toLowerCase(); // 강제 소문자
		String s4 = str2.toUpperCase(); // 강제 대문자
		String s5 = str2.trim(); // 양쪽 공백 제거
		int z = 10;
		String s6 = String.valueOf(z); // 문자로 바꾸기 - 사용x
		String s7 = z+""; // 문자로 바꾸기 앵간하면 이거로 씀
		
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
	}
}
