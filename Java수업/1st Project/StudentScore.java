package firstproject;

import java.util.Scanner;

public class StudentScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���?");
		int count = sc.nextInt();
		
		Student s[]; //������
		s= new Student[count];
		//s[0]=new Student();
		//s[1]=new Student();
		//s[2]=new Student();
		
		for(int i=0;i<count;i++) {
			s[i] = new Student();
			
			System.out.println("�й��� �Է��ϼ���");
			s[i].idx = sc.nextInt();
			System.out.println("�̸��� �Է��ϼ���");
			s[i].name = sc.next();
			System.out.println("���� ������ �Է��ϼ���");
			s[i].korean = sc.nextInt();
			System.out.println("���� ������ �Է��ϼ���");
			s[i].english = sc.nextInt();
			System.out.println("���� ������ �Է��ϼ���");
			s[i].math = sc.nextInt();
		}
		int total = 0;
		for(int i=0;i<count;i++) {
			
			total = s[i].korean+s[i].english+s[i].math;
			
			System.out.println("�й�:"+s[i].idx+
					" �̸�:"+s[i].name+ 
					"  ����:"+s[i].korean+
					" ����:"+s[i].english+ 
					" ����:"+s[i].math+
					" ������:"+total+
					" ���:" +total/count);
			
		}
		
		
		
/*		s[0]=new Student();
		s[0].idx=1;
		s[0].number= 01;
	    s[0].name = "��";
		s[0].korean = 90;
		s[0].english = 90;
		s[0].math = 80;
		
		s[1]=new Student();
		s[1].idx=2;
		s[1].number= 02;
	    s[1].name = "��";
		s[1].korean = 100;
		s[1].english = 90;
		s[1].math = 70;
		
		s[2]=new Student();
		s[2].idx=3;
		s[2].number= 03;
	    s[2].name = "��";
		s[2].korean = 60;
		s[2].english = 50;
		s[2].math = 100;*/

				
		
	}
}
