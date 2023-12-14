package practice.Exception;

public class ExceptionHandlingEx2 {
	public static void printLength(String data) throws ClassNotFoundException {
		try {
			// 일반예외
			Class.forName("java.lang.String"); // 정적 메소드 forName () 안 클래스 이름으로 된것이 있냐

		} catch (ClassNotFoundException e) {
			System.out.println("주어진 클래스가 있습니다");
			e.printStackTrace();
		} 
		
		System.out.println();
		
		
		Class.forName("java.lang.String2");
	
		}

	public static void main(String[] args) {

		System.out.println("[프로그램 시작]\n");
	

		System.out.println("[프로그램 종료]");
	}
}
