import javax.swing.JButton;
import javax.swing.JFrame;

//BorderLayout

public class GUIEx1 {
	public static void main(String[] args) {
		JFrame f = new JFrame(); // â�� �������
		f.setSize(300, 200); // â�� ����� â�̸� f�ȿ� �ִ� ���� �޼������ ��밡���ϴ�
							 // �� �޼������ ��κ� f�� ����, ������ �ְų� �������� ��ɵ��̴�
		
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		JButton btn3 = new JButton("��ư3");
		JButton btn4 = new JButton("��ư4");
		JButton btn5 = new JButton();
		btn5.setText("��ư5"); // text�� �ִ� �޼��嵵 �ִ�
		
		f.add(btn1, "North"); // ��ġ�� ��������
		f.add(btn2, "East");
		f.add(btn3, "West");
		f.add(btn4, "South");
		f.add(btn5, "Center"); // �Ƚᵵ �⺻�� center
		
		
		f.setVisible(true); // ȭ�鿡 ������
	}
}

/*
-���̾ƿ�
BorderLayout - JFrame

FlowLayout

GridLayout

null - ���� ���̾ƿ�
*/