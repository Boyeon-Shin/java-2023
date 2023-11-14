package ch04;

public class ArrayPassing {
	static void replaceSpace(char[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ' ') {
				a[i] = ',';
			}

		}
	}

	static void printCharArray(char a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.println( );
		}

	}

	public static void main(String args[]) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', '.' };
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);

	}
}
