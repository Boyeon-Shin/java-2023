package ch04;

public class Circle {
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		return 3.15 * radius * radius;

	}
	

	public static void main(String[] args) {
		Circle[] Area;
		Area = new Circle[5];

		for (int i = 0; i < Area.length; i++) {
			Area[i] = new Circle(i);

		}
		for (int i = 0; i < Area.length; i++) {
			System.out.println((int) (Area[i].getArea()) + " ");
		}

	}
}