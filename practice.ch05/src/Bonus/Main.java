package Bonus;

public class Main {
	public static void main(String[] args) {
		Shape coin = new Circle(10);
		coin.redraw();
		System.out.print("코인의 면적은 " + coin.getArea());
	}
}
