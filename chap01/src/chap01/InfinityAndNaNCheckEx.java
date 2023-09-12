package chap01;

public class InfinityAndNaNCheckEx {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
		System.out.println(z);
		
		//잘못된 코드
		double z2 = z + 2;
		System.out.println(z2);
		
		System.out.println(Double.isFinite(z));
		System.out.println(Double.isNaN(z));
		
		double z3 = y /y;
		System.out.println(Double.isNaN(z3));
		
		if(Double.isFinite(z2) || Double.isNaN(z))  {
			System.err.println("값을 산출 할 수 없습니다.");
		}
		else {
			System.out.println(z + 2);
					
		}
	}

}
