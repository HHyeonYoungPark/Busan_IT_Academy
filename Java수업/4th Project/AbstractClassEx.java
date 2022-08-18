abstract class Animal{
	public void moving() {
		System.out.println("움직인다.");
	}
	public abstract void sound(); //추상 메서드
	// 동물은 움직인다는 기능은 다 가지고 있고, 소리도 다 가지고 있지만
	// 소리는 다 다르므로 이 클래스를 사용하면 sound()클래스를 무조건 만들어서 사용해야 하게 함.
} //abstract - 반완성클래스


public class AbstractClassEx {
	public static void main(String[] args) {
		Animal ani = new Animal() { // 추상클래스는 생성시, 상속시 반드시 빈 메서드를 구현해야 함
			// 구현 == {} <-중괄호 부호가 있으면 됨. 문법적으로 내용은 중요X
			
			@Override
			public void sound() { System.out.println("멍"); }
		};
		ani.moving(); // 일반메서드
		ani.sound(); // 추상메서드 == 완성되지 않은 메서드
		// 사용시 완성시켜줘야 함.
	}
	
	
}

// 추상클래스 - 일반클래스에 추상 메서드를 포함하고 있는 것.
// 일반클래스 + 완성되지 않은 메서드를 한개라도 포함하고 있는 것.
// 완성되지 않은 클래스는 body( {} )가 없는 것.
// ex))  void plus();  <== 추상 메서드
// 공통된 특성을 추출해서 메서드를 뽑아놓은 것.
// 사용할 때 반드시 오버라이드 해줘야 함.
// 이 클래스를 상속받으려면 반드시 완성해서 사용할 수 있도록 강제함.
// 추상클래스라는 의미로 abstract 라는 예약어를 사용함.
