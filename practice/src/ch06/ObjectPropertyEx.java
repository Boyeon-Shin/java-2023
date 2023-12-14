package ch06;

class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	private String z;
	
	public Point(String z) {
		this.z =z;
	}
}

public class ObjectPropertyEx {
	public static void main(String [] args ) {
		Point p = new Point(1,3);
		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		
		
	}
}
