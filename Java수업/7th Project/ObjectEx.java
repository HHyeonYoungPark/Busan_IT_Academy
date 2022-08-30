
public class ObjectEx {
	int i,j;
	
	void setInt(int i, int j) {
		this.i=i;
		this.j=j;
	}
	
	@Override
	public String toString() { // 이 클래스를 생성한 후 그 변수를 출력하면 실행됨
		// 필요한 내용을 작성해서 return에 주면 된다
		return i+":"+j;
	}
	
	public static void main(String[] args) {
		ObjectEx oe = new ObjectEx();
		oe.setInt(10, 5);
		System.out.println(oe); // 객체 자체를 출력하면 toString()메서드가 실행됨
		
		//String res = oe.toString();
		//System.out.println(res); //기본 기능으로 주소값이 출력됨 - 쓸일x
	}
}
