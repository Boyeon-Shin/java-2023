package practice06;

import java.util.*;

//abstract class Shape {
//	abstract void draw();
//}

class Editor extends Shape {
	static int i = 0;
	private String shape[] = new String[10];
	Scanner scanner = new Scanner(System.in);

	public void insert() {
		System.out.print("도형 종류 Line(1), Rect(2), Circle(3)>> ");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			shape[i++] = "Line";
			break;
		case 2:
			shape[i++] = "Rect";
			break;
		case 3:
			shape[i++] = "Circle";
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}

	}

	public void remove() {
		System.out.print("삭제할 도형 위치>>");
		int idx = scanner.nextInt();
		if (idx  <= i) {
			int index = idx - 1 ;
			shape[index--] = null;
		}

		else {
			System.out.println("삭제할 수 없습니다.");
		}
	}

	public void draw() {
		for (int k = 0; k < i; k++) {
			System.out.println(shape[k]);
		}
	}
	}

	public class Shape2 {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Editor editor = new Editor();

			while (true) {

				System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					editor.insert();
					break;
				case 2:
					editor.remove();
					break;
				case 3:
					editor.draw();
					break;
				case 4:
					System.out.print("프로그램을 종료합니다...");
					System.exit(0);
				default:
					System.out.print("잘못된 입력입니다.");
				}
			
		}
	}
}
