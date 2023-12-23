package practice04;

public class ColorPoint extends Point{
	private String color;
	
	public ColorPoint( int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	void setPoint(int x, int y) {
		move(x, y);// getX 값을 변경을 위해
	    System.out.println("(" + x + "," + y + ")");
	}
	
	void setColor(String color) {
		this.color = color;
	
	}
	
	void show() {
		System.out.println(color + "색으로" + "(" + getX() + "," + getY() + ")" );
			
	}
	
}
