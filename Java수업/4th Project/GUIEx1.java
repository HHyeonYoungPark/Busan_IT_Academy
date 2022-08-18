import javax.swing.JButton;
import javax.swing.JFrame;

//BorderLayout

public class GUIEx1 {
	public static void main(String[] args) {
		JFrame f = new JFrame(); // 창을 만들었다
		f.setSize(300, 200); // 창을 만들어 창이름 f안에 있는 여러 메서드들을 사용가능하다
							 // 이 메서드들은 대부분 f의 설정, 값등을 넣거나 가져오는 기능들이다
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton();
		btn5.setText("버튼5"); // text를 넣는 메서드도 있다
		
		f.add(btn1, "North"); // 위치를 지정해줌
		f.add(btn2, "East");
		f.add(btn3, "West");
		f.add(btn4, "South");
		f.add(btn5, "Center"); // 안써도 기본이 center
		
		
		f.setVisible(true); // 화면에 보여라
	}
}

/*
-레이아웃
BorderLayout - JFrame

FlowLayout

GridLayout

null - 절대 레이아웃
*/