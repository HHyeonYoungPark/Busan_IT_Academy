import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUIPractice4 extends JFrame implements ActionListener{
	JPanel pnlMain, pnlBtn, pnlRed, pnlYellow, pnlBlue;
	JButton btnRed, btnYellow, btnBlue;
	
	public GUIPractice4() {
		this.setSize(600, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		pnlMain = new JPanel();
		pnlBtn = new JPanel();
		pnlRed = new JPanel();
		pnlYellow = new JPanel();
		pnlBlue = new JPanel();
		
		pnlRed.setBackground(Color.RED);
		pnlYellow.setBackground(Color.YELLOW);
		pnlBlue.setBackground(Color.BLUE);
		
		btnRed = new JButton(" ");
		btnYellow = new JButton(" ");
		btnBlue = new JButton(" ");
		
		btnRed.setBackground(Color.RED);
		btnYellow.setBackground(Color.YELLOW);
		btnBlue.setBackground(Color.BLUE);
		
		btnRed.addActionListener(this);
		btnYellow.addActionListener(this);
		btnBlue.addActionListener(this);
		
		pnlBtn.setLayout(new GridLayout(0, 1));
		pnlBtn.add(btnRed);
		pnlBtn.add(btnYellow);
		pnlBtn.add(btnBlue);
		
		pnlMain.setLayout(new BorderLayout());
		pnlMain.add(pnlBlue);
		pnlMain.add(pnlRed);
		pnlMain.add(pnlYellow);
		
		this.add(pnlBtn,"West");
		this.add(pnlMain,"Center");
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnRed) {
			pnlMain.removeAll();
			pnlMain.add(pnlRed);
		}else if(e.getSource()==btnYellow) {
			pnlMain.removeAll();
			pnlMain.add(pnlYellow);
		}else if(e.getSource()==btnBlue) {
			pnlMain.removeAll();
			pnlMain.add(pnlBlue);
		}
		pnlMain.updateUI(); //�г��� ȭ�� ����ȿ��
		
		this.repaint(); // �������� �����ϴ°�, ���̾ƿ�, ��, ���
		this.revalidate(); // ���̾ƿ��� ���� ����ؼ� ȭ���� ������
		
	}
	public static void main(String[] args) {
		new GUIPractice4();
	}
	
}
