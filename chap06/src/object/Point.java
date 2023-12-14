package object;

public class Point {
	private int x;
	private int y;
	
	public Point(final int x ,final int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override  // 쓰는것이 에러 방지에 좋음 (재정의)
	public String toString() {
		return "Point(" + x  + "," + y + ")";
		
	}
//	@Override  
// 내용이 같다면 같다고 해줘~ 라는 메서드 재정의
	public boolean equals(Point point) {
		if(this.x == point.x && this.y == point.y) {
			return true;

		} else {
			return false;
		}
	}

}
