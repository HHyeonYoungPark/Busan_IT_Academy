import java.util.Scanner;

class BookManager{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int bookSize=3;
		
		String book[] = new String[bookSize];
		int idx=0;
		
		while(true){
			System.out.println("책을 입력합니다:");
			String input = sc.nextLine(); //한줄 입력합니다.
			book[idx]=input;
			idx++; //그러면 자동으로 다음 book[]에 입력됨.
			if(idx==book.length){
				break;
			}
		}
		for(int i=0;i<book.length;i++){
			System.out.println(book[i]);
		}
	}
}