package secondproject;

public class CarEx {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("그랜저");
		Car car3 = new Car("그랜저","흰색");
		Car car4 = new Car("그랜저","흰색",200);
		
		System.out.println(car1.name+" "+car1.color+" "+car1.price);
		System.out.println(car2.name+" "+car2.color+" "+car2.price);
		System.out.println(car3.name+" "+car3.color+" "+car3.price);
		System.out.println(car4.name+" "+car4.color+" "+car4.price);
	}
}
