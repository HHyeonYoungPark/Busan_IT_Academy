import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

// set�� �����ϴ°�
// get�� �������°� 
// JTextField�� JPasswordField�� �ٲٸ� ***�� ��(Ÿ������ ������ �Ⱥ���)

public class GUIExButton extends HFrame implements ActionListener{
	JTextField tf;
	JLabel lbl;
	JButton btn;
	public GUIExButton() {
		tf = new JTextField();
		lbl = new JLabel("���⿡ �۾��� TextField�� �ִ� ���ڷ� �ٲ�ϴ�");
		btn = new JButton("Ŭ��");
		this.add(tf, "North");
		this.add(lbl); //�ȶ߸� ����
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
