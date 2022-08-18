import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
//상속은 두개를 받을 수 없음
// ActionListener - 인터페이스임
// 쓸거면 implements 쓰면됨
public class ActionTest extends JFrame implements ActionListener{
	public ActionTest() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 400);
		JButton btn = new JButton();
		btn.addActionListener(this);
		this.add(btn);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼같은 것들 누를때 작동하는 부분
		// 어떻게 작동하는지 알 필요가 없음. 그냥 여기쓰면 작동함.
		System.out.println("하이");
		
	}
	public static void main(String[] args) {
		new ActionTest();
	}

}
