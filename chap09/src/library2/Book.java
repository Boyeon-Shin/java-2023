package library2;

public class Book {
	private String title;
	private String author;
	private int pubYear;
	private String publisher;

	private boolean renting;

	public Book(final String title, final String author, final int pubYear, final String publisher) {
		this.title = title;
		this.author = author;
		this.pubYear = pubYear;
		this.publisher = publisher;
		this.renting = false;
	}

	public String getTitle() {
		return this.title;
	}

	public String getauthor() {
		return this.author;
	}

	public int getpubYear() {
		return this.pubYear;
	}

	public String getpublisher() {
		return publisher;
	}

	public boolean isRenting() {
		return renting;
	}
	// setter 메소드
	public void setRenting(final boolean renting) {
		this.renting = renting;
	}

	
	void print() {
		System.out.println("책 이름: "  + title + '/'+
				 "저자명: " + author + '/'
				+ "출판연도: " + pubYear + '/'
				+ "출판사: " + publisher + '/' 
				+ renting );
	}
}
