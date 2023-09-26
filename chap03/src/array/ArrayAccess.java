package array;

public class ArrayAccess {

	public static void main(String[] args) {
//		int intArray[]; // 참조값일 뿐 배열을 가리킬수있는 변수 값 
//		intArray = new int [5];
//		int intArray2[] = new int[5];
//		int[] intArray3 = new int[5];
		
//		int intArray4[] = {1, 2, 3, 4, 5};
		
		int intArray[] = {1, 2, 3, 4 ,5, 6, 7}; // new int[5];
//		
//		intArray[0] =1;
//		intArray[1] =2;
//		intArray[2] =3;
//		intArray[3] =4;
//		intArray[4] =5;
		
		
		
		for( int i= 0; i <intArray.length; i++) { //intArray 배열 크기 만큼 루프 반복 
			System.out.printf("intArray[%d] =%d\n" , i ,intArray[i]);
		}
		
		System.out.println("length = " + intArray.length); 
		
		
	}

}
