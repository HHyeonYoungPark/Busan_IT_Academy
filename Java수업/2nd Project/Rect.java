package secondproject;

public class Rect { //�簢�� Ŭ����
	private int width; //����������
	private int height;
	
	
	Rect(){} //�ڵ����� ��������⸸ �ϸ� �Ǵ� �� ������
	//r.setSize(100,100); �̷��� ����ǵ��� ������
	
	Rect (int w, int h){ //�����ڰ�
		width=w;
		height=h;
	}
	void setSize(int w, int h) { //�޾ƿ� �� w, h��
		if(w>=1000) w=1000;
		
		if(h>=1000) h=1000;  //{}������ �ϳ��� �����ڴ�
		
		
		this.width= w;           // Ŭ���� ���� width�� height�� �־��ִ� �ż���
		this.height=h;
	}
	
	void printSize() {
		System.out.println("���δ� "+width+"�̰� ���δ� "+height);
	}
}
