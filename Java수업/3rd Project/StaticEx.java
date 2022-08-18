class Static{
	static int i; // static -> 정적 - 이 값은 무조건 1개만 만들어진다.
	int j;        // 이 클래스로 생성된 모든 인스턴스는 static 값을 공유한다.
				  // static은 new 하지 않아도 사용가능하다. 실행과 동시에 메모리에 올라간다.
}

public class StaticEx {
	public static void main(String[] args) {
		Static s1 = new Static();
		s1.i++; // 1증가 시켜라
		s1.j++; // 1증가 시켜라
		System.out.println(s1.i+":"+s1.j);
		
		Static s2 = new Static();
		s2.i++; // 1증가 시켜라
		s2.j++; // 1증가 시켜라
		System.out.println(s2.i+":"+s2.j);
	}
}
