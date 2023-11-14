package point3;

import point2.Point;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint() {
		super();  // 컴파일러 알아서 넣어줌
		System.out.println("ColorPoint 생성자 호출 ");
	}
	public ColorPoint(final int x, final int y, final String color) {
		super(x, y);
		this.x = x;
		this.y = y;
		this.color = color;
		
		System.out.println("ColorPoint Full 생성자 호출");
	}
	
	void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
	
	public void setColor(final String color) {
		this.color = color;

	}
	public void set(final int x, final int  y, final String color) {
		this.x = x; 
		this.y = y;
		this.color = color;
	}
}

