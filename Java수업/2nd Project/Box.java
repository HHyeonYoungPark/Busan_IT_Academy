package secondproject;

import java.awt.Color;

import javax.swing.JPanel;

public class Box extends JFrame{// 내 Box 클래스  +  JFrame 클래스
	Box() {
		//Scanner sc = new Scanner(System.in);
		
		JPanel pnl = new JPanel();// 패널을 만들었다.
		
		this.setSize(200, 200);// set이 들어가면 세팅이다. = 외부의 값을 안에 넣는다
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pnl.setBackground(Color.PINK);		
		System.out.println(pnl.getBackground());
		
		this.add(pnl);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Box();
	}
}

