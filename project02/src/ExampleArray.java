
public class ExampleArray {

	public static void main(String[] args) {
		int[] array = { 1, 5, 100, 50, 60, 80 };
		int min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];

				// 두번쨰 방법 FOREACH
				for (int number : array) {
					if (number < min) {
						min = number;
					}
				}

				System.out.println("min: " + min);

			}

		}
	}
}
