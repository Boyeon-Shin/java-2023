package ch02;

import java.util.Scanner;

public class Ch0203 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("x의 값을 입력해주세요");
		int x = scanner.nextInt();
		int y = 0;
	
		y = x*x - 3*x +7;
	
		
		System.out.println( "x=" + x + "  y=" + y);
		scanner.close();
	}
}
