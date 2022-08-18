import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

//select 같은거
//버튼 누르지 않고 콤보박스에서 선택하면 바로 내용이 바뀌어서 적용됨
public class GUIExComboBox3 extends HFrame implements ItemListener{
	JComboBox combo;
	JLabel lbl;
	public GUIExComboBox3() {
		String[] city = {"서울","강원","충청","대전","부산","제주"};
		combo = new JComboBox<>(city);
		combo.addItemListener(this);
		lbl = new JLabel("여기가 레이블");
		this.add(combo, "North");
		this.add(lbl);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIExComboBox3();
	}

	@Override
	public void itemStateChanged(ItemEvent e) { // 상태가 변할때 작동(ActionListner는 클릭을 할때 변함)
		if(e.getStateChange()==ItemEvent.SELECTED) {
			lbl.setText(e.getItem()+""); //밑줄가면 Str타입으로 +""넣어줘서 변환
		}	
	}


}
