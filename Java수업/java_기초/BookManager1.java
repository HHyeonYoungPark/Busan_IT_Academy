import java.util.Scanner;

class BookManager1{
	
// ==도서관리프로그램==
// 메뉴를 선택하세요 (1.책입력 2.책삭제 3.전체출력 4.책검색 5.종료)

// 10개짜리 String 배열을 만듭니다
// 처음엔 전부 다 "책없음" 이라는 내영으로 다 넣어 둡니다.
// 1.책입력을 선택하면 배열에 순서대로 입력한 책들이 입력됩니다.
// 2.책삭제를 선택하면 원래 있던 책이름이 "책없음"으로 바뀌면 된다

// 번호를 물어보고 책을 입력,삭제,검색을 할 수 있게,,,

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int bookSize=10;		
		String book[] = new String[bookSize];
		
		book[0]="책없음";
		book[1]="책없음";
		book[2]="책없음";
		book[3]="책없음";
		book[4]="책없음";
		book[5]="책없음";
		book[6]="책없음";
		book[7]="책없음";
		book[8]="책없음";
		book[9]="책없음";

		
		System.out.println("==도서관리프로그램==");
		while(true){
			System.out.println("메뉴를 선택하세요(1.책입력 2.책삭제 3.전체출력 4.책검색 5.종료)");
			int menu = sc.nextInt();// 메뉴 입력
			
			if(menu==1){
				System.out.println("입력할 공간을 선택하세요: "); 
				int idx = sc.nextInt();
				System.out.println("책제목을 입력하세요: "); 
				sc.nextLine();
				String title = sc.nextLine();
				book[idx]= title;
					
			}else if(menu==2){
				System.out.println("삭제할 공간을 선택하세요: ");
				int idx = sc.nextInt();
				book[idx]= "책없음";
				
			}else if(menu==3){
				for(int i=0;i<book.length;i++){
					System.out.println(book[i]);
				}
			}else if(menu==4){
				System.out.println("검색할 책이름을 입력하세요: ");
				sc.nextLine();
				
								
			}else if(menu==5){
				System.out.println("종료합니다!");
				break;
			}
					
		}	
	}
}