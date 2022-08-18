import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUIPractice3 extends JFrame implements ActionListener{
	JLabel lblNum, lblName, lblAge;
	JTextField tfNum, tfName, tfAge;
	JTextArea ta;
	JButton btnSave, btnLoad;
	JPanel pnlTop, pnlCenter, pnlBottom;
	
	File file;
	FileWriter fw;
	PrintWriter pw;
	
	FileReader fr;
	BufferedReader br;
	
	public GUIPractice3() {
		this.setSize(400, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lblNum = new JLabel("번호");
		lblName = new JLabel("이름");
		lblAge = new JLabel("나이");
		tfNum = new JTextField();
		tfName = new JTextField();
		tfAge = new JTextField();
		ta = new JTextArea();
		btnSave = new JButton("저장하기");
		btnLoad = new JButton("불러오기");
		btnSave.addActionListener(this);
		btnLoad.addActionListener(this);
		pnlTop = new JPanel();
		pnlCenter = new JPanel();
		pnlBottom = new JPanel();
		JScrollPane sp = new JScrollPane(ta);
		
		pnlTop.setLayout(new GridLayout(0, 2));
		pnlTop.add(lblNum);
		pnlTop.add(tfNum);
		pnlTop.add(lblName);
		pnlTop.add(tfName);
		pnlTop.add(lblAge);
		pnlTop.add(tfAge);
		
		pnlCenter.setLayout(new BorderLayout());
		pnlCenter.add(sp);
		
		pnlBottom.setLayout(new FlowLayout());
		pnlBottom.add(btnSave);
		pnlBottom.add(btnLoad);
		
		this.add(pnlTop,"North");
		this.add(pnlCenter,"Center");
		this.add(pnlBottom,"South");
		this.setVisible(true);
		
		this.Load();
		
	}
	// int cnt = getCount(str, "\n", 0, num);
	// TextArea는 줄 단위로 가져올 수 없고 통째로만 가져온다
	// ta 텍스트내용을 전체 다 가져와서 \n으로 자른 후 -> 그러면 각 한줄씩이 i번째 줄이 된다
	// 각 한줄 중에서 다시 /로 자른다 -> 그 자른 내용중 [0]이면
	// 맨 처음 번째에 있는 tfNum 입력한 내용이 [0]의(1번째) 내용이 된다
	// num의 값 tfNum 가 find 와 같다면 계속 1씩 증가시킴?
	int getCount(String str, String delim, int num, String find) {
		int result = 0;
		String data[] = str.split(delim);
		for(int i=0;i<data.length;i++) {
			if(data[i].split("/")[num].equals(find)) {
				result++;
			}
		}
		
		return result;
	}
	public void Load() {
		ta.setText("");
		
		file = new File("회원리스트");
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line = null;
			
			while((line = br.readLine()) != null) {
				ta.append(line+"\n");
			}
			fr.close();
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("저장하기")) { //이벤트가 일어난 객체의 getText()
			String num = tfNum.getText(); //현재 입력할 번호	
			String str = ta.getText(); // 전체 텍스트
			int inum = Integer.parseInt(num);
			
			int cnt = getCount(str, "\n", 0, num);
			//전체문자에서 \n으로 자른 다음에 다시 /로 잘라서 0번째 배열의 값이 num이랑 같은게 몇개?
			
			/* int getCount로 만듬
			
			for(int i=0;i<str.length;i++) {
				if(str[i].split("/")[0].equals(num)) {
					JOptionPane.showMessageDialog(this, "이미 있는 번호입니다.");
					break;
				}
			}
			*/
						
			if(cnt!=0){ //중복된 숫자여도 내용이 수정되면 저장가능함
				String[] data = str.split("\n");
				String[] res = data[inum-1].split("/");
				
				
			}
			else {
				ta.append(tfNum.getText()+"/"+
						  tfName.getText()+"/"+
						  tfAge.getText()+"\n");
				
				file = new File("회원리스트");
				try {
					fw = new FileWriter(file);
					pw = new PrintWriter(fw);
					pw.println(ta.getText());
					
					pw.flush();
					pw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}	
			
		}else if(e.getSource()==btnLoad) {
			String str = ta.getText();
			String num = tfNum.getText();
			int inum = Integer.parseInt(num); // 문자를 숫자로 바꿈
			int cnt = getCount(str, "\n", 0, num);
			
			if(cnt>0) {
				String[] data = str.split("\n");
				String[] res = data[inum-1].split("/");
				// inum은 입력값이고 -1을 해주는 이유는 배열의 번호가 1씩 작기 때문
				tfName.setText(res[1]); // /로 잘랐을때 2번쨰 값
				tfAge.setText(res[2]); // /로 잘랐을때 3번째 값
			}else {
				JOptionPane.showMessageDialog(this, "없는 번호 입니다!!");
			}
		}
		
//		if(e.getSource()==btnSave){ }//e.getSource()는 이벤트가 일어난 실제 생성된 객체
	}

	public static void main(String[] args) {
		new GUIPractice3();
	}
}
