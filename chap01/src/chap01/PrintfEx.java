package chap01;

public class PrintfEx {

	public static void main(String[] args) {
		int a =3, b = 3;
		
		System.out.println("a= " + a + ", b "+ b);
		System.out.printf("a = %d, b = %d\n", a, b); //\n 줄바꿈 
		System.out.println(); // 줄바꿈 
		System.out.printf("a = %d, b = %d", a, b);
			
		double c = 0.5;
		System.out.printf("a = %d, b = %d, c= %f\n", a, b, c);
		// System.out.printf("a = %d, b = %d, c= %d\n", a, b, c);
		
		System.out.printf("%d\n", 123);
		System.out.printf("%5d\n", 123);
		System.out.printf("%05d\n", 123);
		
		System.out.printf("%f\n", 0.5);
		System.out.printf("%.2f\n", 0.5);
		System.out.printf("%10.2\n", 0.5);
		System.out.println("01234567890");
		
	}

}
