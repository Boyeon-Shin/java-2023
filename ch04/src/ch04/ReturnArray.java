package ch04;

public class ReturnArray {
	static int[] makeArray() {
		int temp[] = new int[4];
		for (int i = 0; i <temp.length; i++) {
			temp[i] = i + 1;
		
		}
		
		return temp;
	}
	public static void main(String[] args) {
		int intArray[];
		
		intArray = makeArray(); // new int [..]
		for (int value : intArray) {
			System.out.println(value);
		}

	}

}
