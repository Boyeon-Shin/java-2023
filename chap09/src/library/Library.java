package library;

public class Library  {
	private Book [] books;
	private int bookCnt = 0;
	private final int capacity;
	
	
	public Library(final int capacity) {
		books = new Book[capacity];
		this.capacity = capacity;
	}
	
	public void addBook(final Book book) {
		books[bookCnt] = book;
		bookCnt++;
	}
	
	
	void PrintAll(){
		System.out.println("Library Books"); {
			for(int i =0; i< bookCnt; i++ ) {
				Book book = books[i];
				book.print();
			}
		}
	}
	
	
	
}
