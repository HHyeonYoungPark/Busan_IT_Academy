import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClockEx1 extends JFrame implements ActionListener, Runnable{	
	JLabel lbl;
	JButton btnStart, btnStop;
	JPanel pnl;
	Thread t;
	SimpleDateFormat sdf;
	boolean isRunning = false;
	
	public ClockEx1() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(3);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		lbl = new JLabel();
		btnStart = new JButton("시작");
		btnStop = new JButton("정지");
		btnStart.addActionListener(this);
		btnStop.addActionListener(this);
		pnl = new JPanel();
		pnl.add(btnStart);
		pnl.add(btnStop);
		
		
		
		this.add(lbl);
		this.add(pnl, "South");
		this.setVisible(true);
	}
	
	@Override
	public void run() { //시간 갱신하는 작업
		while(isRunning) {
			Date date = new Date();
			String sdate = sdf.format(date); // 시간이 만들어짐
			lbl.setText(sdate);	
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// t.interrupt()를 실행하면 예외가 발생함
				// 이부분이 실행됨
				e.printStackTrace(); //예외화면 출력
				return; // 강제종료
				//break;
				//isRunning = false;
			}
		}// 여기를 빠져나오면 쓰레드가 종료됨.
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnStart) {
			isRunning = true;
			t = new Thread(this); // 괄호 안에는 Runnabl을 구현한 객체를 넣어야 함. (this본인이 드가야함)
			t.start(); // 쓰레드를 위에서 먼저 만들어야지 start가 가능하다
			
		}else if(e.getSource()==btnStop) {
			isRunning = false;
//			t.interrupt(); // 인터럽트 익셉션을 발생시켜 강제 종료시킴
//						   // 상당히 많은 예외를 발생시키므로 이렇게하면 안됨
//			               // 하지만 종료는 됨
		}
	}
	
	public static void main(String[] args) {
		new ClockEx1();
	}
}
