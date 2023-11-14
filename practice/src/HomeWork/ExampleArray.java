package HomeWork;
import java.util.Scanner;

public class ExampleArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력할 개수를 정하세요");
		
		int s = scanner.nextInt();
		int[] array = new int[s];
	
		
		
		System.out.println("숫자들을 입력하세요");
		for (int number = 0;  number <array.length; number++) {
			array[number] = scanner.nextInt();
		}
		int min = array[0];
			
		for ( int num : array ) {
			if ( num  < min) {
				min = num;
			}
		}
		
		
		System.out.println("min: "+ min);

	}
}
