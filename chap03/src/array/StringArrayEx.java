package array;

public class StringArrayEx {

	public static void main(String[] args) {
		String [] strArray;
		strArray = new String[5];
		
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		strArray[3] ="Python";
		strArray[4] ="C";
		
		for (String s: strArray) {
			System.out.println(s);
		}
		
		
	}

}
