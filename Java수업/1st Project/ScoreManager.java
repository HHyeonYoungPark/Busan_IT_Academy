package firstproject;

import java.util.Scanner;

public class ScoreManager {
	Student[] std; // 클래스 변수
	// 클래스 변수는 이 변수를 가지고 있는 클래스가 생성되어야만 사용가능하다.
	// -> std를 사용하기 위해서는 ScoreManager를 생성(new) 해야 사용가능하다.
	// 만약에 메서드(main) 안에서 정의한다면 (Student[] std;)-> new ScoreManager를 안해도 된다
	
	public static void main(String[] args) {
		//Student[] std2; // 에러없음
		//std2 = new Student[100]; // 에러없음 - main안에서 사용가능
		//std = new Student[100]; // 이건 에러발생 - 클래스 변수라서- 이 클래스 전체에서 사용가능
		
		ScoreManager sm = new ScoreManager();
		// ScoreManager 클래스가 메모리에 올라갔다 - 사용가능하다.
		//std = new Student[3]; // std는 메모리에 올라가 있지 않은 문자일 뿐이다.
		
		sm.std = new Student[3]; 
		/*위의 내용과 밑의 내용은 같은 말이다 - 배열은 변수(값이 없는 상태) 선언과 같다.
		Student std0;
		Student std1;
		Student std2;*/
		
/*		sm.std[0] = new Student(); // Student가 3개 메모리에 올라가있다.
		sm.std[1] = new Student(); // 3개 다 사용가능하다.
		sm.std[2] = new Student(); // 각 Student는 따로 각 값을 가진다.
		
		sm.std[0].number=1;
		sm.std[0].name="kim";
		sm.std[0].korean=100;
		sm.std[0].english=100;
		sm.std[0].math=90;*/
		//위의 내용을 반복문으로 변경

		for(int i=0;i<3;i++) {
			sm.std[i] = new Student(); // 3번 반복된다, 리셋?
		}
		
		for(int i=0;i<3;i++){
			Scanner sc = new Scanner(System.in);
			System.out.println("번호를 입력하쇼");
			sm.std[i].number = sc.nextInt();
			System.out.println("이름를 입력하쇼");
			sm.std[i].name = sc.next();  //sc.nextLine(); 이랑 뭐가 다른지..?
			System.out.println("국어점수를 입력하쇼");
			sm.std[i].korean = sc.nextInt();
			System.out.println("영어점수를 입력하쇼");
			sm.std[i].english = sc.nextInt();
			System.out.println("수학를 입력하쇼");
			sm.std[i].math = sc.nextInt();
		} //모든 입력이 끝남. std[0],std[1],std[2]에는 값이 다 들어갔다
		
		for(int i=0;i<3;i++) {
			System.out.println(sm.std[i].number);
			System.out.println(sm.std[i].name);
			System.out.println(sm.std[i].korean);
			System.out.println(sm.std[i].english);
			System.out.println(sm.std[i].math);
			System.out.println(sm.std[i].korean+sm.std[0].english+sm.std[0].math);
			System.out.println((sm.std[i].korean+sm.std[0].english+sm.std[0].math)/3);
		}
		
		
		
		
		
		
		
	}
}
