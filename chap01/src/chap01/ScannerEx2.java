package chap01;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("Number = ");
//		int number = scanner.nextInt();
//		System.out.println(number);
//		
//		System.out.println("Id = ");
//		String id = scanner.next();
//		System.out.println(id);
//		scanner.nextLine(); //nextLine 주의해서 쓰기
//		
//		System.out.println("Full name = ");
//		String fullName = scanner.nextLine();
//		System.out.println(fullName);
//		
		String name = scanner.next();
		System.out.println("이름 : " + name);
		String city = scanner.next();
		System.out.println("도시 : " + city);
		int age = scanner.nextInt();
		double score =scanner.nextDouble();
		System.out.println("나이 : " + age);
		System.out.println("성적 : " + score);
		
		boolean aaa = scanner.nextBoolean();
		System.out.println("aaa : "+ aaa);
		
		scanner.close();
		
	  }

}
