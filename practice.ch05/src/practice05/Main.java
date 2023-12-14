package practice05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		StringStack stringstack = new StringStack();
		Scanner scanner=new Scanner(System.in);
		
		
		for(int i=0;i<10 ;i++) {
			stringstack.push(scanner.next());
		}
		for(int i=0;i<10 ;i++) {
			System.out.print(stringstack.pop()+" ");
		}
	}
}

