package condition;

import java.util.Scanner;

public class Season2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String season = scanner.next();

		System.out.println(season);

		switch (season) {
		case "봄": case "spring" ,"Spring":
			System.out.println("봄은 3월에서 5월입니다.");
			break;
		case "여름": case "summeer", "Summer":
			System.out.println("여름은 6월에서 8월입니다.");
			break;
		case "가을" , "autumn", "Autumn": 
			System.out.println("가을은 9월에서 11월입니다.");
			break;
		case "겨울" ,"winter", "Winter":
			System.out.println("겨울은 12월에서 1월입니다.");
			break;
		default:
			System.out.println("잘못된 입력입니다");
			break;

		}
		scanner.close();
	}

}
