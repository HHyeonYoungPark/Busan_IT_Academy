import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignIn {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		JLabel lbl1 = new JLabel("회원가입");
		JPanel pnl = new JPanel();
		pnl.add(lbl1);
		
		
		JPanel pnl2 = new JPanel();
		GridLayout gl = new GridLayout(0,2);
		pnl2.setLayout(gl);
		
		JLabel lbl2 = new JLabel("아이디");
		JTextField tf2 = new JTextField(5);
		JLabel lbl3 = new JLabel("이름");
		JTextField tf3 = new JTextField(5);
		JLabel lbl4 = new JLabel("비밀번호");
		JTextField tf4 = new JTextField(5);
		JLabel lbl5 = new JLabel("연락처");
		JTextField tf5 = new JTextField(5);		
		JLabel lbl6 = new JLabel("성별");		
		JRadioButton radio1 = new JRadioButton("남"); //하나만 선택
		JRadioButton radio2 = new JRadioButton("여"); //하나만 선택
		ButtonGroup bg = new ButtonGroup(); //하나만 선택되게 묶어줌
		bg.add(radio1);
		bg.add(radio2);
		
		JLabel lbl7 = new JLabel("취미");		
		JCheckBox ck1 = new JCheckBox("수영"); //체크창
		JCheckBox ck2 = new JCheckBox("독서"); //체크창
		JCheckBox ck3 = new JCheckBox("음악"); //체크창
		
		
		pnl2.add(lbl2);
		pnl2.add(tf2);
		pnl2.add(lbl3);
		pnl2.add(tf3);
		pnl2.add(lbl4);
		pnl2.add(tf4);
		pnl2.add(lbl5);
		pnl2.add(tf5);
		pnl2.add(lbl6);
		pnl2.add(radio1);
		pnl2.add(radio2);
		pnl2.add(lbl7);
		pnl2.add(ck1);
		pnl2.add(ck2);
		pnl2.add(ck3);
		
		
		JPanel pnl3 = new JPanel();
		pnl3.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("가입");
		JButton btn2 = new JButton("취소");
		btn1.setSize(60, 40);
		btn2.setSize(60, 40);
		
		pnl3.add(btn1);
		pnl3.add(btn2);
		
		f.add(pnl,"North");
		f.add(pnl2, "Center");
		f.add(pnl3, "South");
		
		
		f.setSize(500, 500);
		f.setVisible(true);
	}
}
