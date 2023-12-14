
public class ArrayIndexExceptionEx {

	public static void main(String[] args) {
		int [] intArray = new int [5];
		
		try {
		intArray[0] = 3;
		intArray[1]	= 4;
		intArray[5] = 5;

	} catch (ArrayIndexOutOfBoundsException e){
		System.out.println("배열 범위가 잘못됐어요!");
	}catch(Exception e) {
		System.out.println("뭔가 잘못됐어요" + e.getMessage());
	}
		
	for(int i= 0; i< intArray.length; i++) {
			System.out.println(intArray[i]);
	}
}
}
