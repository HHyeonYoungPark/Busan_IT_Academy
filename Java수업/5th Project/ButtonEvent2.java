import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// ActionListner = 클릭 이벤트를 가지는 인터페이스 = 이걸 구현하면 클릭이벤트

public class ButtonEvent2 extends JFrame implements ActionListener{
	JButton btn1,btn2;
	
	ButtonEvent2(){// 여기에 실행될 내용을 다쓰면 된다.
		this.setLayout(new FlowLayout());// 다른곳에서 실행할꺼면 필요없는 부분
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btn1 = new JButton("버튼1");
		btn2 = new JButton("버튼2");
		this.add(btn1);
		this.add(btn2);		
		btn1.addActionListener(this);// 버튼에 액션 붙이기
		btn2.addActionListener(this);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			System.out.println("버튼1");
		}else if(e.getSource()==btn2) {
			System.out.println("버튼2");
		}		
	}	
	
	public static void main(String[] args) {
		new ButtonEvent2();// 생성자를 호출한다.
	}
	
}
