import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class GUIExTextField extends HFrame implements KeyListener{
	JTextField tf;
	public GUIExTextField() {
		tf = new JTextField();
		tf.addKeyListener(this);
		this.add(tf);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIExTextField();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("키누르는순간");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("키 누르고 있는 동안");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("키에서 손을 떼는 때");
	}

}
