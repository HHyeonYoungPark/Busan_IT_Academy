import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// 책 570페이지
public class MapEx1 {
	public static void main(String[] args) {
		// map 객체는 순서가 없다 => iterator를 쓸 수 있다
		// set과 다른점은 값에 접근 가능한 key를 가지고 있다
		// 만들때 key, value를 같이 넣어준다
		// 순서가 없지만 key로 언제나 값을 가져올 수 있다
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("넘버1", 1); // (key, value)
		map.put("넘버2", 2);
		map.put("넘버3", 3);
		
		System.out.println(map.get("넘버1")); //key로 get하면 value를 가져옴
		System.out.println();
		
		// 기본으로 반복자를 가지고 있음
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("키: " + entry.getKey());
			System.out.println("값: " + entry.getValue());
		}
		
		for(String key : map.keySet()) { // 키만 다 가져오기
			System.out.println(key);
			System.out.println(map.get(key)); // 키를 이용해서 값 가져오기
		}
		
		for(Integer val : map.values()) { // 값만 다 가져오기
			System.out.println(val);
		}
		
		Iterator<Map.Entry<String, Integer>> entries = map.entrySet().iterator();
		while(entries.hasNext()) {
			Map.Entry<String, Integer> entry = entries.next();
			System.out.println(entry.getKey() +":"+entry.getValue());
		}
	}
}
