import java.util.Scanner;

public class NumberJ {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("세 개의 정수를 입력하시오: ");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if ((a >= b && a <= c )|| ( a <= b && a >= c)) {
			System.out.println("중간값:" + a );
		}else if ((b >= c && b <= a)|| ( a <= b && b <= c)) {
			System.out.println("중간값:" + b );
		}else {
			System.out.println("중간값:" + c );	
		}
		scanner.close();
	}

}
