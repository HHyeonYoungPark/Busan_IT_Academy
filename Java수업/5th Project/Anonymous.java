import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
// 익명클래스(일회용클래스)
public class Anonymous {
	public static void main(String[] args) {
		JButton btn = new JButton();
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("aa");
			}
		});
	}
}
