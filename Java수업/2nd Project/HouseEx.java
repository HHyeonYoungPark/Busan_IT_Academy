package secondproject;

public class HouseEx {
	public static void main(String[] args) {
		House he1 = new House();
		House he2 = new House("나무");
		House he3 = new House("나무",2); // 2는 층
	
		System.out.println(he1.mete+" "+he1.floor);
		System.out.println(he2.mete+" "+he2.floor);
		System.out.println(he3.mete+" "+he3.floor);
	}
	
}
