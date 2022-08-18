import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;

//select 같은거
public class GUIExComboBox extends HFrame implements ActionListener{
	JComboBox combo;
	JLabel lbl;
	public GUIExComboBox() {
		String[] city = {"서울","강원","충청","대전","부산","제주"};
		combo = new JComboBox<>(city);  //<>는 있어도 없어도 그만..
		combo.addActionListener(this);
		
		lbl = new JLabel("여기에 레이블이 있다");
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
		System.out.println(cb.getSelectedIndex()); //내가 선택한 번호를 보여줌
		int idx = cb.getSelectedIndex();
		System.out.println(cb.getSelectedItem()); //내가 선택한 이름을 보여줌
		String str = (cb.getSelectedItem()+""); // String 타입으로 전환하지 않아도 +""하면 문자로 전환됨
		lbl.setText(str);
	}
}
