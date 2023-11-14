package ch02;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");

		System.out.print("절수 >> ");
		String k = scanner.nextLine();

		System.out.print("영희 >> ");
		String y = scanner.nextLine();

		if ((k.equals("가위") && y.equals("보")) || (k.equals("바위") && y.equals("가위"))
				|| (k.equals("보") && y.equals("바위"))) {
			System.out.println("철수가 이겼다");
		}

		else if (k.equals("가위") && y.equals("바위")) {
			System.out.println("영희가 이겼다");
		} else if (k.equals("바위") && y.equals("보")) {
			System.out.println("영희가 이겼다");

		} else if (k.equals("보") && y.equals("가위")) {
			System.out.println("영희가 이겼다");
		} else
			System.out.println("비겼다.");

	}
}
