package ch02;

import java.util.Scanner;

public class Game369 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 ~99 사이의 정수를 입력해주세요.");

		int i = scanner.nextInt();
		int first = i / 10;
		int second = i % 10;

		if (i >= 10) {
			if (first % 3 == 0 && second % 3 == 0) {
				System.out.println("박수짝짝 ");

			} else if (first % 3 == 0 || second % 3 == 0) {
				System.out.println("박수짝 ");

			} else {
				System.out.println("박수 없음");
			}

		} else {
			if (second % 3 == 0) {
				System.out.println("박수짝 ");
			} else {
				System.out.println("박수 없음");

			}
		}

	}
}
//import java.util.Scanner;
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("1~99 사이의 정수를 입력하세요>>");
//
//		int num = sc.nextInt();
//		
//		int first = num/10;
//		int second = num%10;
//		int cnt = 0;
//		
//		if(first == 3 || first == 6 || first == 9) cnt++;
//		if(second == 3 || second == 6 || second == 9) cnt++;
//		
//		switch (cnt) {
//		case 0: System.out.println("박수없음"); break;
//		case 1: System.out.println("박수짝"); break;
//		case 2: System.out.println("박수짝짝"); break;
//		default:
//			break;
//		}
//	}
//}	