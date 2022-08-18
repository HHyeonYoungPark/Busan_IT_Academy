
class Peolpe {
	public String name;
	public String ssn;
	
	public Peolpe(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}

class Student extends Peolpe{ //People을 상속받아서 Student클래스 안에 있닿
	public int studentNo;
	
	public Student(String sName, String sSsn, int studentNo) {
		super(sName, sSsn); //내 자신이 상속받은 부모의 생성자
		//new People(sName, sSsn); 이것은 상속받은 클래스가 아닌 새로운 클래스임
		this.studentNo = studentNo;
	}
}

public class StudentExample{
	public static void main(String[] args) {
		Student student = new Student("홍길동","123456-1234567",1);
		System.out.println("이름 : "+ student.name);
		System.out.println("주민번호 : "+ student.ssn);
		System.out.println("학생번호 : "+ student.studentNo);
	}
}