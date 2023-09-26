package array;

import java.util.Scanner;

public class StringExercise {
	
	// 문자열을 읽어 원하는 문자열이 나타난 횟수 출력 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	// 10 개의 문자열을 저징힐 수 있는 문자배열 inputs를 선언 /생성 하시오
		String inputs[] = new String[10];

		for(int i =0; i< inputs.length; i++) {
			inputs[i] = scanner.nextLine();
				
			}
		for (String input: inputs) {
			System.out.println(input);
		}
		//원하는 문자열의 횟수를 셉니다
		int count = 0;
		for (String input: inputs) {
			if(input.equals("d")) {
//			if (input == "d") {
//				count ++;
			};
		}
		
		System.out.println("count= " + count);
		}
}
		


