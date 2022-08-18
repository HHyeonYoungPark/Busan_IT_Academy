import javax.swing.JButton;
import javax.swing.JLabel;

//매개 변수의 다형성

public class GUIEx10 extends MFrame{
	public GUIEx10() {
		JButton btn1 = new JButton("클릭");
		JLabel lbl1 = new JLabel("제목");
		this.add(lbl1,"North"); //( , ) 들어가는 내용이 문법적으로 문제가 없어도 쓸데가 없을 수 있음?
		this.add(btn1);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIEx10(); 
	}
}
