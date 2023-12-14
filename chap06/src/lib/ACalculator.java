package lib;

public class ACalculator extends Calculator {

	@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public double average(int[] a) {
		double sum = 0;
		for(int i =0; i < a.length; i++) {
			sum += a[i];
		}
		return sum /a.length;
	}
	

}
