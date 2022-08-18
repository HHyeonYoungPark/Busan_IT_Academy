import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableEx extends JFrame{
	public JTableEx() {
		this.setSize(600,400);
		this.setDefaultCloseOperation(3);
		// JTable�� ������ ���� �׳� ���, �������϶��� Model ��� (List�� ����ϴ�)
		Calendar calendar = Calendar.getInstance();
		// ��¥�� �⺻������ ��� �ý��ۿ��� �����Ѵ�. �� ��¥�� pc�� �ð��� ����
		// �׷��Ƿ� ������ �ƴ� �̹� �����Ȱ� �����ͼ� ����.
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String day = sdf.format(calendar.getTime());
		// Calender���� ���� ��¥+�ð��� �����ͼ� format�� ��翡 �°� ���
		
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy-MM-dd");
		String day2 = sdf2.format(calendar.getTime());
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("MM��dd��");
		String day3 = sdf3.format(calendar.getTime());
		
		String[] header = {"��ȣ","����","��¥"};
		String[][] contents = {
				{"1","���ΰ� �ٴ�",day}, // 0 1 2
				{"2","������ ���",day2}, // 0 1 2
				{"3","���������",day3}, // 0 1 2
				{"4","�̼���",day} 
		};
		
		JTable table = new JTable(contents,header);
		
		System.out.println(table.getValueAt(1, 1));
		// �迭�̶� 0���� �����Ѵ� , �� ����ϱ�
		table.setValueAt("�ް�6�潺", 2, 1);
		// ���� �ٲ� �� ����
		System.out.println(table.getRowCount()); //�� �ټ�
		System.out.println(table.getColumnCount()); //�� ����
		System.out.println(table.getColumnName(1)); //�÷��� ����ϱ�
		
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		
		this.setLocationRelativeTo(null); // ����� ȭ���� ����� ����
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new JTableEx();
	}
}
