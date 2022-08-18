package firstproject;

public class ArrayEx3 {
// 향상된 for문 = for each문
	public static void main(String[] args) {
		// for(초기값; 조건식; 증감식){ }
		// for(묶음에서 하나를 뺐을때 담을 변수 : 값의 묶음(배열, 컬렉션))
		int is[] = {1,2,3,4,5};
		String str[] = {"aa","bb","cc","dd","ee"};
		Student std[] = {new Student(),new Student(),new Student()};
		
		/*for(Student x :std) { //증감식x, 조건x -> 처음부터 끝까지 자동으로 해줌
			System.out.println(x.number);*/
			
		for(int x :is) { //증감식x, 조건x -> 처음부터 끝까지 자동으로 해줌
			System.out.println(x);
		}
		
		
	}
}
