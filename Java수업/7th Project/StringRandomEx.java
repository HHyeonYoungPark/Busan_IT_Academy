import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StringRandomEx extends JFrame implements ActionListener{
	
	JPanel pnl;
	JButton btn;
	
	Color[] cols = {Color.RED, Color.BLUE, Color.GREEN,  Color.CYAN,  Color.MAGENTA};
	public StringRandomEx() {
		this.setSize(400, 300);
		this.setDefaultCloseOperation(3);
		pnl = new JPanel();
		btn = new JButton("클릭");
		btn.addActionListener(this);
		this.add(pnl);
		this.add(btn, "South");
		this.setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		int ran = (int)(Math.random()*cols.length);
//		pnl.setBackground(cols[ran]);
		
		// RGB RED-GREEN-BLUE 0~255 - RGB 값으로 색을 정말 랜덤하게 뽑을 수 있음
		int r = (int)(Math.random()*256);
		int g = (int)(Math.random()*256);
		int b = (int)(Math.random()*256);
		pnl.setBackground(new Color(r, g, b));
	}
	
	public static void main(String[] args) {
		new StringRandomEx();
	}
}
