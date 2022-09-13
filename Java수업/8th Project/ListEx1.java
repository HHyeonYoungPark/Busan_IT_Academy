import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ListEx1 {
	public static void main(String[] args) {
		List<JButton> ls = new ArrayList<JButton>(); // <> -> 넣을 수 있는 값의 타입은 기본 Object임
		// <>(제네릭) => 특정 타입을 미리 정의해서 그것만 사용하도록 강제함 
		// 			       여러 타입이 들어감으로서 발생할 수 있는 문제를 미연에 방지함
		// 			       타입이 미리 정해지기 때문에 값을 가져와서 (get(index))한 이후 형변환이 필요없음
		//			   E, T, K, V, N - api에서 이렇게 써져 있다
		//			       이것을 넣을 수 있다라는 의미
		//             E - Element = 넣을 요소 
		//             T - Type = 타입
		//             K - key = map에서 사용되는 키
		//             V - Value = map에서 사용되는 값
		//			   N - Number = 숫자
		
//		ls.add("문자"); //0
//		ls.add(10); //1
//		ls.add(11.1); //2
//		ls.add(false); //3
		ls.add(new JButton()); //4
		
		JFrame frame = new JFrame();
		JButton btn = (JButton) ls.get(4);
		frame.add(btn);
		frame.setDefaultCloseOperation(3);
		frame.setSize(100, 100);
		frame.setVisible(true);
	}
}
