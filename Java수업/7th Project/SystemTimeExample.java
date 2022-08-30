
public class SystemTimeExample {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis()); //밀리세컨드
		System.out.println(System.nanoTime()); //나노세컨드
		//프로그램이 실행되는 총 얼마나 걸리는가 확인하는 코드 (프로그램 실행 소요 시간)
		
		long time1 = System.nanoTime(); // 시작 시간 읽기
		
		int sum = 0;
		for(int i=1;i<=1000000;i++) {
			sum +=1;
		}
		
		long time2 = System.nanoTime(); // 끝 시간 읽기
		System.out.println("1~1000000까지의 합:"+sum);
		System.out.println("계산에 "+ (time1+time2) +"나노초가 소요되었습니다.");
		
		System.out.println(System.currentTimeMillis());
		System.out.println(System.nanoTime());
	}
}
