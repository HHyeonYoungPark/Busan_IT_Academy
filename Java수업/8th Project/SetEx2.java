import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetEx2 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		
		ArrayList<Integer> list  = new ArrayList<>();
		for(int i=0;i<45;i++) {// list의 번호가 0 ~ 44
			list.add(i+1);
		}// list에 값넣기 1~45
		
		for(int i=0;i<10;i++) {
			set.add((int)(Math.random()*45));// 0~44
		}
		Iterator<Integer> iter = set.iterator();
		
		for(int i=0;i<6;i++) {// set에 있는 값의 번호로 list에서  get 하기
			System.out.println(list.get(iter.next()));
		}
		
		
		/*
		for(int i=0;i<10;i++) {
			set.add((int)(Math.random()*44)+1);// 1~45
		}// set에 10개 들어가는게 아님! => 중복이면 1개만 남으므로
		
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		for(int i=0;i<6;i++) {
			System.out.println(iter.next());
		}*/
		
		
		
	}
}
