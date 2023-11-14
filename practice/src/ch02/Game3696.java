package ch02;

import java.util.Scanner;

public class Game3696 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력할 수의 개수를 적으시오");
		int s = scanner.nextInt();
		int number[] = new int[s];
		
		System.out.println("1 ~ 99까지의 수를 입력하세요.");
		
		for (int i = 0; i < number.length; i++) {
			int n = scanner.nextInt();

			int first = n / 10;
			int second = n % 10;
			int count = 0;
			if (n < 100) {
				if (first == 3 || first == 6 || first == 9) {
					count++;
				}
				if (second == 3 || second == 6 || second == 9) {
					count++;
				}
			} else {
				continue;
			}

			switch (count) {
			case 1:
				System.out.println("박수짝");
				break;
			case 2:
				System.out.println("박수짝짝");
				break;
			case 0:
				System.out.println("박수안침");
				break;
			}

		}

	}
}
