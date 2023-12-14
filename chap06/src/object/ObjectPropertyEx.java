package object;

public class ObjectPropertyEx {

	public static void main(String[] args) {
		
		Point point = new Point(2, 3);
		System.out.println(point.getClass().getName());
		System.out.println(point.hashCode());
		System.out.println(point.toString());
		// toString 생략 가능 
		System.out.println(point);  
	}

}
