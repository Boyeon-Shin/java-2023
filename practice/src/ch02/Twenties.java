package ch02;
import java.util.Scanner;

public class Twenties {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("나이를 입력해주세요."); 
		int age = scanner.nextInt();
	
		if((age >=  20) && (age < 30) ) {
			System.out.println("내 나이는 " + age +"살 \n 아직 20대");
		}
		else {
			System.out.println("내 나이는 "+ age + "살  \n 20대 아님 ㅠㅠ");
		}
		scanner.close();
	}
}
