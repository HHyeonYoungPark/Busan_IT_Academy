import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MathEx2 extends JFrame implements ActionListener{
	
	JButton btn1, btn2, btn3;
	JPanel pnl, pnlBtn;
	JTextArea ta;
	JScrollPane sp;
	JLabel lbl;
	
	public MathEx2() {
		this.setSize(300, 300);
		this.setDefaultCloseOperation(3);
	
		lbl = new JLabel("묵찌빠게임");
		
		btn1 = new JButton("묵");
		btn2 = new JButton("찌");
		btn3 = new JButton("빠");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		pnl = new JPanel();
		ta = new JTextArea();
		sp = new JScrollPane(ta);
		
		pnlBtn = new JPanel();
		pnlBtn.setLayout(new FlowLayout());
		
		
		pnlBtn.add(btn1);
		pnlBtn.add(btn2);
		pnlBtn.add(btn3);
		
		this.add(lbl, "North");
		this.add(sp, "Center");
		this.add(pnlBtn, "South");

		
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new MathEx2();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//버튼을 누를떄마다 내가 누른것과 비교
		int random = (int)(Math.random()*3);
//		Random ran = new Random();
//		int ir = ran.nextInt(3);
		int user = 0;
		
		if(e.getSource()==btn1) {//묵
			user = 0;
		}
		else if(e.getSource()==btn2) {//찌
			user = 1;
		}
		else if(e.getSource()==btn3) {//빠
			user = 2;
		}
		
		if(random == user) {
			ta.setText("비김");
		}else if((random==0 && user==2)||(random==1 && user==0)||(random==2 && user==1)) {
			ta.setText("이김");
		}else {
			ta.setText("짐");
		}
		
	}
}
