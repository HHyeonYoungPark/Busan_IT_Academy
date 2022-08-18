import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIExAwt{
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(200, 300); //자동종료 같은건 따로 없음
		f.setLayout(new FlowLayout());
		Button btn = new Button("클릭");
		f.add(btn);
		WindowListener wl = new WindowListener() { // 너무 비효울적...
			@Override
			public void windowOpened(WindowEvent e) {}
			@Override
			public void windowIconified(WindowEvent e) {}
			@Override
			public void windowDeiconified(WindowEvent e) {}			
			@Override
			public void windowDeactivated(WindowEvent e) {}			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			@Override
			public void windowClosed(WindowEvent e) {}	
			@Override
			public void windowActivated(WindowEvent e) {}
		};
		
		f.addWindowListener(wl);
		f.setVisible(true);
		// 얘는 OS에 따라 모양이 바뀔 수 있다
		
		JFrame jf = new JFrame();
		jf.setSize(200, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new FlowLayout());
		JButton btn2 = new JButton("클릭");
		jf.add(btn2);
		jf.setVisible(true);
		// 자바 자체 리소스를 사용하기에 항상 모양이 일정하다
	}
}

//awt는 OS의 리소스를 이용한다.
