import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

//select ������
//��ư ������ �ʰ� �޺��ڽ����� �����ϸ� �ٷ� ������ �ٲ� �����
public class GUIExComboBox3 extends HFrame implements ItemListener{
	JComboBox combo;
	JLabel lbl;
	public GUIExComboBox3() {
		String[] city = {"����","����","��û","����","�λ�","����"};
		combo = new JComboBox<>(city);
		combo.addItemListener(this);
		lbl = new JLabel("���Ⱑ ���̺�");
		this.add(combo, "North");
		this.add(lbl);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIExComboBox3();
	}

	@Override
	public void itemStateChanged(ItemEvent e) { // ���°� ���Ҷ� �۵�(ActionListner�� Ŭ���� �Ҷ� ����)
		if(e.getStateChange()==ItemEvent.SELECTED) {
			lbl.setText(e.getItem()+""); //���ٰ��� StrŸ������ +""�־��༭ ��ȯ
		}	
	}


}
