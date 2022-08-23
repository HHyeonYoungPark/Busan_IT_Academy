import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class SubDialog extends JDialog implements ActionListener{
	// Jframe이랑 같다고 생각하자. 부모창에서 이 창을 만들 예정이므로 main이 필요없다.
	JLabel lbl;
	JTextArea ta;
	JButton btn;	
	
	public SubDialog() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);// 창닫기
		lbl = new JLabel("다이얼로그 상단");
		ta = new JTextArea();
		btn = new JButton("창닫기");
		btn.addActionListener(this);
		
		this.add(lbl,"North");
		this.add(ta);
		this.add(btn,"South");
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.dispose();// 창닫기 함수		
	}	
}
