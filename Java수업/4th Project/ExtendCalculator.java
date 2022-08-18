import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Input extends JPanel{
	Input(){
		JTextField tf = new JTextField(20);
		this.add(tf);
	}
}
class CalcButton extends JButton{
	public CalcButton() {
		this.setLayout(new GridLayout(0,4));
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				JButton buttonText = new JButton(); 		
			}
		}
		
	}
}

public class ExtendCalculator extends JFrame{
	ExtendCalculator(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 400);
		this.setLayout(new GridLayout(0,1));
		
		Input i = new Input();
		CalcButton c = new CalcButton();
		
		this.inputTf(i);
		this.buttonText(c);
		this.setVisible(true);
	}
	
	public void inputTf(JPanel tf) {
		this.add(tf);
	}
	public void buttonText(JButton btn) {
		this.add(btn);
	}
	
	public static void main(String[] args) {
		new ExtendCalculator();
	}
}
