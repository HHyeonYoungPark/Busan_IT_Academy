import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimeGUIEx2 extends JFrame implements ActionListener{
	JLabel lbl1, lbl2;
	JButton btnStart, btnStop;
	Calendar cal;
	int year, month, day, hour, minute, second;
	
	public TimeGUIEx2() {
		this.setSize(300, 200);
	    this.setDefaultCloseOperation(3);
	    
	    cal = Calendar.getInstance();
	    
	    year = cal.get(Calendar.YEAR);
	    month = cal.get(Calendar.MONTH);
	    day = cal.get(Calendar.DAY_OF_WEEK);
	    hour = cal.get(Calendar.HOUR);
	    minute = cal.get(Calendar.MINUTE);
	    second = cal.get(Calendar.SECOND);
	    
	    
		
		
	    
	    this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public static void main(String[] args) {
		new TimeGUIEx2();
	}
	
}
