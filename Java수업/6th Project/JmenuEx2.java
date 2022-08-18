import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class JmenuEx2 extends JFrame{
	public JmenuEx2() {
		this.setSize(400,400);
		this.setDefaultCloseOperation(3);
		
		JMenuBar bar = new JMenuBar();
		
		JMenu menu1 = new JMenu("File");
		menu1.setMnemonic(KeyEvent.VK_F);
		JMenu menu2 = new JMenu("Edit");
		menu2.setMnemonic(KeyEvent.VK_E);
		JMenu menu3 = new JMenu("Source");
		menu3.setMnemonic(KeyEvent.VK_S);
		
		JMenuItem item1 = new JMenuItem("New");
		JMenuItem item2 = new JMenuItem("Open File...");
		JMenuItem item3 = new JMenuItem("Open Projects from...");
		JMenuItem item4 = new JMenuItem("Recent File");
		JMenuItem item5 = new JMenuItem("Close");
		JMenuItem item6 = new JMenuItem("Undo Typing");
		JMenuItem item7 = new JMenuItem("Redo");
		JMenuItem item8 = new JMenuItem("Cut");
		JMenuItem item9 = new JMenuItem("Copy");
		JMenuItem item10 = new JMenuItem("Copy Qualified Name");
		JMenuItem item11 = new JMenuItem("Toggle Comment");
		
		item2.setIcon(new ImageIcon("file.png"));
		
		item1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.ALT_MASK));
		item5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
		item6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
		item7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, ActionEvent.CTRL_MASK));
		item8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
		item9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
		item11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_SLASH, ActionEvent.CTRL_MASK));
		
		bar.add(menu1);
		bar.add(menu2);
		bar.add(menu3);
		
		menu1.add(item1);
		menu1.add(item2);
		menu1.add(item3);
		menu1.add(item4);
		menu1.add(item5);
		
		menu2.add(item6);
		menu2.add(item7);
		menu2.add(item8);
		menu2.add(item9);
		menu2.add(item10);
		
		menu3.add(item11);
		menu3.add(new JMenuItem("Add Block Comment"));
		menu3.add(new JMenuItem("Remove Block Comment"));
		menu3.add(new JMenuItem("Generate Element Comment"));
		menu3.add(new JMenuItem("shift Right"));
		
		this.setJMenuBar(bar);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new JmenuEx2();
	}
}
