import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;

//select ������
public class GUIExComboBox extends HFrame implements ActionListener{
	JComboBox combo;
	JLabel lbl;
	public GUIExComboBox() {
		String[] city = {"����","����","��û","����","�λ�","����"};
		combo = new JComboBox<>(city);  //<>�� �־ ��� �׸�..
		combo.addActionListener(this);
		
		lbl = new JLabel("���⿡ ���̺��� �ִ�");
		this.add(combo, "North");
		this.add(lbl);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIExComboBox();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox cb = (JComboBox) e.getSource();
		System.out.println(cb.getSelectedIndex()); //���� ������ ��ȣ�� ������
		int idx = cb.getSelectedIndex();
		System.out.println(cb.getSelectedItem()); //���� ������ �̸��� ������
		String str = (cb.getSelectedItem()+""); // String Ÿ������ ��ȯ���� �ʾƵ� +""�ϸ� ���ڷ� ��ȯ��
		lbl.setText(str);
	}
}
