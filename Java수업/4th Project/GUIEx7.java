import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
//회원가입 만들기
public class GUIEx7 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout gl = new GridLayout(0,2);
		JPanel pnlCenter = new JPanel(gl);
		JPanel pnlRadio = new JPanel();
		JPanel pnlCheck = new JPanel();
		JPanel pnlSouth = new JPanel();
		
		JLabel lblRegi = new JLabel("회원가입");
		JLabel lblId = new JLabel("아이디");
		JLabel lblName = new JLabel("이름");
		JLabel lblPw = new JLabel("비밀번호");
		JLabel lblTel = new JLabel("연락처");
		JLabel lblGen = new JLabel("성별");
		JLabel lblHob = new JLabel("취미");
		
		JTextField tfId = new JTextField();// GridLayout에서는 강제로 칸에
		JTextField tfName = new JTextField();// 맞춰서 늘이므로 굳이 크기를 
		JTextField tfPw = new JTextField();// 줄 필요가 없다
		JTextField tfTel = new JTextField();
		
		JRadioButton radioMan = new JRadioButton("남");
		JRadioButton radioWoman = new JRadioButton("여");
		ButtonGroup bg = new ButtonGroup();
		bg.add(radioMan);
		bg.add(radioWoman);
		
		JCheckBox ckSwim = new JCheckBox("수영");
		JCheckBox ckRea = new JCheckBox("독서");
		JCheckBox ckMus = new JCheckBox("음악");
		
		JButton btnOk = new JButton("가입");
		JButton btnCan = new JButton("취소");
		
		// 조립
		pnlRadio.add(radioMan);
		pnlRadio.add(radioWoman);
		
		pnlCheck.add(ckSwim);
		pnlCheck.add(ckRea);
		pnlCheck.add(ckMus);
		
		pnlSouth.add(btnOk);
		pnlSouth.add(btnCan);
		
		pnlCenter.add(lblId);
		pnlCenter.add(tfId);
		pnlCenter.add(lblName);
		pnlCenter.add(tfName);
		pnlCenter.add(lblPw);
		pnlCenter.add(tfPw);// JPasswordField를 사용하면 좋다.
		pnlCenter.add(lblTel);
		pnlCenter.add(tfTel);
		pnlCenter.add(lblGen);
		pnlCenter.add(pnlRadio);
		pnlCenter.add(lblHob);
		pnlCenter.add(pnlCheck);
		
		f.add(lblRegi,"North");
		f.add(pnlCenter,"Center");
		f.add(pnlSouth,"South");
		f.setVisible(true);
	
	}
}
