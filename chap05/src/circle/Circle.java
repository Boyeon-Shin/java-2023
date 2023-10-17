package circle;

// public 접근 지정 
public class Circle { // 파스칼 케이스,pascal case
	// class 멤버 변수 , 속성
	int radius;
	String name;

	// 멤버 함수 , 메소드
	double getArea() {
		return 3.14 * this.radius * this.radius;
	}

 // 디폴트 생성자, default constructor (클래스 이름과 동일)
// 	public Circle() {
// 		
// 	}
	
	
	// 메소드 오버로딩 (이름이 같은 생성자 여러개)

//	public Circle() {
//		radius = 1;
//		name = "no name";
//
//	}

	public Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;
	}
	
	public Circle(int r) {
		this.radius = r;
		this.name = "no name"; 
	}


	// 직접 쳐볼줄 알아야함 , 자바는 class 안의 메인
	// public static void main(String[]args ) {

	// main 분리

}
