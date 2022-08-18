
class BookEx {
	//도서입력
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
		stock = "재고있음";
		if(k == false) {
			stock = "재고없음";
		}
	}
	void insertScore(double c) {
		score = c;
	}
	void showData() {
		System.out.println(title+ ", "+ price+ "원, "+ stock+ ", 평점:"+ score);
	}
	public static void main(String args[]){
	    BookEx b = new BookEx();
	    b.insertTitle("오만과 편견");
	    b.insertPrice(12000);
	    b.insertStock(true); // 현재 재고가 있는가?
	    b.insertScore(9.5);
	    b.showData(); 
	   //결과-오만과편견, 12000원, 재고있음, 평점 9.5
	}
}
