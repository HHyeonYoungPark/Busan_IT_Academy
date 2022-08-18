package secondproject;

class Bonus{
	int income;
	double bonus;
	
	
	void setIncome(int i) {
		income = i;
	}
	
	void setBonus(int b) {
		bonus = b*0.01;
	}
	
	void calculate() { // 받아온 i,b 를 여기서 사용해야 한다.
		System.out.println("연봉은 "+income+", 보너스는"+(bonus*100)+"%, "+(income*bonus)+"입니다.");
	}
}


public class BonusTest {
	public static void main(String[] args) {
		// 3개 만들기
		// 보너스가 몇프로인지 입력(10) <- 10퍼
		// 보너스 세팅하는 메서드 1개
			
		// 연봉 세팅하는 메서드 1개(5000)
		
		// 연봉, 연봉기준 보너스 출력하는 메서드() <- 괄호 안에 내용이 필요없다
		
		Bonus m = new Bonus();
//		System.out.println("연봉을 입력");
		m.setIncome(6000); // 연봉을 입력
//		System.out.println("보너스 %를 입력");
		m.setBonus(10); // 보너스 퍼센트를 입력
		
//		System.out.println("결과보기");
		m.calculate(); // 위의 입력한 내용을 토대로 결과출력
	}
}
