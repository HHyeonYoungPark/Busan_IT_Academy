import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEvent {
	public static void main(String[] args) { // ���� => ��� �ȴ�.
		JFrame frame = new JFrame(); // ������ �����ϴ� ������ ���� ��
		frame.setLayout(new FlowLayout()); // �ٸ� ������ �����ҰŸ� �ʿ���� �κ�
		frame.setSize(500,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		frame.add(btn1);
		frame.add(btn2);
		frame.setVisible(true);
		
		// �������̽��� �����Ϸ��� ������ ���ÿ� ������ �ۼ��ؾ� �Ѵ�.
		ActionListener listner = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn1) {
					System.out.println("��ư1");
				}else if(e.getSource()==btn2) {
					System.out.println("��ư2");
				}
			}
		};
		btn1.addActionListener(listner); //��ư�� �׼� ���̱�
		btn2.addActionListener(listner);
	}
}
