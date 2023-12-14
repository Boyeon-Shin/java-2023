package ch0502;

public class Point {
	private int x;
	private int y;
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.println("(" + x +" ," + y +")");
	}
	public class ColorPoint extends Point {
	}
}
