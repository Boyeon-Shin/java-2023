package ch02;

import java.util.Scanner;

public class CircleArea {
	final double PI = 3.141592;
	double radius;
	String name;
	
	public CircleArea(double radius) {
		this(radius, "이름 없음");
		
	}
	
	public CircleArea(double radius, String name) {
		this.radius = radius;
		this.name = name;
		System.out.printf("반지름: %f, 이름: %s\n", radius, name);
	}

	public double getArea() {
		return PI*radius*radius;
	}
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("반지름과 이름을 순서대로 입력하세요.");
		CircleArea circleArea = new CircleArea(scanner.nextDouble(), scanner.nextLine());
		System.out.println("원의 면적 = " + circleArea.getArea());
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("반지름을 입력하세요.");
		CircleArea circleArea2 = new CircleArea(scanner.nextDouble());
		System.out.println("원의 면적 = " + circleArea2.getArea());
		
	scanner.close();
	}
}
