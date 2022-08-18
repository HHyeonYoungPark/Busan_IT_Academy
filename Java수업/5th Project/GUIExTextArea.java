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
		JScrollPane sp = new JScrollPane(ta); //��ũ�ѹ� ����
		ta.setEditable(false); //�������� - textArea�� ���ؼ��� ���ڸ� ���� �� �ִ�.(�����ۼ�X)
		
		tf = new JTextField();
		btn = new JButton("Ŭ��");
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
		ta.append(tf.getText()+"\n"); //"\n" -> ���� ����
	}
}
