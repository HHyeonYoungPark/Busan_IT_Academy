import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class JDialogEx2 extends JFrame implements ActionListener{
	JLabel lbl;//n
	JButton btn;//s
	JTextArea ta;//c
	
	public JDialogEx2() {
		this.setSize(500, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lbl = new JLabel("상단");
		ta = new JTextArea();
		btn = new JButton("다이얼로그 띄우기");
		btn.addActionListener(this);
		
		this.add(lbl,"North");
		this.add(ta);
		this.add(btn,"South");
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new SubDialog();
		
	}
	
	public static void main(String[] args) {
		new JDialogEx2();
	}
	
}
