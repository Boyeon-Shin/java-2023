package practice04;

import java.util.Scanner;

public class Main  {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점 (x, y) 와 color을 입력해주세요.");
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		String color = scanner.next();
		
		ColorPoint cp = new ColorPoint(x, y, color);
		
		cp.setPoint(x, y);
		cp.show();
		
		System.out.println("-------------------------------------");
		
		System.out.println("한 번 더 점 (x, y) 와 color을 입력해주세요. ");
		
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		cp.setPoint(x2, y2);
		
		cp.show();
		
		scanner.close();
		
		}
		


}
