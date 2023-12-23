package Bonus;

public class Circle implements Shape {
	private int radius; 
	
	public void draw() {
		System.out.print("반지름 " + radius + " ");
	}
	public double getArea() {
		return radius*radius*PI;
	}
	public Circle(int radius) {
		this.radius = radius;	}
}
