import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUIExTextArea extends HFrame implements ActionListener{
	JTextArea ta;
	JTextField tf;
	JButton btn;
	public GUIExTextArea() {
		ta = new JTextArea();
		JScrollPane sp = new JScrollPane(ta); //스크롤바 생성
		ta.setEditable(false); //수정금지 - textArea를 통해서만 문자를 넣을 수 있다.(직접작성X)
		
		tf = new JTextField();
		btn = new JButton("클릭");
		btn.addActionListener(this);
		this.add(tf, "North");
		this.add(sp);
		this.add(btn,"South");
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIExTextArea();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ta.append(tf.getText()+"\n"); //"\n" -> 엔터 역할
	}
}
