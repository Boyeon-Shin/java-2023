import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int dividend;
		int divisor;

		try {
			dividend = scanner.nextInt();
			divisor = scanner.nextInt();

			System.out.println(dividend / divisor);

		} catch (ArithmeticException e) {
//			System.out.println("수식 오류 " + e.getMessage());
			e.printStackTrace();  // 예외 발생 이유 매우 자세히 알려줌 

		} catch (InputMismatchException e) {
			System.out.println("입력 오류 " + e.getMessage());

		} catch (Exception e) {
			System.out.println("기타등등 " + e.getMessage());
			
		} finally {
			System.out.println("수행 끝");
		}
		

//		System.out.println("예외처리됨");  // 예외처리안쓰면 실행 안됨 

		scanner.close();
//		
//		findClass();
//		
//		findClass2();
		
	}
	public static void findClass() throws ClassNotFoundException {
		Class<?> clazz = Class.forName("java.lang.String2");
		
	}	public static void findClass2() throws ClassNotFoundException{
		Class<?> clazz = Class.forName("java.lang.String2");
	}


}
