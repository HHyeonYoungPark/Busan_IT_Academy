import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUIEx8 extends MFrameMe{
	//JFrame을 MFrame으로 바꾸면 미리 만들어둔 MFrame내용을 상속받아 적용됨
	public GUIEx8() { // JFrame == this와 같다고 생각하고 작업하기
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //MFrame에 설정내용이 담겨있음
//		this.setSize(500, 400);
		
		/*
		JPanel pnl = new JPanel(); //색상패널을 만들고싶다.
		pnl.setBackground(Color.blue); // ex) new CPanel(Color.RED);
		*/
		CPanel pnl = new CPanel(Color.red);
		
		//
		
		this.add(pnl);
		this.setVisible(true);
	
	}
	
	public static void main(String[] args) {
		GUIEx8 ge8 = new GUIEx8();
	}
}
