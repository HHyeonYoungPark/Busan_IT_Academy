package firstproject;

import java.util.Scanner;

public class ScoreManager {
	Student[] std; // Ŭ���� ����
	// Ŭ���� ������ �� ������ ������ �ִ� Ŭ������ �����Ǿ�߸� ��밡���ϴ�.
	// -> std�� ����ϱ� ���ؼ��� ScoreManager�� ����(new) �ؾ� ��밡���ϴ�.
	// ���࿡ �޼���(main) �ȿ��� �����Ѵٸ� (Student[] std;)-> new ScoreManager�� ���ص� �ȴ�
	
	public static void main(String[] args) {
		//Student[] std2; // ��������
		//std2 = new Student[100]; // �������� - main�ȿ��� ��밡��
		//std = new Student[100]; // �̰� �����߻� - Ŭ���� ������- �� Ŭ���� ��ü���� ��밡��
		
		ScoreManager sm = new ScoreManager();
		// ScoreManager Ŭ������ �޸𸮿� �ö󰬴� - ��밡���ϴ�.
		//std = new Student[3]; // std�� �޸𸮿� �ö� ���� ���� ������ ���̴�.
		
		sm.std = new Student[3]; 
		/*���� ����� ���� ������ ���� ���̴� - �迭�� ����(���� ���� ����) ����� ����.
		Student std0;
		Student std1;
		Student std2;*/
		
/*		sm.std[0] = new Student(); // Student�� 3�� �޸𸮿� �ö��ִ�.
		sm.std[1] = new Student(); // 3�� �� ��밡���ϴ�.
		sm.std[2] = new Student(); // �� Student�� ���� �� ���� ������.
		
		sm.std[0].number=1;
		sm.std[0].name="kim";
		sm.std[0].korean=100;
		sm.std[0].english=100;
		sm.std[0].math=90;*/
		//���� ������ �ݺ������� ����

		for(int i=0;i<3;i++) {
			sm.std[i] = new Student(); // 3�� �ݺ��ȴ�, ����?
		}
		
		for(int i=0;i<3;i++){
			Scanner sc = new Scanner(System.in);
			System.out.println("��ȣ�� �Է��ϼ�");
			sm.std[i].number = sc.nextInt();
			System.out.println("�̸��� �Է��ϼ�");
			sm.std[i].name = sc.next();  //sc.nextLine(); �̶� ���� �ٸ���..?
			System.out.println("���������� �Է��ϼ�");
			sm.std[i].korean = sc.nextInt();
			System.out.println("���������� �Է��ϼ�");
			sm.std[i].english = sc.nextInt();
			System.out.println("���и� �Է��ϼ�");
			sm.std[i].math = sc.nextInt();
		} //��� �Է��� ����. std[0],std[1],std[2]���� ���� �� ����
		
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
