import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuiEx1 { //스윙 - 로컬프로그램
	public static void main(String[] args) {
		JFrame frame = new JFrame(); // 창하나 만들기
		frame.setSize(500,500); // 크기설정
		
		JPanel pnl = new JPanel(); //패널 만들기
		pnl.setBackground(Color.red); //패널 배경 빨간색
		
		JButton btn = new JButton("클릭"); // 버튼만들기
		pnl.add(btn); //만들어진 버튼을 패널에 붙이기
		
		frame.add(pnl); //프레임에 패널 붙이기
		frame.setVisible(true); // 화면에 표시하기, 화면에 다 만든다음에 마지막에 보여주기; 
	}
}
