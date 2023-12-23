package library2;

//import java.util.Scanner;

public class Library {
	private Book [] books;
	private int bookcnt = 0;
	private final int capacity;  // 수용력 , 공간 
	
	public Library (final int capacity ) {
		books = new Book [capacity];
		this.capacity = capacity;
				
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("저장할 책의 갯수를 입력하세요.");
//		int i = scanner.nextInt();		
//		Book [] books = new Book[i];
		
	}
	public void addbook(final Book book) {
		books[bookcnt] = book; 
		bookcnt++;
		
	}
	void printAll() {
		System.out.println("도서관 책");
		for (int i = 0; i< bookcnt; i++ ) {
			Book  book = books[i];
			book.print();
		}
	}
	

}