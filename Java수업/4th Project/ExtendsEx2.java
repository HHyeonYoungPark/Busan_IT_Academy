import javax.swing.JFrame;

public class ExtendsEx2 extends JFrame{ //JFrame을 내부적으로 들고있다. 상속을 받았기때문에
	public ExtendsEx2() {
		this.setSize(300, 300); // 부모가 가지고 있던 메서드
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 부모가 가지고 있던 메서드
		this.setVisible(true);// 부모가 가지고 있던 메서드
	}
	
	public void setSize(int w, int h) { // 부모가 가지고 있는것과 같은 이름의 내 메서드
		// 부모의 메서드가 마음에 안드면 똑같이 만들어서 바꾸고 싶은 내용을 바꾸면된다.
		// 오버라이딩 - 내용을 바꿔버리는것
	}
	
	
	public void printSize() { //내가 만든  메서드
		System.out.println(this.getSize());
	}
	
	
	public static void main(String[] args) {
		ExtendsEx2 ee = new ExtendsEx2();
	}
}
