import java.util.Scanner;

public class NumberP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두 개의 숫자를 입력하시오: ");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if (a>b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
		scanner.close();
	}

}
