package ch04;
import java.util.Scanner;

public class Rect {
	int height;
	int weight;
	public Rect(int height, int weight) {
		this.weight = weight;
		this.height = height;
	}
	public int getArea() {
		return weight*height;
	}
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		Rect[] r = new Rect[4];
		for(int i =0; i < r.length; i++) {
			System.out.print( i+1 +"너비와 높이 >>");
		int width = scanner.nextInt(); 
		int height = scanner.nextInt();
	    r[i] = new Rect(width, height);
	   
		}
		System.out.println("저장하였습니다.");
		int sum =0; 
		for (int i=0; i < r.length; i++) {
			sum += r[i].getArea();
			System.out.println( sum);
		}
	}

}
