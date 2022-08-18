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
	
	// 필요한 컨테이너, 컴포넌트들을 생성자에서 다 생성해 둔다.
	
	public GUIPractice () {
		tf = new JTextField();
		ta = new JTextArea();
		JScrollPane sp = new JScrollPane(ta);
		btnSave = new JButton("저장하기");
		btnLoad = new JButton("불러오기");
		btnSave.addActionListener(this);
		btnLoad.addActionListener(this);
		
		JPanel pnl = new JPanel();		
		pnl.add(btnSave);
		pnl.add(btnLoad);
		
		// 위에서 만든걸 순서에 따라 add 해준다.
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
			
			file = new File(tf.getText()); //제일 위에 줄 이름으로 파일 만들기
			try {
				fw = new FileWriter(file);
				fw.write(ta.getText());
				fw.flush();
				fw.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace(); //기본 예외 내용 출력
			}
			
			
			
			
		}else if(e.getSource()==btnLoad){
			
		}
	}
	
}
