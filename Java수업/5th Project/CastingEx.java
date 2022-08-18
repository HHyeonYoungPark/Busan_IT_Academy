interface Tire{ void printInfo();}

class Kumho implements Tire{

	@Override
	public void printInfo() { }
	public void setKumho() { }
}

class Hankook implements Tire{

	@Override
	public void printInfo() { }
	public void setHankook() { }
}

class Michelin extends Hankook{
	void setMichelin() { }
}

public class CastingEx {
	public static void main(String[] args) {
		Hankook h = new Hankook();
		h.setHankook();
		Kumho k = new Kumho();
		k.setKumho();
		
		Tire t1 = new Hankook();
		//t1.setHankook(); //되지않음.
		
		Tire t2 = new Kumho();
		Kumho k2 = (Kumho) t2;
		k2.setKumho(); // 상속에서 했던거, k2를 따라가보면 제일 처음에 만들어진 것이 Kumho이므로 
					   // 실제로 k2는 new Kumho();이다.
		
		Tire t3 = new Tire() {			
			@Override
			public void printInfo() {}
		};
		Kumho k3 = (Kumho) t3; // 문법적으로 문제는 없지만 실체는 Tire여서 Kumho로 형변환이 안됨
		k3.setKumho(); //에러발생 , t2는 Kumho / t3는 Tire, Kumho로 형변환하더라도 Tire이기 때문에 Kumho의 메서드를 쓸수없다
		
		
		Hankook m = new Michelin();
		//m.setMichelin(); // 상속일때도 당연히 안됨
	}
}
