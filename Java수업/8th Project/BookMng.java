
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class BookMng extends JFrame implements ActionListener{

	JPanel pnlInput, pnlSearch, pnlResult;
	JTextField tfTitle, tfPrice, tfWriter, tfYear, tfBookNum, tfSearch;
	JButton btnSave, btnSearch;
	JLabel lblInput, lblSearch, lblResult, lblTitle, lblPrice, lblWriter, lblYear, lblBookNum;
	JComboBox comboSearch;
	JTextArea ta;
	JScrollPane sp;
	
	File file;
	FileWriter fw;
	PrintWriter pw;	
	FileReader fr;
	BufferedReader br;
	
	String[] search = {"제목", "가격", "저자", "년도", "품번"};
	public BookMng() {
		this.setSize(500, 480);
		this.setDefaultCloseOperation(3);
		this.setLayout(null);
		
		// 입력pnl
		
		pnlInput = new JPanel();
		pnlInput.setLayout(null);
		pnlInput.setBorder(new LineBorder(Color.GRAY));
		
		tfTitle = new JTextField();
		tfPrice = new JTextField();
		tfWriter = new JTextField();
		tfYear = new JTextField();
		tfBookNum = new JTextField();
		
		lblInput = new JLabel("도서 입력");
		lblTitle = new JLabel("제목");
		lblPrice = new JLabel("가격");
		lblWriter = new JLabel("저자");
		lblYear = new JLabel("년도");
		lblBookNum = new JLabel("품번");
		
		btnSave = new JButton("입력하기");
		btnSave.addActionListener(this);
		
		
		tfTitle.setBounds(60, 10, 140, 25);
		tfPrice.setBounds(60, 50, 140, 25);
		tfWriter.setBounds(60, 90, 140, 25);
		tfYear.setBounds(280, 10, 140, 25);
		tfBookNum.setBounds(280, 50, 140, 25);
		lblTitle.setBounds(20, 10, 50, 20);
		lblPrice.setBounds(20, 50, 50, 20);
		lblWriter.setBounds(20, 90, 50, 20);
		lblYear.setBounds(240, 10, 50, 20);
		lblBookNum.setBounds(240, 50, 50, 20);
		btnSave.setBounds(280, 90, 140, 25);
		
		pnlInput.add(tfTitle);
		pnlInput.add(tfPrice);
		pnlInput.add(tfWriter);
		pnlInput.add(tfYear);
		pnlInput.add(tfBookNum);
		pnlInput.add(lblTitle);
		pnlInput.add(lblPrice);
		pnlInput.add(lblWriter);
		pnlInput.add(lblYear);
		pnlInput.add(lblBookNum);
		pnlInput.add(btnSave);

		
		// 검색pnl
		pnlSearch = new JPanel();
		pnlSearch.setLayout(null);
		pnlSearch.setBorder(new LineBorder(Color.GRAY));
		
		lblSearch = new JLabel("도서 검색");
		tfSearch = new JTextField();
		comboSearch = new JComboBox(search);
		btnSearch = new JButton("도서 검색");
		btnSearch.addActionListener(this);
		
		comboSearch.setBounds(30, 17, 90, 25);
		tfSearch.setBounds(130, 17, 180, 25);
		btnSearch.setBounds(320, 17, 95, 25);
		
		pnlSearch.add(comboSearch);
		pnlSearch.add(tfSearch);
		pnlSearch.add(btnSearch);

		
		// 결과pnl
		pnlResult = new JPanel();
		pnlResult.setLayout(null);
		pnlResult.setBorder(new LineBorder(Color.GRAY));
		
		lblResult = new JLabel("검색 결과");
		ta = new JTextArea();
		sp = new JScrollPane(ta);
		
		
		sp.setBounds(10, 10, 425, 110);
		
		pnlResult.add(sp);
		
		// pnl합치기
		
		lblInput.setBounds(20, 10, 70, 20);
		pnlInput.setBounds(20, 30, 445, 130);
		lblSearch.setBounds(20, 170, 70, 20);
		pnlSearch.setBounds(20, 190, 445, 60);
		lblResult.setBounds(20, 260, 70, 20);
		pnlResult.setBounds(20, 280, 445, 130);
		
		this.add(lblInput);
		this.add(pnlInput);
		this.add(lblSearch);
		this.add(pnlSearch);
		this.add(lblResult);
		this.add(pnlResult);
		this.setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
	public static void main(String[] args) {
		new BookMng();
	}
	
}
