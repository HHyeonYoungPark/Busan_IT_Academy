import javax.swing.JFrame;

public class ExtendsEx2 extends JFrame{ //JFrame�� ���������� ����ִ�. ����� �޾ұ⶧����
	public ExtendsEx2() {
		this.setSize(300, 300); // �θ� ������ �ִ� �޼���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// �θ� ������ �ִ� �޼���
		this.setVisible(true);// �θ� ������ �ִ� �޼���
	}
	
	public void setSize(int w, int h) { // �θ� ������ �ִ°Ͱ� ���� �̸��� �� �޼���
		// �θ��� �޼��尡 ������ �ȵ�� �Ȱ��� ���� �ٲٰ� ���� ������ �ٲٸ�ȴ�.
		// �������̵� - ������ �ٲ�����°�
	}
	
	
	public void printSize() { //���� ����  �޼���
		System.out.println(this.getSize());
	}
	
	
	public static void main(String[] args) {
		ExtendsEx2 ee = new ExtendsEx2();
	}
}
