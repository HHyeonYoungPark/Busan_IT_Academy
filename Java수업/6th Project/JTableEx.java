import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableEx extends JFrame{
	public JTableEx() {
		this.setSize(600,400);
		this.setDefaultCloseOperation(3);
		// JTable고 고정일 떄는 그냥 사용, 유동적일때는 Model 사용 (List와 비슷하다)
		Calendar calendar = Calendar.getInstance();
		// 날짜는 기본적으로 모든 시스템에서 공유한다. 이 날짜는 pc의 시간과 같다
		// 그러므로 생성이 아닌 이미 생성된걸 가져와서 쓴다.
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String day = sdf.format(calendar.getTime());
		// Calender에서 오늘 날짜+시간을 가져와서 format의 모양에 맞게 출력
		
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy-MM-dd");
		String day2 = sdf2.format(calendar.getTime());
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("MM월dd일");
		String day3 = sdf3.format(calendar.getTime());
		
		String[] header = {"번호","제목","날짜"};
		String[][] contents = {
				{"1","노인과 바다",day}, // 0 1 2
				{"2","오만과 편견",day2}, // 0 1 2
				{"3","레미제라블",day3}, // 0 1 2
				{"4","이순신",day} 
		};
		
		JTable table = new JTable(contents,header);
		
		System.out.println(table.getValueAt(1, 1));
		// 배열이라 0부터 시작한다 , 값 출력하기
		table.setValueAt("달과6펜스", 2, 1);
		// 값을 바꿀 수 있음
		System.out.println(table.getRowCount()); //총 줄수
		System.out.println(table.getColumnCount()); //총 열수
		System.out.println(table.getColumnName(1)); //컬럼명 출력하기
		
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		
		this.setLocationRelativeTo(null); // 실행시 화면이 가운데로 나옴
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new JTableEx();
	}
}
