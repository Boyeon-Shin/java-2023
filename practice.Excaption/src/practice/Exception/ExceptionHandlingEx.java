package practice.Exception;

public class ExceptionHandlingEx {
	public static void printLength(String data) {
		try {
		int result = data.length();
		System.out.println("문자수: " + result);
		
		}catch(NullPointerException e ) {
			System.out.println(e.getMessage()); //간단한 이유
			System.out.println(e.toString());  //예외 종류와 사유
			e.printStackTrace();     // 예외의 발생 경로를 추적 
			
		}finally {
			System.out.println("[마무리 실행]\n");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("[프로그램 시작]\n");
		printLength("Thedjdjf");
	
		printLength(null);

		
		System.out.println("[프로그램 종료]");
	}
}
