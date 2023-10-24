package circle;

public class Overloading {

	public static void main(String[] args) {
		MethodSample ms = new MethodSample();
		
		System.out.println(ms.getSum(1, 2));

		System.out.println(ms.getSum(1, 2, 3));
		
		System.out.println(ms.getSum(1.0, 2.0));
	}

}
