package loop;

public class Gugudan {

	public static void main(String[] args) {
		//9단을 출력하는 프로그램 
	
		for (int dan = 2; dan <= 9; dan++) {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d =%2d     " , dan, i, dan*i );
			}
		 System.out.println();
	   }
	}
}
