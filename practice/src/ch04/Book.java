package ch04;

import java.util.Scanner;

public class Book {
	String title;
	String author;
	
	void show() {
		System.out.println((title + " " + author));
	}
	public Book () {
		this ( "" , "" );
		System.out.println("아무것도 적히지 않았습니다. ");
	}
	public Book (String title) {
		this(title, "작자 미상");
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public static void main(String [] args ) {
		Scanner scanner = new Scanner(System.in);
	}
	
}
