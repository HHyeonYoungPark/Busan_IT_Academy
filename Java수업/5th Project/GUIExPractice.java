import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;

public class GUIExPractice extends HFrame implements ActionListener{
	JButton btn1, btn2;
	JList list1, list2;
	JPanel pnl;
	DefaultListModel model1, model2;
	
	public GUIExPractice() {
		btn1 = new JButton(">");
		btn2 = new JButton("<");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		String[] city = {"서울","강원","충청","대전","부산","제주"};
		
		model1 = new DefaultListModel();
		model2 = new DefaultListModel();
		list1 = new JList(model1);
		list2 = new JList(model2);
		
		
		for(int i=0;i<city.length;i++) {
			model1.addElement(city[i]);
		}
		
		list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);		
		list2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list1.setBackground(Color.YELLOW);
		list2.setBackground(Color.GREEN);
		
		pnl = new JPanel();
		pnl.setLayout(new GridLayout(0,2));
		pnl.add(list1);
		pnl.add(list2);
			
		this.add(btn1,"North");
		this.add(pnl);
		this.add(btn2,"South");
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new GUIExPractice();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			if(model1.getSize()>0){
				model2.addElement(list1.getSelectedValue());
				model1.remove(list1.getSelectedIndex());
			}	
		}else if(e.getSource()==btn2) {
			if(model2.getSize()>0) {
				model1.addElement(list2.getSelectedValue());
				model2.remove(list2.getSelectedIndex());
			}			
		}
	}
}
