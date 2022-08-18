import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class GUIExList2 extends HFrame implements ActionListener{
	JTextField tf;
	JButton btnAdd, btnDel;
	JList list;
	DefaultListModel model; // 리스트에 값을 추가, 수정, 삭제가 가능하게 만들어 주는 객체
	public GUIExList2() {
		tf = new JTextField(15);
		btnAdd = new JButton("추가");
		btnDel = new JButton("삭제");
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		JPanel pnl = new JPanel();
		pnl.add(tf);
		pnl.add(btnAdd);
		pnl.add(btnDel);
		
		model = new DefaultListModel();
		
		list = new JList(model); // 배열을 넣어서 초기값을 만들어 줄 수 있다.
							// 하지만 JList, JComboBox, JTable 같은 경우 배열로 넣으면 수정,삭제가 안된다
							// -> 그 값으로 고정되어 있어서 가져올 수만 있다
		JScrollPane sp = new JScrollPane(list); //스크롤추가
		this.add(pnl,"North");	
		this.add(sp);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIExList2();
	}
	
	public void addItem(){
		//이런식으로 처리해서 밑에를 간결하게 할 수 있다
	}
	public void delItem(){
		//이런식으로 처리해서 밑에를 간결하게 할 수 있다
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAdd){
			String str = tf.getText();
			str = str.trim(); // 좌우 공백 삭제(빈칸)
			if(str.equals("")) {
				JOptionPane.showMessageDialog(this, "빈값은 넣을 수 없다");
				                         // 어떤창 위에? , 출력될 메세지
			}else {
				model.addElement(str); // 값추가
				tf.setText("");
			}
			
		}else if(e.getSource()==btnDel) {
			int idx = list.getSelectedIndex(); //순서 번호 가져오기
			if(idx<0) {
				JOptionPane.showMessageDialog(this, "선택된 값이 없습니다"); //예외처리
			}else {
				model.remove(idx);
			}
			
		}
	}
}
