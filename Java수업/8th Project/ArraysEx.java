import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysEx {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		Integer[] inte = new Integer[45];
		
		for(int i=0; i<45; i++) {
			list.add((i+1)+"");
			inte[i] = i+1;
		}
		
		List<Integer> list2 = Arrays.asList(inte); //배열을 List로
		// list = 1~45까지의 문자가 들어가 있음
		// list2 = 배열을 리스트로 바꿔서 1~45까지의 숫자가 들어가 있음
		
		Collections.shuffle(list);
		Collections.shuffle(list2);
		// list 안에 값의 순서를 섞는다.
		// => list가 배열로 만들어졌을 경우 배열안의 값을 섞는다
		
		for(int i=0; i<inte.length; i++) {
			System.out.println(inte[i]);
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		// 리스트에 순서대로 값 집어넣고
		// Collection.shuffle(리스트)
		// 값들의 순서가 섞인다
		// 앞에서 6개만 가져오면 로또번호
		
		// 숫자정렬
		//Collection.sort(list); //자동정렬로 값 맞춰줌
		
		// 실제로또코드
		ArrayList<String> list3 = new ArrayList<>(); //리스트만들기
		for(int i=0; i<45; i++) { //값 집어넣기
			list.add((i+1)+"");
		}

		Collections.shuffle(list3); //순서섞기
		
		for(int i=0; i<6; i++) { //값 집어넣기
			list.get(i);
		}
	}
}
