import java.awt.Color;

import javax.swing.JPanel;

public class CPanel extends JPanel{ //���⼭ ���ϴ� this == JPanel
	public CPanel() {
		//super(); <= �θ��� �����ڸ� �ݵ�� �ҷ��� �ϴ°� �ƴϴ�. �̰� �Ƚᵵ �̹� �ִ�.
		// �ֳĸ� �θ� ������ڸ� ������ �����ϱ� �˾Ƽ� ȣ���Ѵ�.	
		// ���� �θ� �� ������() <= ��ȣ �ȿ� �ƹ��͵� ���� �����ڰ� ���ٸ� �ݵ��
		// super(�Ű�����) <= �θ��� �����ڸ� ��������� ȣ���ؾ� ��.
	}
	
	public CPanel(Color c) {
		//super();
		this.setBackground(c); //JPanel�� ��� �ִ� �޼���
	}
}
