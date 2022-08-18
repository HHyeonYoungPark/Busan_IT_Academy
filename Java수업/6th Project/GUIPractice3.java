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
		
		lblNum = new JLabel("��ȣ");
		lblName = new JLabel("�̸�");
		lblAge = new JLabel("����");
		tfNum = new JTextField();
		tfName = new JTextField();
		tfAge = new JTextField();
		ta = new JTextArea();
		btnSave = new JButton("�����ϱ�");
		btnLoad = new JButton("�ҷ�����");
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
	// TextArea�� �� ������ ������ �� ���� ��°�θ� �����´�
	// ta �ؽ�Ʈ������ ��ü �� �����ͼ� \n���� �ڸ� �� -> �׷��� �� ���پ��� i��° ���� �ȴ�
	// �� ���� �߿��� �ٽ� /�� �ڸ��� -> �� �ڸ� ������ [0]�̸�
	// �� ó�� ��°�� �ִ� tfNum �Է��� ������ [0]��(1��°) ������ �ȴ�
	// num�� �� tfNum �� find �� ���ٸ� ��� 1�� ������Ŵ?
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
		
		file = new File("ȸ������Ʈ");
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
		if(e.getActionCommand().equals("�����ϱ�")) { //�̺�Ʈ�� �Ͼ ��ü�� getText()
			String num = tfNum.getText(); //���� �Է��� ��ȣ	
			String str = ta.getText(); // ��ü �ؽ�Ʈ
			int inum = Integer.parseInt(num);
			
			int cnt = getCount(str, "\n", 0, num);
			//��ü���ڿ��� \n���� �ڸ� ������ �ٽ� /�� �߶� 0��° �迭�� ���� num�̶� ������ �?
			
			/* int getCount�� ����
			
			for(int i=0;i<str.length;i++) {
				if(str[i].split("/")[0].equals(num)) {
					JOptionPane.showMessageDialog(this, "�̹� �ִ� ��ȣ�Դϴ�.");
					break;
				}
			}
			*/
						
			if(cnt!=0){ //�ߺ��� ���ڿ��� ������ �����Ǹ� ���尡����
				String[] data = str.split("\n");
				String[] res = data[inum-1].split("/");
				
				
			}
			else {
				ta.append(tfNum.getText()+"/"+
						  tfName.getText()+"/"+
						  tfAge.getText()+"\n");
				
				file = new File("ȸ������Ʈ");
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
			int inum = Integer.parseInt(num); // ���ڸ� ���ڷ� �ٲ�
			int cnt = getCount(str, "\n", 0, num);
			
			if(cnt>0) {
				String[] data = str.split("\n");
				String[] res = data[inum-1].split("/");
				// inum�� �Է°��̰� -1�� ���ִ� ������ �迭�� ��ȣ�� 1�� �۱� ����
				tfName.setText(res[1]); // /�� �߶����� 2���� ��
				tfAge.setText(res[2]); // /�� �߶����� 3��° ��
			}else {
				JOptionPane.showMessageDialog(this, "���� ��ȣ �Դϴ�!!");
			}
		}
		
//		if(e.getSource()==btnSave){ }//e.getSource()�� �̺�Ʈ�� �Ͼ ���� ������ ��ü
	}

	public static void main(String[] args) {
		new GUIPractice3();
	}
}
