import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Book extends JFrame implements ActionListener{
	JTextArea ta;
	JScrollPane sp;
	JTextField tfNumber, tfTitle, tfPubliCation,
			   tfPrice, tfwriter, tfYear, tfSearch;
	JComboBox<String> cb;
	JLabel lbMain, lbNumber, lbTitle, lbPubliCation,
		   lbPrice, lbwriter, lbYear;
	JButton btnInput, btnSearch;
	BookList bl;
	ArrayList<String> list;
	HashMap<String, String> mapIdx,mapTitle,mapCompany,mapPrice,mapAuthor,mapYear;
	public Book() {
		
		bl = new BookList();
		list = bl.readFile();
		
		mapIdx = new HashMap<>();
		mapTitle = new HashMap<>();
		mapCompany = new HashMap<>();
		mapPrice = new HashMap<>();
		mapAuthor = new HashMap<>();
		mapYear = new HashMap<>();
		
		for(int i=0;i<list.size();i++) {
			String str[] = list.get(i).split("/");
			mapIdx.put(str[0], list.get(i));
			mapTitle.put(str[1], list.get(i));
			mapCompany.put(str[2], list.get(i));
			mapPrice.put(str[3], list.get(i));
			mapAuthor.put(str[4], list.get(i));
			mapYear.put(str[5], list.get(i));
		}
		
		
		
		this.setDefaultCloseOperation(3);
		this.setSize(400, 500);
		this.setLayout(null);
		
		lbMain = new JLabel("도서관리 프로그램");
		lbNumber = new JLabel("번호");
		lbTitle = new JLabel("제목");
		lbPubliCation = new JLabel("출판");
		lbPrice = new JLabel("가격");
		lbwriter = new JLabel("저자");
		lbYear = new JLabel("년도");
		
		tfNumber = new JTextField();
		tfNumber.setEditable(false);
		tfTitle = new JTextField();		
		tfPubliCation = new JTextField();
		tfPrice = new JTextField();
		tfwriter = new JTextField();
		tfYear = new JTextField();
		
		btnInput = new JButton("도서저장");
		
		ta = new JTextArea();
		sp = new JScrollPane(ta);
		
		String cbString[] = {"번호", "제목", "출판", "가격", "저자", "년도"};
		cb = new JComboBox<String>(cbString);
		tfSearch = new JTextField();
		btnSearch = new JButton("검색");
		
		btnInput.addActionListener(this);
		btnSearch.addActionListener(this);
		
		lbMain.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		
		lbMain.setBounds(113,20,200,40);
		lbNumber.setBounds(50,80,60,20);
		tfNumber.setBounds(78,80,100,25);
		lbTitle.setBounds(210,80,60,20);
		tfTitle.setBounds(238,80,100,25);
		lbPubliCation.setBounds(50,110,60,20);
		tfPubliCation.setBounds(78,110,100,25);
		lbPrice.setBounds(210,110,60,20);
		tfPrice.setBounds(238,110,100,25);
		lbwriter.setBounds(50,140,60,20);
		tfwriter.setBounds(78,140,100,25);
		lbYear.setBounds(210,140,60,20);
		tfYear.setBounds(238,140,100,25);
		btnInput.setBounds(45,175,300,40);
		cb.setBounds(45,230,80,40);
		tfSearch.setBounds(130,230,146,40);
		btnSearch.setBounds(280,230,65,40);
		sp.setBounds(45,280,300,150);
		
		this.add(lbMain);
		this.add(lbNumber);
		this.add(tfNumber);
		this.add(lbTitle);
		this.add(tfTitle);
		this.add(lbPubliCation);
		this.add(tfPubliCation);
		this.add(lbPrice);
		this.add(tfPrice);
		this.add(lbwriter);
		this.add(tfwriter);
		this.add(lbYear);
		this.add(tfYear);
		this.add(btnInput);
		this.add(cb);
		this.add(tfSearch);
		this.add(btnSearch);
		this.add(sp);
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Book();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnInput) {
			bl.savdFile(tfNumber.getText()+"/"+tfTitle.getText()+"/"+tfPubliCation.getText()
			+"/"+tfPrice.getText()+"/"+tfwriter.getText()+"/"+tfYear.getText());
			
			JOptionPane.showMessageDialog(this, "입력완료");

		}else if(e.getSource()==btnSearch) {
			String key = tfSearch.getText(); 
			
			System.out.println(key);
			System.out.println(cb.getSelectedItem());
			
			if(cb.getSelectedItem().equals("번호")) {
				ta.setText(mapIdx.get(key));
			}else if(cb.getSelectedItem().equals("제목")) {
				ta.setText(mapTitle.get(key));
			}
		}
		
	}
	
}

class BookList {
	final String BOOKLIST = "BookList.txt";
	File f;
	
	public BookList() {
		f = new File(BOOKLIST);
	}
	
	public void savdFile(String str) {// 한줄받아서 저장하기
		// File - FileWriter - PrintWriter
		try {
			FileWriter fw = new FileWriter(f,true);
			PrintWriter pw = new PrintWriter(fw);
			str = countFile()+str;
			pw.println(str);
			pw.flush();
			pw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public ArrayList<String> readFile(){
		ArrayList<String> list = new ArrayList<>();
		// File - FileReader - BufferedReader
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line=br.readLine())!=null) {// 한줄씩 읽어오기
				list.add(line);
			}			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	public int countFile() {
		int i=1;
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while((line=br.readLine())!=null) {// 한줄씩 읽어오기
				i++;
			}			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}	
	
}














