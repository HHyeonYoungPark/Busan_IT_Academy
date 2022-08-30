import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MGB extends JFrame implements ActionListener{
	JPanel pnl;
	JLabel lbl;
	JButton btn1,btn2,btn3;
	public MGB() {
		this.setDefaultCloseOperation(3);
		this.setSize(400, 300);
		
		pnl = new JPanel();
		btn1 = new JButton("묵");
		btn2 = new JButton("찌");
		btn3 = new JButton("빠");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		pnl.add(btn1);
		pnl.add(btn2);
		pnl.add(btn3);
		lbl = new JLabel("");
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
	}
}
