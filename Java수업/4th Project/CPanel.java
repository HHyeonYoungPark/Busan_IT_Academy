import java.awt.Color;

import javax.swing.JPanel;

public class CPanel extends JPanel{ //여기서 말하는 this == JPanel
	public CPanel() {
		//super(); <= 부모의 생성자를 반드시 불러야 하는건 아니다. 이걸 안써도 이미 있다.
		// 왜냐면 부모가 빈생성자를 가지고 있으니까 알아서 호출한다.	
		// 만약 부모가 빈 생성자() <= 괄호 안에 아무것도 없는 생성자가 없다면 반드시
		// super(매개변수) <= 부모의 생성자를 명시적으로 호출해야 함.
	}
	
	public CPanel(Color c) {
		//super();
		this.setBackground(c); //JPanel이 들고 있는 메서드
	}
}
