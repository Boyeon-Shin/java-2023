package circle;

public class CircleArray {
	
	public static void main(String[] args) {
		// 1.배열 래퍼런스 변수 선언
		Circle[] circles;
		
		// 2. 배열 생성 
		circles = new Circle[5];
		
		//1.2.
		Circle[] circle2 = new Circle[10];
		
		// 3. 배열의 각 원소 객체 생성  
		for(int i=0; i < circles.length; i++) {
			circles[i] = new Circle(i + 2, "circle"); 
		}
		
		//4. 객체 배열 출력하기
		for (Circle circle: circles) {
			System.out.println("radius= " + circle.radius + 
						", name = " + circle.name  +", area = " + circle.getArea());
						
		}
		for(int i = 0; i < circle2.length; i++) {
			System.out.println(circles[2].name);
		}
	}

}
