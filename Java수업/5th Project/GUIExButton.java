import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

// set은 설정하는거
// get은 가져오는거 
// JTextField를 JPasswordField로 바꾸면 ***로 뜸(타이핑한 내용이 안보임)

public class GUIExButton extends HFrame implements ActionListener{
	JTextField tf;
	JLabel lbl;
	JButton btn;
	public GUIExButton() {
		tf = new JTextField();
		lbl = new JLabel("여기에 글씨가 TextField에 있는 글자로 바뀝니다");
		btn = new JButton("클릭");
		this.add(tf, "North");
		this.add(lbl); //안뜨면 센터
		this.add(btn, "South");
		btn.addActionListener(this);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new GUIExButton();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		lbl.setText(tf.getText());
	}
}
