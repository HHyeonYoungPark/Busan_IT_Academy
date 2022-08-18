import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChangePnl2 extends JPanel{
	
	JPanel pnl;
	
	public ChangePnl2() {
		
		pnl = new JPanel();
		ImageIcon img = new ImageIcon("coffee.jpg");
		JLabel lbl = new JLabel(img);
		pnl.add(lbl);
		this.add(pnl);
	}
}
