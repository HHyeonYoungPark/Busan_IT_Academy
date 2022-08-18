class Var{
	public static void main(String[] args){
		// 변수 = 변하는 수 = 변하는 값을 담는 상자
		// 상수 = 절대로 변하지 않는 수
		
		int    박스1 = 2147483647;
		long box1 = 2147483649L; //long 사용 시 숫자 뒤 L이나 l을 붙여줘야 에러없음.
		float  박스2 = 5.0F;
		double box2 =5.3;
		char   박스3 = 'A';//문자 1개
		char   박스X = '한';// 순수하게 byte 단위 무시하고 한 글자
		String 박스4 = "안녕";//문자 열
		boolean box5 = true;// false; => 1/0
		
		
		System.out.println(box1);
		System.out.println(box2);
		
	}
}

//1바이트는 한글자(영분 1글자), 한글은 한글자가 2byte
//A => 1바이트
//김 => 2바이트