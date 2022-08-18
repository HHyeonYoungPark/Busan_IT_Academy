import javax.swing.JButton;
import javax.swing.JFrame;

//null - 절대레이아웃
public class GUIEx4 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x 누르면 진짜 종료
		f.setLayout(null); // 기본 레이아웃을 없애버림
		
		JButton btn = new JButton("버튼");
		f.add(btn);
		btn.setSize(70, 50); // 사이즈와 위치도 각각 설정해줘야 한다
		btn.setLocation(10, 10); // x,y 좌표값
		
		
		f.setSize(300, 200);
		f.setVisible(true);		
	}
}
