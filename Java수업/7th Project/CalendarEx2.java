import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CalendarEx2 extends JFrame implements ActionListener{
	JPanel pnl1, pnl2;
	
	JLabel lbl; // 이번달 글씨
	JButton btn1, btn2;
	Calendar cal;
	int prev,now,next;
	
	public CalendarEx2() {
		this.setDefaultCloseOperation(3);
		this.setSize(600, 500);
		
		cal = Calendar.getInstance();// 오늘 날짜 가져오기
		
		prev = cal.get(Calendar.MONTH);
		now = cal.get(Calendar.MONTH)+1;
		next = cal.get(Calendar.MONTH)+2;
		
		pnl1 = new JPanel();
		
		lbl = new JLabel("이번달("+now+"월)");
		btn1 = new JButton("이전달("+prev+"월)");
		btn2 = new JButton("다음달("+next+"월)");
		
		btn1.addActionListener(this);		
		btn2.addActionListener(this);
		pnl1.add(btn1);
		pnl1.add(lbl);
		pnl1.add(btn2);
		
		pnl2 = new JPanel(new GridLayout(0,7));// 0으로 주면 자동으로 행증가
		
				
		setCalendar(cal.get(Calendar.MONTH));
		
		this.add(pnl1,"North");
		this.add(pnl2);
		this.setVisible(true);
		
	}
	
	void setCalendar(int n) {
		pnl2.add(new JLabel("일"));
		pnl2.add(new JLabel("월"));
		pnl2.add(new JLabel("화"));		
		pnl2.add(new JLabel("수"));
		pnl2.add(new JLabel("목"));
		pnl2.add(new JLabel("금"));
		pnl2.add(new JLabel("토"));		
		
		//DAY_OF_MONTH를 1로 설정 (월의 첫날)
		cal.set(Calendar.MONTH, n);
		cal.set(Calendar.DAY_OF_MONTH,1);// 8월 1일로 달력을 설정함
		//cal 세팅 = 오늘 월에 1일로 오늘날짜를 설정		
		
		
		int first_week = cal.get(Calendar.DAY_OF_WEEK);// 오늘 요일 가져오기
		//그 주의 요일 반환 (일:1 ~ 토:7) 결과는 2
		
		int last = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		// 이번달의 마지막 날짜 8월 기준으로 결과는 31
		
		
		for(int i=0;i<first_week-1;i++) {// 빈칸 붙이기 
			pnl2.add(new JLabel(""));
		}
		
		for(int i=0;i<last;i++) {
			pnl2.add(new JButton((i+1)+""));
		}
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn2 && next==12) {
			JOptionPane.showMessageDialog(this, "12월 까지만 가능합니다.");
		}else if(e.getSource()==btn1 && prev==1) {
			JOptionPane.showMessageDialog(this, "1월 까지만 가능합니다.");
		}else {
		
			pnl2.removeAll();
			
			if(e.getSource()==btn2) {
				setCalendar(cal.get(Calendar.MONDAY)+1);
				
			}else {
				setCalendar(cal.get(Calendar.MONDAY)-1);
			}
			
			prev = cal.get(Calendar.MONTH);
			now = cal.get(Calendar.MONTH)+1;
			next = cal.get(Calendar.MONTH)+2;
			
			lbl.setText("이번달("+now+"월)");
			btn1.setText("이전달("+prev+"월)");
			btn2.setText("다음달("+next+"월)");
			
			pnl2.repaint();
			pnl2.revalidate();
		}
	}	
	
	public static void main(String[] args) {
		new CalendarEx2();
	}

	

}
