
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 * @author 박현영
 * @contents 결제정보 페이지(6)를 구현하기 위한 클래스 
 */

public class PayForm extends JPanel implements ActionListener{
	JButton btnMain, btnPay;
	JLabel lblReserveInfo, lblPayments, lblPaymentInfo, lblBankSelect, lblInstallment, lblCardNum, lblPasswd, 
	lblAccountNum, lblCashReceipt, lblPhoneNum, lblPhoneNum2;
	JTextArea taReserveInfo, taPaymentInfo;
	JScrollPane spReserveInfo, spPaymentInfo;
	JComboBox comboPayments, comboBankSelect, comboInstallment, comboAccountSelect;
	JTextField tfCardNum, tfPhoneNum, tfPhoneNum2, tfAccount;
	JPasswordField passwdNum, cvcNum;
	JRadioButton radioBtnYes, radioBtnNo;
	JPanel pnlPay1, pnlPay2, pnlPay3, pnlPay4;
	
															   
	PayForm(){
		// 여기에 기본 소스코드 구현
		// 내부에 구현하는 GUI는 JPanel 단위로 클래스를 만들어서 붙여넣으면 좋습니다.
		
		
		// Button(메인버튼,결제버튼)
		btnMain = new JButton("메인으로");
		btnPay = new JButton("결제하기");
		btnMain.addActionListener(this);
		btnPay.addActionListener(this);
		
		
		// Label(예약정보,결제수단,결제정보)
		lblReserveInfo = new JLabel("예약정보");
		lblPayments = new JLabel("결제수단선택");
		lblPaymentInfo = new JLabel("결제정보요악");
			
		
		// TextArea(예약정보,결제정보) - ScrollPane 추가
		taReserveInfo = new JTextArea();
		taPaymentInfo = new JTextArea();
		spReserveInfo = new JScrollPane(taReserveInfo);
		spPaymentInfo = new JScrollPane(taPaymentInfo);
				
		
		// 결제 수단 선택 ComboBox
		String[] payments = {"신용/체크카드","간편 계좌 결제","휴대폰 결제","현장 결제"};
		comboPayments = new JComboBox(payments);
		
		
		// 결제 수단 선택에 따른 pnl(미완성)	
		// 1.신용/체크카드 결제
		pnlPay1 = new JPanel();
		
		String[] BankSelect = {"카드사 선택","신한","국민","비씨","우리","외환","하나","NH","현대","삼성","롯데","씨티"};
		String[] Installment = {"할부 선택","일시불","2개월","3개월","4개월","5개월","6개월"};
		
//		lblBankSelect = new JLabel("카드사 선택");
//		lblInstallment = new JLabel("할부 선택");
		lblCardNum = new JLabel("카드 번호");
		lblPasswd = new JLabel("비밀번호/CVC");
		
		comboBankSelect = new JComboBox(BankSelect);
		comboInstallment = new JComboBox(Installment);
		tfCardNum = new JTextField();
		passwdNum = new JPasswordField();
		cvcNum = new JPasswordField();
		
//		lblBankSelect.setBounds(10, 10, 80, 25);
//		lblInstallment.setBounds(10, 42, 80, 25);
		lblCardNum.setBounds(10, 74, 80, 25);
		lblPasswd.setBounds(10, 105, 80, 25);
		comboBankSelect.setBounds(10, 10, 185, 25);
		comboInstallment.setBounds(10, 42, 185, 25);
		tfCardNum.setBounds(95, 74, 100, 25);
		passwdNum.setBounds(95, 105, 48, 25);
		cvcNum.setBounds(147, 105, 48, 25);
		
		pnlPay1.setLayout(null);
		pnlPay1.setBorder(new LineBorder(Color.GRAY));
		
//		pnlPay1.add(lblBankSelect);
//		pnlPay1.add(lblInstallment);
		pnlPay1.add(lblCardNum);
		pnlPay1.add(lblPasswd);
		pnlPay1.add(comboBankSelect);
		pnlPay1.add(comboInstallment);
		pnlPay1.add(tfCardNum);
		pnlPay1.add(passwdNum);
		pnlPay1.add(cvcNum);
		
		
		// 2.간편계좌 결제
		pnlPay2 = new JPanel();
		
		String[] accountSelect = {"은행 선택","신한","국민","비씨","우리","외환","하나","NH"};
		
		lblAccountNum = new JLabel("계좌 번호");
		lblCashReceipt = new JLabel("현금 영수증");
		lblPhoneNum = new JLabel("휴대폰 번호");
		
		comboAccountSelect = new JComboBox(accountSelect);
		
		radioBtnYes = new JRadioButton("신청");
		radioBtnNo = new JRadioButton("미신청");
		ButtonGroup group = new ButtonGroup();
		group.add(radioBtnYes);
		group.add(radioBtnNo);
		
		tfAccount = new JTextField();
		tfPhoneNum = new JTextField();

		comboAccountSelect.setBounds(10, 10, 185, 25);
		lblAccountNum.setBounds(10, 42, 60, 25);
		lblCashReceipt.setBounds(10, 74, 80, 25);
		lblPhoneNum.setBounds(10, 105, 65, 25);
		tfAccount.setBounds(90, 42, 105, 25);
		radioBtnYes.setBounds(85, 74, 50, 25);
		radioBtnNo.setBounds(135, 74, 65, 25);
		tfPhoneNum.setBounds(90, 105, 105, 25);
		
		pnlPay2.setLayout(null);
		pnlPay2.setBorder(new LineBorder(Color.GRAY));
		
		pnlPay2.add(comboAccountSelect);
		pnlPay2.add(lblAccountNum);
		pnlPay2.add(lblCashReceipt);
		pnlPay2.add(radioBtnYes);
		pnlPay2.add(radioBtnNo);
		pnlPay2.add(lblPhoneNum);
		pnlPay2.add(tfPhoneNum);
		pnlPay2.add(tfAccount);
		
		
		// 3.휴대폰 결제
		pnlPay3 = new JPanel();
		
		lblPhoneNum2 = new JLabel("휴대폰 번호");
		
		tfPhoneNum2 = new JTextField();
		
		lblPhoneNum2.setBounds(10, 10, 70, 25);
		tfPhoneNum2.setBounds(10, 42, 185, 25);
		
		pnlPay3.setLayout(null);
		pnlPay3.setBorder(new LineBorder(Color.GRAY));
		
		pnlPay3.add(lblPhoneNum2);
		pnlPay3.add(tfPhoneNum2);
		
		// 4.현장 결제
		pnlPay4 = new JPanel();
		
		pnlPay4.setLayout(null);
		pnlPay4.setBorder(new LineBorder(Color.GRAY));
		
		
		// 각 요소 위치지정
		btnMain.setBounds(0, 0, 90, 25);
		lblReserveInfo.setBounds(30, 40, 50, 20);
		spReserveInfo.setBounds(30, 60, 425, 150);
		lblPayments.setBounds(30, 230, 80, 20);
		comboPayments.setBounds(30, 250, 205, 30);
		pnlPay3.setBounds(30, 290, 205, 140);
		lblPaymentInfo.setBounds(265, 230, 80, 20);
		spPaymentInfo.setBounds(265, 250, 190, 140);
		btnPay.setBounds(265, 400, 190, 30);
			
		this.setLayout(null);
		this.add(btnMain);
		this.add(lblReserveInfo);
		this.add(spReserveInfo);
		this.add(lblPayments);
		this.add(comboPayments);
		this.add(pnlPay3);
		this.add(lblPaymentInfo);
		this.add(spPaymentInfo);
		this.add(btnPay);
	
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	// 아래 메인은 각 페이지 별로 출력을 보기위한 테스트코드입니다.
	public static void main(String[] args) {
		JFrame frm = new JFrame();
		frm.setSize(500,500);
		frm.setDefaultCloseOperation(3);
		frm.add(new PayForm());	
		frm.setVisible(true);
	}
}
