
class BookEx {
	//�����Է�
	String title;
	int price;
	String stock;
	double score;
	
	void insertTitle(String t) {
		title = t;
	}
	void insertPrice(int p) {
		price = p;
	}
	void insertStock(boolean k) {
		stock = "�������";
		if(k == false) {
			stock = "������";
		}
	}
	void insertScore(double c) {
		score = c;
	}
	void showData() {
		System.out.println(title+ ", "+ price+ "��, "+ stock+ ", ����:"+ score);
	}
	public static void main(String args[]){
	    BookEx b = new BookEx();
	    b.insertTitle("������ ���");
	    b.insertPrice(12000);
	    b.insertStock(true); // ���� ��� �ִ°�?
	    b.insertScore(9.5);
	    b.showData(); 
	   //���-���������, 12000��, �������, ���� 9.5
	}
}
