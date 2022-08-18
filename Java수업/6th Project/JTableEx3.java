import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class JTableEx3 extends JFrame implements ActionListener{
	JButton btnAdd, btnDel;
	JTextField tf1, tf2;
	JTable table;
	DefaultTableModel model;
	Calendar calendar;
	SimpleDateFormat sdf;
	int i = 1;	
	
	public JTableEx3() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(3);
		
		String[] header = {"번호","제목","작성자","작성시간"};
		String[][] contents = {};
		
		model = new DefaultTableModel(contents, header);	
		table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		tf1 = new JTextField(12);
		tf2 = new JTextField(6);
		btnAdd = new JButton("추가");
		btnDel = new JButton("삭제");
		btnAdd.addActionListener(this); 
		btnDel.addActionListener(this);
		
		JPanel pnlTable = new JPanel();
		JPanel pnlInput = new JPanel();
		
		pnlTable.add(sp);
		
		pnlInput.add(tf1);
		pnlInput.add(tf2);
		pnlInput.add(btnAdd);
		pnlInput.add(btnDel);
		
		this.add(pnlTable);
		this.add(pnlInput, "South");
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new JTableEx3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== btnAdd) {
			String str1 = tf1.getText();
			String str2 = tf2.getText();
			Object[] data = new Object[4];
			
			calendar = Calendar.getInstance();
			sdf = new SimpleDateFormat("HH시mm분ss초");
			String time = sdf.format(calendar.getTime());
			
			data[0] = i++;
			data[1] = str1;
			data[2] = str2;
			data[3] = time;
			
			model.addRow(data);
		}else if(e.getSource()==btnDel) {
	
			int selected = table.getSelectedRow();
			model.removeRow(selected);
		}
	}
}
