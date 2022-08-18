import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class IOTest extends JFrame{
	JPanel pnl;
	JButton btn;
	JCheckBox ck;
	JRadioButton rb;
	public IOTest() {
		pnl = new JPanel();
		btn = new JButton("버튼");
		ck = new JCheckBox("체크박스");
		rb = new JRadioButton("라디오버튼");
		pnl.add(btn);
		pnl.add(ck);
		pnl.add(rb);
		this.add(pnl); //this는 JFrame을 의미함
		
		this.setSize(500, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		IOTest iot = new IOTest();
		System.out.println(iot.pnl.getComponentCount());
		//담을 수 있는 것  JPanel, JFrame - container
		//담기는 것  btn, ck, rb - component
		
		int cnt = 0;
		for(int i=0;i<iot.pnl.getComponentCount();i++) {
			if(iot.pnl.getComponent(i) instanceof JButton) {
				System.out.println(((JButton)iot.pnl.getComponent(i)).getText()); // JButton에 있는 text도 가져올 수 있음
				cnt++; //JButton이 몇개인지 알 수 있음
			} //가져온 변수(생성된 instance)가 어떤 타입인지 확인 가능
		}
		System.out.println(cnt);
	}
}
