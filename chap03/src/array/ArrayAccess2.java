package array;

import java.util.Scanner;

public class ArrayAccess2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int intArray[] = new int[5]; 

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();

		}
		for (int i = 0; i < intArray.length; i++) {
			System.out.printf("intArray[%d] =%d\n", i, intArray[i]);
		}

		double sum = 0.0;
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}

		System.out.printf("합은 %.0f, 평균은 %.0f입니다\n", sum, sum/intArray.length);
		
		scanner.close();
	}
	
}