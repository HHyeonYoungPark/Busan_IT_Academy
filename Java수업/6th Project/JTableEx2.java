import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableEx2 extends JFrame{
	public JTableEx2() {
		this.setSize(400, 300);
		this.setDefaultCloseOperation(3);
		
		String[] header = {"��ȣ","����","�ۼ���"};
		String[][] contents = {};
		
		//JTable���� ���� model�� header,contents�� �̿��ؼ� ������ش�
		DefaultTableModel model = new DefaultTableModel(contents, header);
		
		// model�k table�� �־ ��������
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		//���߰��ϱ� ,Object[] roeData�� ������� ����
		String[] rowData = new String[3]; //0 1 2
		rowData[0] = "1";
		rowData[1] = "������� ���λ��";
		rowData[2] = "�����ó� ���̰�";
		
		String[] data = {"2","�븣������ ��","����ī�� �Ϸ�Ű"};
		
		model.addRow(rowData);
		model.addRow(data);
		model.addRow(new String[] {"3","���","����"});
		
		model.removeRow(0);
		model.removeRow(0); //0���� �ι������ ������° 0��°�� �������� ��ȣ�� ����� �� �ٽ� 0��° �������� ��������
		
		this.add(sp);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new JTableEx2();
	}
}
