import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUIPractice extends HFrame implements ActionListener{
	JTextField tf;
	JButton btnSave, btnLoad;
	JTextArea ta;
	
	File file; // 두군데서 같이 쓸 수 있음
	
	FileWriter fw;
	PrintWriter pw; // println을 쓸 수 있다.
	
	FileReader fr;
	BufferedReader br; // 한줄씩 읽어올 수 있다.
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
				pw = new PrintWriter(fw);
				pw.println("안녕하세요");
				pw.println("하이");
				pw.println("안녕");
				
				pw.flush();
//				fw.close(); 얘는 지워도 됨
				pw.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace(); //기본 예외 내용 출력
			}		
			
			
		}else if(e.getSource()==btnLoad){
			ta.setText(""); //불러올때마다 초기화 시켜줌
			
			file = new File(tf.getText());
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				String line = null; // 한줄을 읽어온다. 한줄의 기준은 엔터
				
				while((line = br.readLine()) != null) {
					ta.append(line+"\n");
				}
				
				/*
				line = br.readLine();
				ta.append(line+"\n");
				line = br.readLine();
				ta.append(line+"\n");
				line = br.readLine();
				ta.append(line+"\n");
				line = br.readLine();
				ta.append(line+"\n");
				line = br.readLine();
				ta.append(line+"\n");
				line = br.readLine();
				*/
				
				br.close();
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
}
