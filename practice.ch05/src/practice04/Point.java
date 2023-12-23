package practice04;

public class Point {
	private int x, y;
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
//	
//	public void setX(int x)  {
//		if(x <0 ) {
//			this.x = 0;
//			return;
//		}else {
//			this.x = x;
//		}
//	}
	
	protected void move(int x, int y) {
		this.x= x;
		this.y = y;
		
	}
}
