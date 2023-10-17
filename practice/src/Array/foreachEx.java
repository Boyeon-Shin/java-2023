package Array;

public class foreachEx {

	public static void main(String[] args) {
		int intArray[] = {1,2,3,4,5};
		String string[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
		
		int sum = 0; 
		for(int k : intArray) {
			System.out.print(k +" ");  // 반복되는 k 값 출력 
			sum += k; 
		}
		System.out.println("합은 " + sum);
		
		for (String h : string) {
			System.out.print(h + " ");
		}

	}

}
