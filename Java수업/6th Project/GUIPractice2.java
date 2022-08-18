import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class GUIPractice2 extends JFrame implements ActionListener{
	JLabel lblRegister, lblId, lblPasswd, lblNumber, lblAddress;
	JTextField tfId, tfNumber1, tfNumber2;
	JPasswordField pfPasswd;
	JComboBox combo;
	JList list;
	JTextArea ta;
	JPanel pnlLeft, pnlLeftTop, pnlLeftCenter, pnlLeftBottom, pnlLocalNum;
	JButton btn1, btn2;

	File file;
	FileWriter fw;
	PrintWriter pw;
	
	FileReader fr;
	BufferedReader br;
	public GUIPractice2(){
		this.setSize(600,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(0, 2));
		
		pnlLeft = new JPanel();
		pnlLeftTop = new JPanel();
		pnlLeftCenter = new JPanel();
		pnlLeftBottom = new JPanel();
		pnlLocalNum = new JPanel();
		lblRegister = new JLabel("회원가입");
		lblId = new JLabel("아이디");
		lblPasswd = new JLabel("비밀번호");
		lblNumber = new JLabel("지역번호");
		lblAddress = new JLabel("주소");
		tfId = new JTextField();
		pfPasswd = new JPasswordField();
		tfNumber1 = new JTextField();
		tfNumber2 = new JTextField();
		btn1 = new JButton("가입하기");
		btn2 = new JButton("불러오기");
		btn1.addActionListener(this); //까먹지말고 꼭 넣기
		btn2.addActionListener(this);
		ta = new JTextArea();
		JScrollPane sp = new JScrollPane(ta);
		
		String[] localNum = {"02","031","051","052","032"};
		combo = new JComboBox(localNum);
		String[] address = {"부산시 금정구 장전동","부산시 수영구 민락동","부산시 수영구 광안동","부산시 남구 대연동","서울시 강남구 도곡동","경기도 화성시 반송동","경상남도 김해시 외동","경기도 남양주시 덕소리","서울시 서초구 양재동"};
		list = new JList(address);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane sp2 = new JScrollPane(list);
		
		pnlLocalNum.setLayout(new GridLayout(0, 3));
		pnlLocalNum.add(combo);
		pnlLocalNum.add(tfNumber1);
		pnlLocalNum.add(tfNumber2);
		
		pnlLeftTop.setLayout(new GridLayout(0, 2));
		pnlLeftTop.add(lblId);
		pnlLeftTop.add(tfId);
		pnlLeftTop.add(lblPasswd);
		pnlLeftTop.add(pfPasswd);
		pnlLeftTop.add(lblNumber);
		pnlLeftTop.add(pnlLocalNum);
		
     	pnlLeftCenter.setLayout(new GridLayout(0, 1));
		pnlLeftCenter.add(lblAddress);
		pnlLeftCenter.add(sp2);
		
		pnlLeftBottom.setLayout(new  GridLayout(0, 2));
		pnlLeftBottom.add(btn1);
		pnlLeftBottom.add(btn2);
		
		pnlLeft.setLayout(new BorderLayout());
		pnlLeft.add(pnlLeftTop, "North");
		pnlLeft.add(pnlLeftCenter, "Center");
		pnlLeft.add(pnlLeftBottom, "South");
		
		this.add(pnlLeft);
		this.add(sp);	
		this.setVisible(true);
	}
	

	public static void main(String[] args) {
		new GUIPractice2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {

			ta.append(tfId.getText()+" / "+pfPasswd.getText()+" / ");
				
			String str1 = (combo.getSelectedItem()+"-");
			ta.append(str1);
			
			ta.append(tfNumber1.getText()+"-"+tfNumber2.getText()+" / ");	
			
			String str2 = list.getSelectedValue()+"\n";
			ta.append(str2);
		}
		
		if(e.getSource()==btn1) {
			
			file = new File("회원가입 멤버");
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
			
		}else if(e.getSource()==btn2){
			ta.setText(""); //불러올때마다 초기화 시켜줌
			
			file = new File("회원가입 멤버");
			try {
				fr= new FileReader(file);
				br = new BufferedReader(fr);
				String line = null;
				
				while((line = br.readLine()) != null) {
					ta.append(line+"\n");
				}
				fr.close();
				br.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
