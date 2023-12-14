package lib;

public class Main {

	public static void main(String[] args) {
	
		Calculator calculator = new ACalculator();
		System.out.println(calculator.add(1, 2));
		System.out.println(calculator.substract(1, 2));

	}

}
