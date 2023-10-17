package Array;

public class ReturnArray {
	static int[] makeArray() {  // 일차원 정수 배열 리턴 
		int temp[] = new int [4]; //배열 생성 
		for(int i =0; i<temp.length; i++)
			temp[i] = i;  //배열 초기화 0, 1, 2, 3 
			return temp;  //배열 리턴 
	}
	public static void main(String[] args) {
		
		int intArray[]; 
		intArray = makeArray(); 
		for( int i =0; i<intArray.length; i++) {
			System.out.println(intArray[i] + "");
		}
		}

	
}
