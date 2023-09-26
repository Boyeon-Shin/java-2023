import java.util.Scanner;

public class NumberO {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자를 입력하시오: ");

		int number = scanner.nextInt();
		if (number > 0)
			System.out.println("양수 입니다.");
		else if (number < 0)
			System.out.println("음수 입니다.");
		else
			System.out.println("0입니다.");

		scanner.close();
	}

}
