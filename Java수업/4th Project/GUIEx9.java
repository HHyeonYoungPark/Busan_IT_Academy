import javax.swing.JButton;

public class GUIEx9 extends MFrameMe{
	public GUIEx9() {
		//super(); // 없어도 자동 호출
		//super(700,600);
		//super(1000, 500,Color.RED); // contentPane 사용해야함
		//super(1000,500,null,MFrame.FLOW_LAYOUT);
		
		JButton btn = new JButton("클릭");
		this.add(btn);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIEx9();
	}
}
