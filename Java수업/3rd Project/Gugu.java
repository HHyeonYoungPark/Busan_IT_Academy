
public class Gugu {
	int dan;
	int num;
	
	void setNum(int i, int j) {
		dan=i;
		num=j;
	}
	void showData() {
		for(int j=1;j<=num;j++) {
			System.out.println(dan+"x"+j+"="+(j*dan));
		}
	}
	
	
	public static void main(String[] args) {
		Gugu g = new Gugu();
		g.setNum(2,5); //2단을 x5까지
		g.showData();
	}
	// 2x1 = 2
	// ...
	// 2x5 = 10
}
