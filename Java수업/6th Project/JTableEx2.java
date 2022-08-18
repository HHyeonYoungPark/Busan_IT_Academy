import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableEx2 extends JFrame{
	public JTableEx2() {
		this.setSize(400, 300);
		this.setDefaultCloseOperation(3);
		
		String[] header = {"번호","제목","작성자"};
		String[][] contents = {};
		
		//JTable보다 먼저 model을 header,contents를 이용해서 만들어준다
		DefaultTableModel model = new DefaultTableModel(contents, header);
		
		// model릏 table에 넣어서 생성해줌
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		//값추가하기 ,Object[] roeData를 넣으라고 나옴
		String[] rowData = new String[3]; //0 1 2
		rowData[0] = "1";
		rowData[1] = "가면산장 살인사건";
		rowData[2] = "히가시노 게이고";
		
		String[] data = {"2","노르웨이의 숲","무라카미 하루키"};
		
		model.addRow(rowData);
		model.addRow(data);
		model.addRow(new String[] {"3","삼대","염상섭"});
		
		model.removeRow(0);
		model.removeRow(0); //0번을 두번지우면 먼저번째 0번째가 지워지고 번호가 당겨진 후 다시 0번째 컨텐츠가 지워진다
		
		this.add(sp);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new JTableEx2();
	}
}
