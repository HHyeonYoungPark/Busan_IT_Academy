import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

class HButton extends JButton{
	public HButton(String str) {
		this.setText(str); //���� JButton�� ��� �ִ� �޼���
		this.setBackground(Color.green); // JButton�� ��� �ִ� �޼���
	}
}


public class ExtendsEx3 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300, 200);
		JButton btn = new HButton("Ŭ��");
		f.add(btn);
		f.setVisible(true);
		}
}
