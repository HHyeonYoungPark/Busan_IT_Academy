import java.util.HashSet;
import java.util.Iterator;

public class SetEx1 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("안녕");
		set.add("안농");
		set.add("안넝");
		set.add(null); //중복은 허용하지 않고 덮어쓰기 되지만 null도 값으로 취급함 
		
		// 값이 있는지 없는지 true, false로 알려줌
		System.out.println(set.contains("하잉"));
		
		// 반복자 - iterator
		// 값이 있는가 확인함 - hasNext 값이 있으면 가져오고 계속 다음으로 넘어감
		// 있으면 커서처럼 하나 가져오기 - next
		
		Iterator<String> iter = set.iterator(); //set에 반복자 붙이기
		while(iter.hasNext()) { // 값이 있을때까지 하나씩 체크하기
			System.out.println(iter.next()); // 값 가져오기
		}// 순서가 없으므로 넣은 순서와 상관없이 하나씩 다 가져온다.
	}
}
