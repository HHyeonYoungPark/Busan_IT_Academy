import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class GUIExCheckBox extends HFrame implements ItemListener{
	// ItemListener는 체크 박스와 같이 선택 하는것에 사용
	JCheckBox ck1,ck2,ck3;
	public GUIExCheckBox() {
		super(new FlowLayout());
		ck1 = new JCheckBox("딸기");
		ck2 = new JCheckBox("망고");
		ck3 = new JCheckBox("사과");
		ck1.addItemListener(this);
		ck2.addItemListener(this);
		ck3.addItemListener(this);
		this.add(ck1);
		this.add(ck2);
		this.add(ck3);
		this.setVisible(true);
	}	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
			if(e.getSource() ==ck1) {
				if(ck1.isSelected()) {
					System.out.println("체크됨");
				}else {
					System.out.println("체크풀림");
				}
			}
	}
	public static void main(String[] args) {
		new GUIExCheckBox();
	}
	

}
