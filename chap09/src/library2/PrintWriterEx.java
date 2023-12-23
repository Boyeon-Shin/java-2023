package library2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx {
	public static void main(String[] args) {

		try (PrintWriter print  = new PrintWriter(new FileWriter("book2.txt"))) {
			print.println("djdjf , skdk, djdjd, skskk,");

			print.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
