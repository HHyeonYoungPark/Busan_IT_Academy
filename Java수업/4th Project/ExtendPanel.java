import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class APanel extends JPanel{
	APanel() {
		this.setBackground(Color.YELLOW);
		this.setLayout(new GridLayout(10,0));
		
		JTextField tf = new JTextField();
		tf.setSize(200, 100);
		this.add(tf);
	}
	
}
class BPanel extends JPanel{
	BPanel() {
		this.setLayout(null);
		this.setBackground(Color.cyan);
		
		JButton btn = new JButton("¹öÆ°");
		btn.setSize(400, 100);
		btn.setLocation(40, 100);
		this.add(btn);
	}
}

public class ExtendPanel extends JFrame{// BorderLayout
	ExtendPanel(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 700);
		this.setLayout(new GridLayout(0,1));
		
		APanel a = new APanel();
		BPanel b = new BPanel();
		
		this.addPanel(a);
		this.addPanel(b);
		
		this.setVisible(true);
	}
	
	public void addPanel(JPanel pnl) {
		this.add(pnl);
	}
	
	public static void main(String[] args) {
		new ExtendPanel();
	}
}
