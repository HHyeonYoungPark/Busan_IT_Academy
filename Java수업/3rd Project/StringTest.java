
public class StringTest {
	// �����ε� add �޼��� - �޼��� �̸��� ������ ��ȣ ���� �Ű������� ����,Ÿ��,������ �ٸ����ؼ�
	//                 ��������  ���� �̸� �޼��带 �ٸ��� ����ϴ� ��
	String s;
	boolean t;
	int n;
	
	
	void add(String s) {
		this.s = s;
	}
	void add(boolean t) {
		this.t = t;
	}
	void add(int n) {
		this.n = n;
	}

	void showData() {
		System.out.println(s+" "+t+" "+n);
	}
	
	
	public static void main(String args[]){
	    StringTest st = new StringTest();

	    st.add("�ȳ�");
	    st.add(true);
	    st.add(1);
//	    st.add("�氡");
	    st.showData(); // ���: �ȳ� true 1 �氡

	}
}
