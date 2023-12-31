package loop;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("exit을 입력하면 종료합니다.");

		while (true) {
			System.out.print(">> "); // 무한 반복문 
			String text = scanner.nextLine();
			if (text.equals("exit")) // "exit"이 입력되면 반복 종료
				break; // while 문을 벗어남
			if (text.equals("continue"))
				continue;
			System.out.println(text);
		}

		System.out.println("종료합니다...");
		scanner.close();
	}
}
