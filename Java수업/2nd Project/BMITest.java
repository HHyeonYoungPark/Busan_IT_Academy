package secondproject;

class BMI{
	
	void calc(String n, int h, int w) { //메서드는 앞에 반환형,, 반환형 메서드명 - void 뜻은 반환할게 없다. 실행되면 끝
	System.out.println(n +"의 bmi지수는" + w/((h*0.01)*(h*0.01))+" 입니다");
	}
}


public class BMITest {
	public static void main(String[] args) {
		BMI bmi = new BMI();
		bmi.calc("최홍석",176,80); //최홍석의 bmi지수는 xxx입니다.
	}
}
