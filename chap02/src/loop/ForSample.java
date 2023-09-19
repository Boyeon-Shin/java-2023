package loop;

public class ForSample {

	public static void main(String[] args) {
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}// 변수는 for문 안에서만 사용{] 다음 for문에 다시 새로운 변수 선언 
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// 변수가 실행 안됨 
		// System.out.println(i);
		
		
		//i값을 반복문 밖에서 활용하고 싶다 ?
		int i; 
		for (i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		//반복문이 끝난 11 출력
		System.out.println(i);  

		for(;;) {
			
		}
		
		
	}

}
