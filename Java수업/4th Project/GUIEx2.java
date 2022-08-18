import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//Flow Layout

public class GUIEx2 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout f1 = new FlowLayout();
		f.setLayout(f1); // JFrame에 레이아웃이 바뀐다(설정된다)
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		
		f.setSize(300, 200);
		f.setVisible(true);
}
}
