import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class TabbedPaneEx2 extends JFrame{
	JPanel pnl1, pnl2, pnl3;
	JTextArea ta;
	JTabbedPane tabPnl;
	
	public TabbedPaneEx2() {
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ta = new JTextArea();
		JScrollPane sp = new JScrollPane(ta);
		pnl1 = new JPanel(new BorderLayout());
		pnl2 = new JPanel();
		pnl3 = new JPanel();
		
		pnl1.add(new JButton("버튼"), "North");
		pnl1.add(new JButton("버튼"), "East");
		pnl1.add(new JButton("버튼"), "West");
		pnl1.add(new JButton("버튼"));
		pnl1.add(new JButton("버튼"), "South");
		
		pnl2.add(new JButton("버튼"));
		pnl2.add(new JButton("버튼"));
		pnl2.add(new JButton("버튼"));
		
		pnl3.setLayout(new GridLayout(0, 3));
		pnl3.add(new JButton("버튼"));
		pnl3.add(new JButton("버튼"));
		pnl3.add(new JButton("버튼"));
		pnl3.add(new JButton("버튼"));
		pnl3.add(new JButton("버튼"));
		pnl3.add(new JButton("버튼"));
		pnl3.add(new JButton("버튼"));
		pnl3.add(new JButton("버튼"));
		pnl3.add(new JButton("버튼"));
		
		tabPnl = new JTabbedPane();
		tabPnl.add("Border", pnl1);
		tabPnl.add("Flow", pnl2);
		tabPnl.add("Grid", pnl3);
		tabPnl.add("TextArea", sp);
		
		
		this.add(tabPnl);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new TabbedPaneEx2();
	}
}
