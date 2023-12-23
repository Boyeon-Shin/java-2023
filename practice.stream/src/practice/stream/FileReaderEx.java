package practice.stream;

import java.io.FileNotFoundException;
import java.io.*;

public class FileReaderEx {
	public static void main(String[] args) {
		FileReader fin = null ;
		try {
			fin = new FileReader("C:/Users/신보연/java-2023/practice.stream/test.txt");

			int c;

			while ((c = fin.read()) != -1) {
				System.out.print((char)c);
			}
			fin.close();

		} catch (FileNotFoundException e) {
			System.out.println("파일을 열 수 없음 ");
		} catch (IOException e) {
			System.out.println("입출력 오류");

		}
	}
}
