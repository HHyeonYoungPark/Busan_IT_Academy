
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JDialogEx3 extends JFrame implements ActionListener{
	JPanel pnl;
	JButton btn;
	public JDialogEx3() {
		this.setSize(300, 400);
		this.setDefaultCloseOperation(3);
		
		pnl = new JPanel();
		btn = new JButton("새창");
		btn.addActionListener(this);
		
		this.add(pnl);
		this.add(btn,"South");
		
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		new SubDialog2(pnl);
	}
	
	public static void main(String[] args) {
		new JDialogEx3();
	}

}// 클래스 끝

class SubDialog2 extends JDialog implements ActionListener{
	JButton btnR,btnG,btnB,btn;
	JPanel pnl,ppnl;
	public SubDialog2(JPanel ppnl) {
		this.ppnl = ppnl;// 부모창의 패널을 가져옴
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		pnl = new JPanel();
		btnR = new JButton("빨강");
		btnG = new JButton("초록");
		btnB = new JButton("파랑");
		btn = new JButton("닫기");
		btnR.addActionListener(this);
		btnG.addActionListener(this);
		btnB.addActionListener(this);
		btn.addActionListener(this);
		pnl.add(btnR);
		pnl.add(btnG);
		pnl.add(btnB);
		
		this.add(pnl);
		this.add(btn,"South");
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnR) {
			ppnl.setBackground(Color.RED);
		}else if(e.getSource()==btnG) {
			ppnl.setBackground(Color.GREEN);
		}else if(e.getSource()==btnB) {
			ppnl.setBackground(Color.BLUE);
		}else if(e.getSource()==btn) {
			this.dispose();
		}
		
	}
	
}

