import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

//select 같은거
public class GUIExComboBox2 extends HFrame implements ActionListener{
	JComboBox combo;
	JLabel lbl;
	JButton btn;
	public GUIExComboBox2() {
		String[] city = {"서울","강원","충청","대전","부산","제주"};
		combo = new JComboBox<>(city);  //<>는 있어도 없어도 그만..
		lbl = new JLabel("여기에 레이블이 있다");
		btn = new JButton("클릭");
		btn.addActionListener(this);
		this.add(combo, "North");
		this.add(lbl);
		this.add(btn,"South");
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIExComboBox2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = combo.getSelectedItem()+"";
		lbl.setText(str);
	}

}
