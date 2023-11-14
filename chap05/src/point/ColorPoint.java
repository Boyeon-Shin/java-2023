package point;

public class ColorPoint extends Point {
	private String color;

	
	void setColor(final String color) {
		this.color = color;

	}
	void set(final int x, final int  y, final String color) {
		set(x, y);
		this.color = color;
	}
}

