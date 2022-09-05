import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MoleGame2 extends JFrame implements ActionListener{
	JPanel pnl1, pnl2;
	JButton btnStart;
	JButton[] btns;
	Thread t;
	JLabel lblTime, lblPoint;
	ImageIcon icon;
	int second = 20;
	int point = 0;
	
	public MoleGame2() {
		this.setSize(500, 600);
		this.setDefaultCloseOperation(3);
		
		btnStart = new JButton("게임 시작");
		btnStart.addActionListener(this);
		btns = new JButton[9];
		lblTime = new JLabel("시간초");
		lblPoint = new JLabel("점수");
		icon = new ImageIcon("mole.jpg");
		
		pnl1 = new JPanel(new GridLayout(0,2));
		pnl1.add(lblTime);
		pnl1.add(lblPoint);
		
		pnl2 = new JPanel(new GridLayout(0,3));
		for(int i=0; i<btns.length;i++) {
			btns[i] = new JButton(i+"");
			pnl2.add(btns[i]);
		}
		
		this.add(pnl1,"North");
		this.add(pnl2);
		this.add(btnStart,"South");
		this.setVisible(true);
	}
	
	void threadRun() {
		t = new Thread() {
			public void run() {
				//작업		
				while (true) {			
					int i = (int)(Math.random()*9);
					btns[i].setIcon(icon);	
					btns[i].addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							JButton btnA = (JButton) e.getSource();
							
							// 버튼 눌렀을때 점수 올라가게 하기
							if(btnA==btns[i]) {
								point+=10;
								lblPoint.setText("점수 : "+ point + "점");
								btns[i] = new JButton();
							}
							else {
								point-=10;
								lblPoint.setText("점수 : "+ point + "점");
								btns[i] = new JButton();
							}
						}
					});
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if (second > 0) {
						second -= 1;		// 1초씩 줄어듦
						lblTime.setText("남은 시간 : "+second + "초");	
					}else{
						JOptionPane.showMessageDialog(null, "게임끝", "게임끝", JOptionPane.INFORMATION_MESSAGE );
						break;
					}
				}
			}
		};
		t.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnStart) {
			second = 20;
			point = 0;
			threadRun();
		}
	}
	
	public static void main(String[] args) {
		new MoleGame2();
	}
}
