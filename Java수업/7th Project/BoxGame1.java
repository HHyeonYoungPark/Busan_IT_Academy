import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BoxGame1 extends JFrame implements ActionListener{
	JPanel pnl;
	JButton btnStart;
	JButton[] btns;
	Thread t;
	int num =0;
	
	public BoxGame1() {
		this.setSize(500, 400);
		this.setDefaultCloseOperation(3);
		
		btnStart = new JButton("시작");
		btnStart.addActionListener(this);
		btns = new JButton[10];
		pnl = new JPanel(null); //랜덤한 위치에 붙어야해서 null
		
		this.add(pnl);
		this.add(btnStart, "South");
		this.setVisible(true);
	}
	
	void threadRun() {
		t = new Thread() {
			@Override
			public void run() { // 작업
				// 패널 초기화
				pnl.removeAll();
				
				for(int i=0; i<10; i++) {
					// 이하 10번 반복
				
				// 랜덤 버튼 만들기 - 배열 이용
					btns[i] = new JButton(i+"");
								
				// 랜덤 크기 설정, 랜덤 위치 설정
					int x = (int)(Math.random()*390); 
					int y = (int)(Math.random()*270);
					int w = (int)(Math.random()*70)+40; //11~20
					int h = (int)(Math.random()*70)+40;
					btns[i].setBounds(x, y, w, h);
					
				// 랜덤 색상 설정
					int r = (int)(Math.random()*256); //0~255
					int g = (int)(Math.random()*256); //0~255
					int b = (int)(Math.random()*256); //0~255
					btns[i].setBackground(new Color(r, g, b));
					
				// btns에 액션리스너 붙여보기
					btns[i].addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							JButton btnA = (JButton) e.getSource();
//							System.out.println(btnA.getText());
								
							// 버튼을 눌렀을때 0부터 순서대로 사라지게 만들기
								if( btnA.getText().equals(num+"") ) {	
									pnl.remove(btnA);
									pnl.repaint();
									pnl.revalidate();
									num++;
									if(pnl.getComponentCount()==0) {
										JOptionPane.showInternalMessageDialog(pnl, "게임끝!");
									}
							}	
						}
					});
	
				// pnl에 붙이기
					pnl.add(btns[i]);
					pnl.repaint();
					pnl.revalidate();
					
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnStart) {
			num=0;
			threadRun();
		}	
	}
	
	public static void main(String[] args) {
		new BoxGame1();
	}
	
}
