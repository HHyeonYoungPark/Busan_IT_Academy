
class Peolpe {
	public String name;
	public String ssn;
	
	public Peolpe(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}

class Student extends Peolpe{ //People�� ��ӹ޾Ƽ� StudentŬ���� �ȿ� �ִ�
	public int studentNo;
	
	public Student(String sName, String sSsn, int studentNo) {
		super(sName, sSsn); //�� �ڽ��� ��ӹ��� �θ��� ������
		//new People(sName, sSsn); �̰��� ��ӹ��� Ŭ������ �ƴ� ���ο� Ŭ������
		this.studentNo = studentNo;
	}
}

public class StudentExample{
	public static void main(String[] args) {
		Student student = new Student("ȫ�浿","123456-1234567",1);
		System.out.println("�̸� : "+ student.name);
		System.out.println("�ֹι�ȣ : "+ student.ssn);
		System.out.println("�л���ȣ : "+ student.studentNo);
	}
}