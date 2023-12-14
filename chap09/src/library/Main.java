package library;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Library library = new Library(100);
//		File file = new File("books.txt");  // 지움 

		try (Scanner scanner = new Scanner(new File("books.txt"))) {

//			Scanner scanner = new Scanner(new File("books.txt")); // 파일용도로 쓰기 키보드 입력이 아닌
			while (scanner.hasNextLine()) {
//				System.out.println(scanner.nextLine());

				String line = scanner.nextLine();
				String[] splitLine = line.split(",");

				if (splitLine.length < 5) {
					continue;
				}

				String title = splitLine[0].trim(); // trim 문자 앞쪽, 뒤쪽 공백 지워줌
				String author = splitLine[1].trim();
				int pubYear = Integer.parseInt(splitLine[2].trim());
				String publisher = splitLine[3].trim();
				boolean renting = Boolean.parseBoolean(splitLine[4].trim());

				Book book = new Book(title, author, pubYear, publisher);

				book.setRenting(renting);

				book.print();

				library.addBook(book);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		library.PrintAll();
	}

}
