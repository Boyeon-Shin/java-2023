import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		int subjectNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
	 
		while (true) {
			System.out.println("---------------------------------------------");
			System.out.println("1.과목수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택: ");
			int selectNum = scanner.nextInt();
		if(selectNum == 1) {
			System.out.println("과목수를 입력하세요.");
			subjectNum = scanner.nextInt();
			scores = new int[subjectNum];
			
		}

	}

}
}
