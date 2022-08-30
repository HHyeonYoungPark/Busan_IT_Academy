import java.util.Random;

public class MathEx { // 산수 + 수학에 관련된 메서드 모음
	public static void main(String[] args) {
		// 실제 수학 공식에 가까운 메서드들이라서 new로 사용하는 경우는 많지 않고
		// 대부분 static 메서드다. = new가 필요없다
		System.out.println(Math.abs(-10)); // 절대값을 찍었으니까 -10을 입력했어도 무조건 양수가 나옴
		
		double r = Math.random(); // Random 클래스가 있지만 이것을 쓰는 이유는 간단해서
		System.out.println(r); // r >= 0, r < 1 인 값이 랜덤으로 나옴
		
		// 1~10 사이의 랜덤
		int random = (int)(Math.random()*10)+1; // int로 형변환시 소수점 이하 숫자는 강제로 잘림
		// 10까지 나오게하려면 뒤에 +1을 해줌
		System.out.println(random);
		
//		0.0000 => 0
//		0.1000 => 1.000
//		   .
//		   .
//		0.9000 => 9.000  
		
		
		Random ran = new Random();
		int ir = ran.nextInt(3);
		double dr = ran.nextDouble();
		
		System.out.println(ir);
		System.out.println(dr);
	}
}
