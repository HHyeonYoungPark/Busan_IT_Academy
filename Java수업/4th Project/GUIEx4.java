import javax.swing.JButton;
import javax.swing.JFrame;

//null - ���뷹�̾ƿ�
public class GUIEx4 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x ������ ��¥ ����
		f.setLayout(null); // �⺻ ���̾ƿ��� ���ֹ���
		
		JButton btn = new JButton("��ư");
		f.add(btn);
		btn.setSize(70, 50); // ������� ��ġ�� ���� ��������� �Ѵ�
		btn.setLocation(10, 10); // x,y ��ǥ��
		
		
		f.setSize(300, 200);
		f.setVisible(true);		
	}
}
