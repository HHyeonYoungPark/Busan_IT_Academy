import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// ��ư�� ������ ������ �ٲ�� �غ���
// JPanel�� �̿��ϰų� getContentPane�� �̿��غ���
public class WindowListner extends JFrame implements ActionListener{
	JButton btn1, btn2, btn3;
	
	WindowListner(){
		this.setSize(500, 300);
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.RED); //getContentPane�� �̿�
		 btn1 = new JButton("��ư1");
		 btn2 = new JButton("��ư2");
		 btn3 = new JButton("��ư3");
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		this.setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== btn1) {
			this.setBackground(Color.RED);
		}else if(e.getSource()== btn2) {
			this.setBackground(Color.BLUE);
		}else if(e.getSource()== btn3){
			this.setBackground(Color.GREEN);
		}
		
	}
	
	public static void main(String[] args) {
		new WindowListner();// �����ڸ� ȣ���Ѵ�.
	}

}
