package library;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileinputOutputEx {
	public static void main(String[] args) {
//		File file = new File("books.txt");  // 지움 

		try (Scanner scanner = new Scanner(new File("book2.txt"))){
//			Scanner scanner = new Scanner(new File("books.txt")); // 파일용도로 쓰기 키보드 입력이 아닌
			while (scanner.hasNextLine()) {
				
//				System.out.println(scanner.nextLine());
				String line = scanner.nextLine();
				String[] splitLine = line.split(",");

				String title = splitLine[0].trim(); // trim 문자 앞쪽, 뒤쪽 공백 지워줌
				String author = splitLine[1].trim();
				int years = Integer.parseInt(splitLine[2].trim());
				int price = Integer.parseInt(splitLine[3].trim());
				boolean renting = Boolean.parseBoolean(splitLine[4].trim());

//				System.out.println(splitLine.length);
				System.out.println(title);
				System.out.println(author);
				System.out.println(years);
				System.out.println(price);
				System.out.println(renting);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
