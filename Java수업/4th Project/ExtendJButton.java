import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//3가지 타입의 JButton을 만들어서 - JButton을 상속 받은 메서드 3개 만들기


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
		this.setText("글씨");
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
	
	public void addButton(JButton btn) {// 다양한 매개변수를 하나의 타입으로 받을수 있다. 이때 타입은 부모의 타입이다.
		this.add(btn);
	}


	public static void main(String[] args) {
		new ExtendJButton();
	}
}

