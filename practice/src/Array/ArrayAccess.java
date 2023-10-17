package Array;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int intArray[] = new int[5];
//		
//		int intArray[]; // int [] intArray; 
//		intArray = new int[5];

		int max = intArray[0];
		System.out.println("양수 5개를 입력하시오.");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			if (intArray[i] > max) {
				max = intArray[i];
			}

		}
		System.out.println("가장 큰 수는 " + max + " 입니다.");

		scanner.close();
	}

}
