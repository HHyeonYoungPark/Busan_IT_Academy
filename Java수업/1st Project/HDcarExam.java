package firstproject;

public class HDcarExam {
	public static void main(String[] args) {
		
		HDCar myCar = new HDCar(); //인스턴트화-생성(new)
		
			System.out.println(myCar.model);
			System.out.println(myCar.speed); // 처음에 값을 안 줬기 때문에 초기값 0
	}
}
