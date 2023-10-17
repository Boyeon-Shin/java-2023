package circle;

public class CircleMain {

	public static void main(String[] args) {
		Circle circle;  // 객체 참조 변수 
		circle = new Circle(); // 객체 생성
	
		
		Circle pizza;
		pizza = new Circle(); 
//		System.out.println(pizza.name);
		
		pizza.name = "자바피자피자"; 
		pizza.radius = 10;
		
		double area = pizza.getArea();   //메소드 사용, 호출 
		
		System.out.println(area);
		
		
		Circle dount = new Circle();
		dount.radius = 3;
		dount.name = "자바도넛"; 
		System.out.println(dount.getArea());
		
		// 생성자 사용시 (더 편리)
		Circle egg = new Circle(2, "계란");   
		System.out.println(egg.getArea());
	}

}
