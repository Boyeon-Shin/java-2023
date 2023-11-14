package ch04;

import java.util.Scanner;

class Library {
	String title;
	String author;

	public Library (String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class Book2{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Library [] B = new Library[2];

		for (int i = 0; i < B.length; i++) {
			System.out.print("제목 >> ");
			String title = scanner.nextLine();
			System.out.print("저자 >> ");
			String author = scanner.nextLine();
			B[i] = new Library (title, author);

		}
		for (int i = 0; i < B.length; i++) {
			System.out.println("(" + B[i].title + ", " + B[i].author + ")");

		}
		scanner.close();

	}
}
