package circle;

public class Call {
	
	static void increase(int m) {
		m = m +1;
		System.out.println("m= " + m);
	}
	
	
	static void increaseCircle(Circle m) {
		m.radius++; 
		System.out.println();
		
	}
	
	static void increaseArray(int[] array) {
		for(int i =0; i <array.length; i ++) {
			array[i]++;
		}
	}
	

	static void increaseCircleArray(Circle[] circles) {
		for (int i = 0; i < circles.length; i ++) {
			circles[i].radius++;
		}
	}
		
	public static void main (String[] args) {
		Circle [] ca = new Circle[5];
		
		for( int i = 0; i < ca.length; i++ ) {
			ca[i] = new Circle(i+2);
			
	}
		increaseCircleArray(ca);
		
		for (int i = 0; i < ca.length; i++) {
			System.out.println(ca[i].radius);
	}
	
	
	
//	
//	public static void main (String[] args) {
//		int a [] = {1, 2, 3, 4, 5,};
//		
//		increaseArray(a);
//		for(int i = 0; i < a.length; i ++) {
//			System.out.println(a[i]);
//		}
//		
	
//	public static void main(String[] args) {
//		
//		int n = 10;
//		increase(n);
//		
//		System.out.println("n= " + n);
//		
//		Circle pizza = new Circle(10) ;
//		increaseCircle(pizza);
//		
//		System.out.println("pizza.radius = " + pizza.radius );
//		
//	

	

}
}
