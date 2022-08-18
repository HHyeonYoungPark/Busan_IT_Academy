import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//3���� Ÿ���� JButton�� ���� - JButton�� ��� ���� �޼��� 3�� �����


class AButton extends JButton{
	public AButton() {		
		this.setText("a");
	}
}


class BButton extends JButton{
	public BButton() {		
		this.setBackground(Color.BLUE);
	}
}

class CButton extends JButton{
	public CButton() {
		this.setText("�۾�");
		this.setForeground(Color.RED);
	}
}




public class ExtendJButton extends  JFrame{
	ExtendJButton() {		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 200);
		this.setLayout(new FlowLayout());
		
		AButton a = new AButton();
		BButton b = new BButton();
		CButton c = new CButton();
		
		this.addButton(a);
		this.addButton(b);
		this.addButton(c);
		
		this.setVisible(true);
	}
	
	public void addButton(JButton btn) {// �پ��� �Ű������� �ϳ��� Ÿ������ ������ �ִ�. �̶� Ÿ���� �θ��� Ÿ���̴�.
		this.add(btn);
	}


	public static void main(String[] args) {
		new ExtendJButton();
	}
}

