package practice.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderEx  {
	try {
	FileReader fin = new FileReader("C:/Users신보연/java-2023/practice.stream");
	
	int c;
	
	while((c = fin.read()) != -1) {
		System.out.println((char)c);
	}
	fin.close();
	}
	catch(FileNotFoundException e ) {
		System.out.println("파일을 열 수 없음 ");
}	catch(IOException e) {
		System.out.println("입출력 오류");
}
