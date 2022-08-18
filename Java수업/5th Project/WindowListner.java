import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// 버튼을 누르면 배경색이 바뀌게 해보기
// JPanel을 이용하거나 getContentPane을 이용해보기
public class WindowListner extends JFrame implements ActionListener{
	JButton btn1, btn2, btn3;
	
	WindowListner(){
		this.setSize(500, 300);
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.RED); //getContentPane을 이용
		 btn1 = new JButton("버튼1");
		 btn2 = new JButton("버튼2");
		 btn3 = new JButton("버튼3");
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		this.setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== btn1) {
			this.setBackground(Color.RED);
		}else if(e.getSource()== btn2) {
			this.setBackground(Color.BLUE);
		}else if(e.getSource()== btn3){
			this.setBackground(Color.GREEN);
		}
		
	}
	
	public static void main(String[] args) {
		new WindowListner();// 생성자를 호출한다.
	}

}
