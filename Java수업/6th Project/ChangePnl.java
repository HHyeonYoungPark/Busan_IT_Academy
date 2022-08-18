import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangePnl extends JFrame implements ActionListener{
	JButton btnR,btnY,btnB;
	JPanel pnlB;
	JPanel pnlWest,pnlCenter;
	FileGUI3 pnlF;// 이 패널이 pnlR대신임
	ChangePnl2 pnlC;
	
	public ChangePnl() {
		this.setSize(600, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pnlWest = new JPanel(new GridLayout(3,1));
		btnR = new JButton("   "); 
		btnY = new JButton("   ");
		btnB = new JButton("   ");
		btnR.addActionListener(this);
		btnY.addActionListener(this);
		btnB.addActionListener(this);
		pnlWest.add(btnR);
		pnlWest.add(btnY);
		pnlWest.add(btnB);
		
		pnlF = new FileGUI3();
		pnlC = new ChangePnl2();
		pnlB = new JPanel();		
		
		btnR.setBackground(Color.RED);
		btnY.setBackground(Color.YELLOW);
		btnB.setBackground(Color.BLUE);
		
		
		pnlB.setBackground(Color.BLUE);
		
		pnlCenter = new JPanel(new BorderLayout());
		
		this.add(pnlWest,"West");
		this.add(pnlCenter);
		this.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnR) {
			pnlCenter.removeAll();			
			pnlCenter.add(pnlF);
		}else if(e.getSource()==btnY) {
			pnlCenter.removeAll();			
			pnlCenter.add(pnlC);
		}else if(e.getSource()==btnB) {
			pnlCenter.removeAll();			
			pnlCenter.add(pnlB);
		}			
		//pnlCenter.updateUI();// 패널의 화면 갱신효과
				
		pnlCenter.repaint();// 패인팅을 새로. 레이아웃, 폭 등등 
		pnlCenter.revalidate();// 레이아웃을 새로 계산해서 화면을 갱신함
		
	}
	
	public static void main(String[] args) {
		new ChangePnl();
	}

}
