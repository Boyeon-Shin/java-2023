package basic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		try {
			FileReader input = new FileReader("c:/temp/test.txt");
			
			int c;
			while ((c = input.read())  != -1) {
				System.out.print((char)c);
			}
			input.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}

	}


