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
		f.setSize(200, 300); //�ڵ����� ������ ���� ����
		f.setLayout(new FlowLayout());
		Button btn = new Button("Ŭ��");
		f.add(btn);
		WindowListener wl = new WindowListener() { // �ʹ� ��ȿ����...
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
		// ��� OS�� ���� ����� �ٲ� �� �ִ�
		
		JFrame jf = new JFrame();
		jf.setSize(200, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new FlowLayout());
		JButton btn2 = new JButton("Ŭ��");
		jf.add(btn2);
		jf.setVisible(true);
		// �ڹ� ��ü ���ҽ��� ����ϱ⿡ �׻� ����� �����ϴ�
	}
}

//awt�� OS�� ���ҽ��� �̿��Ѵ�.
