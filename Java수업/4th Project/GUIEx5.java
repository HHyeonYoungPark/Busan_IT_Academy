import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//JPanel
public class GUIEx5 {
	public static void main(String[] args) {
		JFrame f = new JFrame(); // �⺻������ BorderLayout
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x ������ ��¥ ����
		f.setSize(500, 400);
		
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		
		JPanel pnl = new JPanel(); // JFrame�� ����� ���� ������Ʈ
		// ���� ������ �����̳�(���⿡ ������ add �����ϴ�)
		// �ܵ����� ����� �ȵǹǷ� �ᱹ�� JFrame�� �ٿ��� ��밡���ϴ�
				
		pnl.add(btn1);
		pnl.add(btn2);
		f.add(pnl, "South");
		f.setVisible(true);
	}
}
