package firstproject;

public class ArrayEx3 {
// ���� for�� = for each��
	public static void main(String[] args) {
		// for(�ʱⰪ; ���ǽ�; ������){ }
		// for(�������� �ϳ��� ������ ���� ���� : ���� ����(�迭, �÷���))
		int is[] = {1,2,3,4,5};
		String str[] = {"aa","bb","cc","dd","ee"};
		Student std[] = {new Student(),new Student(),new Student()};
		
		/*for(Student x :std) { //������x, ����x -> ó������ ������ �ڵ����� ����
			System.out.println(x.number);*/
			
		for(int x :is) { //������x, ����x -> ó������ ������ �ڵ����� ����
			System.out.println(x);
		}
		
		
	}
}
