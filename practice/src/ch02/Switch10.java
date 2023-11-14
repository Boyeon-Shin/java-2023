package ch02;

import java.util.Scanner;

public class Switch10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫지를 입력하시오");
		
		int i = scanner.nextInt();
	
		switch(i) {
		case 1:
			System.out.println("!");
			break;
		case 2:
			System.out.println("@");
			break;
		case 4:
			System.out.println("#");
			break;
		default:
			System.out.println("*");
		}
		scanner.close();
		

	}

}
