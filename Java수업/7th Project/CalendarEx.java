import java.awt.GridLayout;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//이번달의 마지막 가져오기
//이번달의 첫날 가져오기 
//또는 첫날의 요일

//1일의 요일 = 번호로 나옴 => 
//일요일1 토요일7

//for(int i=0;i<1일의요일-1;i++){
//빈 레이블 붙이기
//}

//for(int i=0;i<마지막 날보다;i++){
//버튼(i+1)붙이기
//}

public class CalendarEx extends JFrame{
	JPanel pnl1, pnl2;
	JButton btn1, btn2;
	JLabel lbl; // 이번달 글씨
	
	
	
	public CalendarEx() {
		this.setDefaultCloseOperation(3);
		this.setSize(600, 500);
		pnl1 = new JPanel();
		lbl = new JLabel(" 이번달 ");
		btn1 = new JButton("<");
		btn2 = new JButton(">");
		pnl1.add(btn1);
		pnl1.add(lbl);
		pnl1.add(btn2);
		
		
		
		pnl2 = new JPanel(new GridLayout(0,7));// 0으로 주면 자동으로 행증가
		
		
		Calendar cal = Calendar.getInstance(); //오늘날짜 가져오기
		cal.set(Calendar.DAY_OF_MONTH,1); //DAY_OF_MONTH를 1로 설정 (월의 첫날)
		// cal.set = 8월 1일로 달력을 설정함
		
		int first_week = cal.get(Calendar.DAY_OF_WEEK); //오늘 요일 가져오기
		//그 주의 요일 반환 (일:1 ~ 토:7) 결과는 2
		//1일이 무슨요일인지 알려주는거 
		
		int last = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		// 해당월의 마지막날짜가 몇일까지 있는지 알려주는거
		// 이번달의 마지막 날짜 8월 기준으로 결과는 31
		
		pnl2.add(new JLabel("일"));
		pnl2.add(new JLabel("월"));
		pnl2.add(new JLabel("화"));		
		pnl2.add(new JLabel("수"));
		pnl2.add(new JLabel("목"));
		pnl2.add(new JLabel("금"));
		pnl2.add(new JLabel("토"));
		
		
		for(int i=0;i<first_week-1;i++) {// 빈칸 붙이기 
			pnl2.add(new JLabel("")); //("")안에 ""를 안써도 되지않을까
		}
		
		for(int i=0;i<last;i++) {
			pnl2.add(new JButton((i+1)+""));
		}
		
		
		
		
		this.add(pnl1,"North");
		this.add(pnl2);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new CalendarEx();
	}

}
