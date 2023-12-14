package practice01;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		String b = scanner.next();
		
		NamedCircle w = new NamedCircle(a, b);
		
		w.show();
		
		scanner.close();
	}
}
