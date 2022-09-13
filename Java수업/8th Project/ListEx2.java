import java.util.ArrayList;

import javax.swing.JPanel;

public class ListEx2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(2);
		list.add(1);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("1번째 값 지우기");
		list.remove(1); //값지우기
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list.get(0));
		System.out.println(list.get(1)); // remove로 [1]을 지웠기때문에 [2]번째가 [1]로 온다
		// list에서 remove로 지우면 지운 번호 뒤에 값이 하나씩 index가 당겨진다.
		
		
		
		// 배열방식1
		MyPanel[] mps = new MyPanel[3];
		mps[0] = new MyPanel();
		mps[1] = new MyPanel();
		mps[2] = new MyPanel();
		
		// 배열방식2
		ArrayList<MyPanel> list2 = new ArrayList<>();
		list2.add(new MyPanel()); //자동으로 0번에
		list2.add(new MyPanel()); //자동으로 1번에
		list2.add(new MyPanel()); //자동으로 2번에 들어감
		
		// 컬렉션을 사용하면 배열에 대비하여 특정변수(mps[0])처럼 따로 변수에 값을 넣는 작업이 필요없다
	}
}

class MyPanel extends JPanel{}

