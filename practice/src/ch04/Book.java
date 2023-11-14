//package Circlep;
//
//public class Book {
//	String title;
//	String author;
//
//	public Book() {
//		this.title = "no title";
//		author = "no author";
//	}
//
//	public Book(String title) {
//		this.title = title;
//		author = "no author";
//	}
//
//	public Book(String title, String author) {
//		this.title = title;
//		this.author = author;
//
//	}
//
//	public static void main(String[] args) {
//		Book book3 = new Book();
//		System.out.println(book3.title + " : " + book3.author);
//
//		Book book = new Book("춘향전");
//		System.out.println(book.title + " : " + book.author);
//
//		Book book2 = new Book("어린왕자", "생텍쥐페리");
//		System.out.println(book2.title + " : " + book2.author);
//
//	}
//}

package ch04;

public class Book {
	String title;
	String author;
	
	void show() {
		System.out.println(title + " " + author);
	}
	
	public Book() {
		this("", "");
		System.out.println("셍성자 호출됨");
		
	}

	public Book(String title) {
		this(title, "작자미상");
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;

	}

	public static void main(String[] args) {
		Book book3 = new Book();
		
		Book book = new Book("춘향전");
		

		Book book2 = new Book("어린왕자", "생텍쥐페리");
		book.show();
		book2.show();
		

	}
}