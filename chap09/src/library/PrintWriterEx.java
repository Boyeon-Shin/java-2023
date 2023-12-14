package library;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx {

	public static void main(String[] args) {
		try (PrintWriter print = new PrintWriter(new FileWriter("book2.txt"))){   //try with resources
			
//			FileWriter writer = new FileWriter("book2.txt");
			
//			PrintWriter print = new PrintWriter(new FileWriter("book2.txt"));
			print.println("Java Programming , 보연 , 2023 , 10000, true");
			print.close();
			String title = "Java Programming";
			String author = "보연 ";
			int year = 2023;
			int price = 10000;
			boolean renting = false;
			
			print.println(title+ " , " +author + "," + year + "," + price + "," + renting );
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
