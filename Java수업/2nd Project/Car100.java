package secondproject;

class Wheels{
	int size;
	Wheels(int size){
		this.size = size;
	}
}

class Transmission{
	String m;
	Transmission(String m){
		this.m = m;
	}
}


public class Car100 {
	String name;
	Engine e;
	Wheels w;
	Transmission m;
	
	public Car100(String name, Engine e, Wheels w, Transmission m){
		this.name = name;
		this.e = e;
		this.w = w;
		this.m = m;
		
	}
	public static void main(String[] args) {
		Engine ee = new Engine(3000);
		Wheels ww = new Wheels(20);
		Transmission mm = new Transmission("dct");
		Car100 car = new Car100(ee, ww, mm,"Ghibli");
		
		System.out.println(car.e.cc);
		System.out.println(car.w.size);
		System.out.println(car.m.m);
		System.out.println(car.name);
	}
	
	
}
