package ch04;
import java.util.Scanner;


public class ForeachEx {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("5개의 정수를 입력하시오");

		int [] n = new int[5];
		double sum = 0;
		int m =0;

		for(int i : n) {
			n [i]  = scanner.nextInt();
			
		    sum += n[i];
		    m = n[i];
		    System.out.print(m + "");
		}
		 System.out.print(m + "");
		System.out.print( "의" + " 평균은 =" + sum/n.length);
		scanner.close();
}
}


	
