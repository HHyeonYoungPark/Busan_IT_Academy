import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIEx1 extends JFrame implements ActionListener{
	//ActionListener는 클릭 이벤트, 버튼같은거 클릭했을 때 발생
	JButton btn;
	void printGui() {
		this.setSize(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btn = new JButton();
		btn.addActionListener(this);
		this.add(btn);
		this.setVisible(true);
	}
	
	void printGui1() {
		System.out.println("프린트");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn) {
			printGui(); //이벤트가 일어나면 메서드를 실행시킴
			// 이벤트 드리븐 프로그래밍
			// 각 버튼마다 이벤트를 실행시킴
		}
	}
	
	// 스윙 프로그래밍 = 자바의 GUI(Graphic User Interface) <->CLI (Command Line Interface)
	// AWT = 자바의 GUI. 다만 OS의 리소스를 가져다 쓴다
	// Swing = 자바의 GUI. 자체 리소스를 사용한다 
	
	// 컨테이너 = 컴포넌트에 담을 수 있는 객체
	// JFrame,JPanel, JDialog, JApplet(애니메이션같은거,플래쉬,움짤 - 보안, 설치등의 문제로 지금은 아예 안씀)
	
	// 컴포넌트 = 컨테이너에 붙일 수 있는 객체
	// JButton, JPanel, JCheckBox, JRadioButton, JTextField, JPasswordField, JTextArea, JComboBox,
	// JList, JProgressBar, JToolTip, JScrollPane, JMenu, JTable, JTree, JToolBar, JTebbedPane, JSplitPane
	
	public static void main(String[] args) {
//		GUIEx1 g = new GUIEx1();
//		g.printGui();
		new GUIEx1();
	}
	
}
