import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WindowEvent extends JFrame implements WindowListener{
	public WindowEvent() {
		this.setSize(300,300);
		this.setVisible(true);
		this.addWindowListener(this); //현재 이 클래스(JFrame)에다가 윈도우 이벤트를 붙인다
	}
	
	public static void main(String[] args) {
		new WindowEvent();
	}
	@Override
	public void windowOpened(java.awt.event.WindowEvent e) {
		System.out.println("윈도우 오픈드");
		
	}

	@Override
	public void windowClosing(java.awt.event.WindowEvent e) {
		System.out.println("윈도우 클로징");
		JOptionPane.showMessageDialog(this, "종료하겠습니다");
		System.exit(0);
		
	}

	@Override
	public void windowClosed(java.awt.event.WindowEvent e) {
		System.out.println("윈도우클로즈드");
		
	}

	@Override
	public void windowIconified(java.awt.event.WindowEvent e) {
		System.out.println("ㅡ?");
		
	}

	@Override
	public void windowDeiconified(java.awt.event.WindowEvent e) {
		System.out.println("디ㅡ");
		
	}

	@Override
	public void windowActivated(java.awt.event.WindowEvent e) {
		System.out.println("액티브드");
		
	}

	@Override
	public void windowDeactivated(java.awt.event.WindowEvent e) {
		System.out.println("디액티브드");
		
	}

}
