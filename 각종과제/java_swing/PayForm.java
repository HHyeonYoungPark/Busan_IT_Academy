//package pay;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

//import main.Reservation;
//import main.Reservation.PanelName;

/**
 * @author 박현영
 * @contents 결제정보 페이지(6)를 구현하기 위한 클래스 
 */

public class PayForm extends JPanel implements ItemListener, ActionListener{
	//Reservation parent;
	
	JButton btnMain, btnPay;
	JLabel lblReserveInfo, lblPayments, lblPaymentInfo, lblBankSelect, lblInstallment, lblCardNum, lblPasswd, 
	 lblAccountPwNum, lblCvc, lblAccountNum, lblCashReceipt, lblPhoneNum, lblPhoneNum2, lblAgree, lblVisitInfo,
	 lblPhonePayInfo;
	JTextArea taVisitInfo, taPhonePayInfo;
	JScrollPane spReserveInfo, spPayInfo, spPhonePayInfo, spVisitInfo , spPay1Info, spPay2Info, spPay3Info, spPay4Info;
	JComboBox comboPayments, comboBankSelect, comboInstallment, comboAccountSelect;
	JTextField tfCardNum, tfPhoneNum, tfPhoneNum2, tfAccount;
	JPasswordField passwdNum, AccontpasswdNum, cvcNum;
	JRadioButton radioBtnYes, radioBtnNo;
	JPanel pnlPay, pnlPay1, pnlPay2, pnlPay3, pnlPay4, pnlAgree;
	JTable tblReserveInfo, tblPaymentInfo, tblPayInfo, tblPay1Info, tblPay2Info, tblPay3Info, tblPay4Info;
	JCheckBox checkBoxAgree;
	DefaultTableModel modelReserveInfo, modelPaymentInfo, modelPay1Info, modelPay2Info, modelPay3Info, modelPay4Info;
	
	String[] header = {"예약자명","지역","날짜","선택한 룸","인원","요청사항"};
	String[][] contents = {};	
	
	String[] payments = {"결제수단 선택","신용/체크카드","간편 계좌 결제","휴대폰 결제","현장 결제"};
	String[] BankSelect = {"카드사 선택","신한","국민","비씨","우리","외환","하나","NH","현대","삼성","롯데","씨티"};
	String[] Installment = {"할부 선택","일시불","2개월","3개월","4개월","5개월","6개월"};
	String[] accountSelect = {"은행 선택","신한","국민","우리","외환","하나","NH"};
	
	public PayForm(/*Reservation parent*/){
		// 여기에 기본 소스코드 구현
		// 내부에 구현하는 GUI는 JPanel 단위로 클래스를 만들어서 붙여넣으면 좋습니다.
		//this.parent = parent;
		
		// Button(메인버튼,결제버튼)
		btnMain = new JButton("메인으로");
		btnPay = new JButton("결제하기");
		btnMain.addActionListener(this);
		btnPay.addActionListener(this);
		
		
		// Label(예약정보,결제수단,결제정보)
		lblReserveInfo = new JLabel("예약정보");
		lblPayments = new JLabel("결제수단선택");
		lblPaymentInfo = new JLabel("결제정보요악");
			
		
		// JTable(예약정보,결제정보) - ScrollPane 추가
//		taReserveInfo = new JTextArea();
//		taPaymentInfo = new JTextArea();
		modelReserveInfo = new DefaultTableModel(contents, header);
		tblReserveInfo = new JTable(modelReserveInfo);
		tblPaymentInfo = new JTable();
		spReserveInfo = new JScrollPane(tblReserveInfo);
		spPayInfo = new JScrollPane(tblPaymentInfo);
				
		
		// 결제 수단 선택 ComboBox	
		comboPayments = new JComboBox(payments);
		comboPayments.addItemListener(this);
		
		// 결제 수단 선택에 따른 pnl(미완성)	
		pnlPay = new JPanel();
		pnlPay.setLayout(null);
		pnlPay.setBorder(new LineBorder(Color.GRAY));
		
		// 1.신용/체크카드 결제
		pnlPay1 = new JPanel();		
		
//		lblBankSelect = new JLabel("카드사 선택");
//		lblInstallment = new JLabel("할부 선택");
		lblCardNum = new JLabel("카드 번호");
		lblPasswd = new JLabel("비밀 번호");
		lblCvc = new JLabel(" cvc");
		
		comboBankSelect = new JComboBox(BankSelect);
		comboInstallment = new JComboBox(Installment);
		comboBankSelect.addItemListener(this);
		comboInstallment.addItemListener(this);
		
		tfCardNum = new JTextField();
		passwdNum = new JPasswordField();
		cvcNum = new JPasswordField();
		
//		lblBankSelect.setBounds(10, 10, 80, 25);
//		lblInstallment.setBounds(10, 42, 80, 25);
		lblCardNum.setBounds(10, 74, 80, 25);
		lblPasswd.setBounds(10, 105, 80, 25);
		lblCvc.setBounds(10, 137, 80, 25);
		comboBankSelect.setBounds(10, 10, 220, 25);
		comboInstallment.setBounds(10, 42, 220, 25);
		tfCardNum.setBounds(95, 74, 135, 25);
		passwdNum.setBounds(95, 105, 48, 25);
		cvcNum.setBounds(95, 137, 48, 25);
		
		pnlPay1.setLayout(null);
		pnlPay1.setBorder(new LineBorder(Color.GRAY));
		
//		pnlPay1.add(lblBankSelect);
//		pnlPay1.add(lblInstallment);
		pnlPay1.add(lblCardNum);
		pnlPay1.add(lblPasswd);
		pnlPay1.add(lblCvc);
		pnlPay1.add(comboBankSelect);
		pnlPay1.add(comboInstallment);
		pnlPay1.add(tfCardNum);
		pnlPay1.add(passwdNum);
		pnlPay1.add(cvcNum);
		
		
		// 2.간편계좌 결제
		pnlPay2 = new JPanel();
		
		lblAccountNum = new JLabel("계좌 번호");
		lblCashReceipt = new JLabel("현금 영수증");
		lblPhoneNum = new JLabel("휴대폰 번호");
		lblAccountPwNum = new JLabel("비밀 번호");
		
		comboAccountSelect = new JComboBox(accountSelect);
		comboAccountSelect.addItemListener(this);
		
		AccontpasswdNum = new JPasswordField();
		
		radioBtnYes = new JRadioButton("신청");
		radioBtnNo = new JRadioButton("미신청");
		ButtonGroup group = new ButtonGroup();
		group.add(radioBtnYes);
		group.add(radioBtnNo);
		
		tfAccount = new JTextField();
		tfPhoneNum = new JTextField();

		comboAccountSelect.setBounds(10, 10, 220, 25);
		lblAccountNum.setBounds(10, 42, 60, 25);
		lblAccountPwNum.setBounds(10, 74, 75, 25);
		lblCashReceipt.setBounds(10, 105, 80, 25);
		lblPhoneNum.setBounds(10, 137, 65, 25);
		tfAccount.setBounds(90, 42, 140, 25);
		AccontpasswdNum.setBounds(90, 74, 48, 25);
		radioBtnYes.setBounds(90, 105, 50, 25);
		radioBtnNo.setBounds(140, 105, 65, 25);
		tfPhoneNum.setBounds(90, 137, 140, 25);
		
		pnlPay2.setLayout(null);
		pnlPay2.setBorder(new LineBorder(Color.GRAY));
		
		pnlPay2.add(comboAccountSelect);
		pnlPay2.add(lblAccountNum);
		pnlPay2.add(lblAccountPwNum);
		pnlPay2.add(lblCashReceipt);
		pnlPay2.add(AccontpasswdNum);
		pnlPay2.add(radioBtnYes);
		pnlPay2.add(radioBtnNo);
		pnlPay2.add(lblPhoneNum);
		pnlPay2.add(tfPhoneNum);
		pnlPay2.add(tfAccount);
		
		
		// 3.휴대폰 결제
				pnlPay3 = new JPanel();
				
				lblPhoneNum2 = new JLabel("휴대폰 번호");
				lblPhonePayInfo = new JLabel("휴대폰 결제 안내");
				
				tfPhoneNum2 = new JTextField();
				
				taPhonePayInfo = new JTextArea();
				taPhonePayInfo.setText("휴대폰 결제 이용시 결제대금은 당월 \r\n"
									 + "통신요금에 포함되어 청구됩니다.\r\n"+"\n"
									 + "통신 요금에 대해서 미납을 하거나 \r\n"
									 + "체납이 되어 있는 경우 결제서비스를 \r\n"
									 + "이용하실 수 없습니다.");
				
				taPhonePayInfo.setEditable(false);
				spPhonePayInfo = new JScrollPane(taPhonePayInfo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
				
				lblPhoneNum2.setBounds(10, 10, 70, 25);
				tfPhoneNum2.setBounds(90, 10, 140, 25);
				lblPhonePayInfo.setBounds(10, 42, 100, 25);
				spPhonePayInfo.setBounds(10, 74, 220, 75);
				
				pnlPay3.setLayout(null);
				pnlPay3.setBorder(new LineBorder(Color.GRAY));
				
				pnlPay3.add(lblPhoneNum2);
				pnlPay3.add(tfPhoneNum2);
				pnlPay3.add(lblPhonePayInfo);
				pnlPay3.add(spPhonePayInfo);
				
		
		// 4.현장 결제
		pnlPay4 = new JPanel();
		
		lblVisitInfo = new JLabel("현장 결제 안내");
		
		taVisitInfo = new JTextArea();
		taVisitInfo.setText("현장 결제를 선택하셨습니다.\r\n"+"\n"
				+ "호텔 방문 시 직원의 안내에 따라 \r\n"
				+ "현장에서 결제해주십시오. \r\n"+"\n"
				+ "노쇼 발생시 패널티와 위약금이 \r\n"
				+ "청구됨을 알려드립니다.");
		taVisitInfo.setEditable(false);
		spVisitInfo = new JScrollPane(taVisitInfo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		
		pnlPay4.setLayout(null);
		pnlPay4.setBorder(new LineBorder(Color.GRAY));
		
		lblVisitInfo.setBounds(10, 10, 220, 25);
		spVisitInfo.setBounds(10, 42, 220,100);
		
		pnlPay4.add(lblVisitInfo);
		pnlPay4.add(spVisitInfo);
		
		// 결제시 개인정보 동의 pnl
		
		pnlAgree = new JPanel();
		
		lblAgree = new JLabel("예약 내용을 확인, 정보 제공 등에 동의");
		checkBoxAgree = new JCheckBox();
		checkBoxAgree.addItemListener(this);
				
		lblAgree.setBounds(10, 10, 210, 30);
		checkBoxAgree.setBounds(210, 10, 20, 30);
		
		pnlAgree.setLayout(null);
		pnlAgree.setBorder(new LineBorder(Color.GRAY));
		
		pnlAgree.add(lblAgree);
		pnlAgree.add(checkBoxAgree);
		
		
		// 결제 정보받아오는 JTable
		
		// 1.카드결제 정보 tbl
		
		String[] Pay1header = {"항목","정보"};
		String[][] Pay1contents = new String[5][1];
		
		Pay1contents[0][0] = "결제 수단";
		Pay1contents[1][0] = "카드사";
		Pay1contents[2][0] = "카드 번호";
		Pay1contents[3][0] = "할부";
		Pay1contents[4][0] = "총 가격";
		
		modelPay1Info = new DefaultTableModel(Pay1contents,Pay1header);
		tblPay1Info = new JTable(modelPay1Info);
		tblPay1Info.getColumn("항목").setPreferredWidth(80);
		tblPay1Info.getColumn("정보").setPreferredWidth(160);
		tblPay1Info.setRowHeight(30);
			
		spPay1Info = new JScrollPane(tblPay1Info);
		spPay1Info.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		
		// 2.계좌결제 정보 tbl
		
		String[] Pay2header = {"항목","정보"};
		String[][] Pay2contents = new String[6][1];
		
		Pay2contents[0][0] = "결제 수단";
		Pay2contents[1][0] = "은행";
		Pay2contents[2][0] = "계좌 번호";
		Pay2contents[3][0] = "현금영수증";
		Pay2contents[4][0] = "휴대폰 번호";
		Pay2contents[5][0] = "총 가격";
		
		modelPay2Info = new DefaultTableModel(Pay2contents,Pay2header);
		tblPay2Info = new JTable(modelPay2Info);
		tblPay2Info.getColumn("항목").setPreferredWidth(80);
		tblPay2Info.getColumn("정보").setPreferredWidth(160);
		tblPay2Info.setRowHeight(30);
			
		spPay2Info = new JScrollPane(tblPay2Info);
		spPay2Info.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		
		// 3.휴대폰결제 정보 tbl
		
		String[] Pay3header = {"항목","정보"};
		String[][] Pay3contents = new String[3][1];
		
		Pay3contents[0][0] = "결제 수단";
		Pay3contents[1][0] = "휴대폰 번호";
		Pay3contents[2][0] = "총 금액";
		
		modelPay3Info = new DefaultTableModel(Pay3contents,Pay3header);
		tblPay3Info = new JTable(modelPay3Info);
		tblPay3Info.getColumn("항목").setPreferredWidth(80);
		tblPay3Info.getColumn("정보").setPreferredWidth(160);
		tblPay3Info.setRowHeight(30);
			
		spPay3Info = new JScrollPane(tblPay3Info);
		spPay3Info.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		
		// 4.현장결제 정보 tbl

		String[] Pay4header = {"항목","정보"};
		String[][] Pay4contents = new String[2][1];
		
		Pay4contents[0][0] = "결제 수단";
		Pay4contents[1][0] = "총 금액";
		
		modelPay4Info = new DefaultTableModel(Pay4contents,Pay4header);
		tblPay4Info = new JTable(modelPay4Info);
		tblPay4Info.getColumn("항목").setPreferredWidth(80);
		tblPay4Info.getColumn("정보").setPreferredWidth(160);
		tblPay4Info.setRowHeight(30);
			
		spPay4Info = new JScrollPane(tblPay4Info);
		spPay4Info.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		
		// 각 요소 위치지정
		btnMain.setBounds(0, 0, 90, 25);
		lblReserveInfo.setBounds(30, 40, 50, 20);
		spReserveInfo.setBounds(30, 60, 525, 150);
		lblPayments.setBounds(30, 230, 80, 20);
		comboPayments.setBounds(30, 250, 240, 30);
		pnlPay.setBounds(30, 290, 240, 172);
		pnlAgree.setBounds(30, 480, 240, 50);
		lblPaymentInfo.setBounds(315, 230, 80, 20);
		spPayInfo.setBounds(315, 250, 240, 212);
		btnPay.setBounds(315, 480, 240, 50);
			
		this.setLayout(null);
		this.add(btnMain);
		this.add(lblReserveInfo);
		this.add(spReserveInfo);
		this.add(lblPayments);
		this.add(comboPayments);
		this.add(pnlPay);
		this.add(pnlAgree);
		this.add(lblPaymentInfo);
		this.add(spPayInfo);
		this.add(btnPay);
	
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// 결제수단 combobox 선택시 그에 맞는 결제정보입력  pnl로 변경
		if(e.getStateChange()==ItemEvent.SELECTED) {
			if((String)comboPayments.getSelectedItem()==("결제수단 선택")) {
				JOptionPane.showMessageDialog(null,"결제수단을 선택하세요.","결제수단 선택",JOptionPane.ERROR_MESSAGE);
				
			}else if((String)comboPayments.getSelectedItem()==("신용/체크카드")) {
				pnlPay.removeAll();
				pnlPay1.setBounds(0, 0, 240, 172);
				pnlPay.add(pnlPay1);
				
				spPayInfo.removeAll();
				spPay1Info.setBounds(0, 0, 240, 212);
				spPayInfo.add(spPay1Info);
				
			}else if((String)comboPayments.getSelectedItem()==("간편 계좌 결제")) {
				pnlPay.removeAll();
				pnlPay2.setBounds(0, 0, 240, 172);
				pnlPay.add(pnlPay2);
				
				spPayInfo.removeAll();
				spPay2Info.setBounds(0, 0, 240, 212);
				spPayInfo.add(spPay2Info);
		        
			}else if((String)comboPayments.getSelectedItem()==("휴대폰 결제")) {
				pnlPay.removeAll();
				pnlPay3.setBounds(0, 0, 240, 172);
				pnlPay.add(pnlPay3);
				
				spPayInfo.removeAll();
				spPay3Info.setBounds(0, 0, 240, 212);
				spPayInfo.add(spPay3Info);
				
			}else if((String)comboPayments.getSelectedItem()==("현장 결제")) {
				pnlPay.removeAll();
				pnlPay4.setBounds(0, 0, 240, 172);
				pnlPay.add(pnlPay4);
				
				spPayInfo.removeAll();
				spPay4Info.setBounds(0, 0, 240, 212);
				spPayInfo.add(spPay4Info);
				
			}
			this.repaint();
			this.validate();
		}
		
		
		if(e.getSource()==checkBoxAgree) {
			if(checkBoxAgree.isSelected()) {
//				System.out.println("정보 입력됨");
				
			}else {
//				System.out.println("정보 지워짐");
				
			}
		}
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== btnMain) {
			//메인으로 버튼을 눌렀을때 메인화면으로 이동
//			 parent.changePanel(PanelName.Intro);
		}
		
		if(e.getSource()==btnPay) {
			//결제하기 버튼을 눌렀을 때
			JOptionPane.showMessageDialog(null, "결제가 곧 완료됩니다.", "결제완료", JOptionPane.INFORMATION_MESSAGE );
			//이후에 resultForm 으로 넘어감,,
//			parent.changePanel(PanelName.Result);
		}
		
	}
	
	// 아래 메인은 각 페이지 별로 출력을 보기위한 테스트코드입니다.
	public static void main(String[] args) {
		JFrame frm = new JFrame();
		frm.setSize(600,600);
		frm.setDefaultCloseOperation(3);
		frm.add(new PayForm(/*new Reservation()*/));	
		frm.setVisible(true);
	}
}
