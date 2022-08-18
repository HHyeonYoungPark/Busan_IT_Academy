import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class TabbedPaneEx extends JFrame{
	public TabbedPaneEx() {
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabPnl = new JTabbedPane();
		tabPnl.add("메뉴1", new JTextArea());
		tabPnl.add("메뉴2", new JTextArea());
		
		JTextArea ta = new JTextArea();
		
		this.add(ta);
		this.add(tabPnl, "North"); // 센터에 패널이 꽉차게 붙는다
		
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new TabbedPaneEx();
	}
}
