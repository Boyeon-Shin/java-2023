package ch04;

import java.util.Scanner;

public class Clac {
	static int abs(int a) {
		return a > 0 ? a : -a;
	}

	static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	static int min(int a, int b) {
		return (a > b) ? b : a;
	}

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			System.out.println("type을 선택해 주세요 (절대 값 구하기 , 최대 값 구하기 , 최소 값 구하기 )");

			String type = scanner.next();

			switch (type) {
			case "절대 값 구하기":
				System.out.println("하나의 값을 입력해주세요");
				int a = scanner.nextInt();
				System.out.println(Clac.abs(a));
				break;

			case "최대 값 구하기": case "최대": case "최대값구하기": case "최대 값 구하기 ":
				System.out.println(" 두개의 값을 입력하세요");

				int a1 = scanner.nextInt();
				int b = scanner.nextInt();
				System.out.println(Clac.max(a1, b));
				break;
			case "최소 값 구하기":
				System.out.println("두개의 값을 입력하세요");
				int a3 = scanner.nextInt();
				int b1 = scanner.nextInt();
				System.out.println(Clac.min(a3, b1));
				break;

			default:
				System.out.println("형식릏 잘지켜주세요");
			}
			scanner.close();
		}
	}
