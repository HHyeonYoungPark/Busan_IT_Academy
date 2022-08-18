import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUIPractice extends HFrame implements ActionListener{
	JTextField tf;
	JButton btnSave, btnLoad;
	JTextArea ta;
	
	File file;
	FileWriter fw;
	
	// �ʿ��� �����̳�, ������Ʈ���� �����ڿ��� �� ������ �д�.
	
	public GUIPractice () {
		tf = new JTextField();
		ta = new JTextArea();
		JScrollPane sp = new JScrollPane(ta);
		btnSave = new JButton("�����ϱ�");
		btnLoad = new JButton("�ҷ�����");
		btnSave.addActionListener(this);
		btnLoad.addActionListener(this);
		
		JPanel pnl = new JPanel();		
		pnl.add(btnSave);
		pnl.add(btnLoad);
		
		// ������ ����� ������ ���� add ���ش�.
		this.add(tf, "North");
		this.add(sp);
		this.add(pnl, "South");
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new GUIPractice();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnSave) {
			
			file = new File(tf.getText()); //���� ���� �� �̸����� ���� �����
			try {
				fw = new FileWriter(file);
				fw.write(ta.getText());
				fw.flush();
				fw.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace(); //�⺻ ���� ���� ���
			}
			
			
			
			
		}else if(e.getSource()==btnLoad){
			
		}
	}
	
}
