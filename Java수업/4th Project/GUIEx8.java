import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUIEx8 extends MFrameMe{
	//JFrame�� MFrame���� �ٲٸ� �̸� ������ MFrame������ ��ӹ޾� �����
	public GUIEx8() { // JFrame == this�� ���ٰ� �����ϰ� �۾��ϱ�
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //MFrame�� ���������� �������
//		this.setSize(500, 400);
		
		/*
		JPanel pnl = new JPanel(); //�����г��� �����ʹ�.
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
