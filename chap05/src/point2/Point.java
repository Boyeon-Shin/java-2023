package point2;

public class Point {
    protected int x;
	protected int y;
	
	public Point () {
		System.out.println("Point 생성자 호출");
	}
	
	public Point(final int x, final int y){
		this.x = x;
		this.y = y;
		System.out.println("point Full 생성자 호출");
		
	}
	
	public void set(final int x, final int y) {
		this.x = x;
		this.y = y;
	}
	

	public void showPoint() {
		System.out.println("(" + x  + ", " + y + ")");
	}
}
