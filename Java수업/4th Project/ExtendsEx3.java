import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

class HButton extends JButton{
	public HButton(String str) {
		this.setText(str); //원래 JButton이 들고 있는 메서드
		this.setBackground(Color.green); // JButton이 들고 있는 메서드
	}
}


public class ExtendsEx3 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300, 200);
		JButton btn = new HButton("클릭");
		f.add(btn);
		f.setVisible(true);
		}
}
