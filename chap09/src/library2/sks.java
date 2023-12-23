package library2;

import java.io.IOException;
import java.io.InputStreamReader;

public class sks {
public static void main(String[] args) {
	InputStreamReader rd = new InputStreamReader(System.in);
	int c;
	
	try {
		while((c= rd.read()) != -1 ) {
			System.out.print((char)c);
			}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
