import java.util.Scanner;

public class ExampleArray2 {

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

			if (selectNum == 1) {
				System.out.print("과목수: ");
				subjectNum = scanner.nextInt();
				if (subjectNum <= 0) {
					System.out.println("1 이상을 입력하세요.");
					continue;
				}

				scores = new int[subjectNum]; // 배열 생성 별도 필요

			} else if (selectNum == 2) {
				if (scores == null) {
					System.out.println("점수 배열이 생성되지 않았습니다.");
					continue;
				}
				for (int i = 0; i < scores.length; i++) {
					System.out.print("과목" + (i + 1) + "점수:");
					scores[i] = scanner.nextInt();
				}

			} else if (selectNum == 3) {
				if (scores == null) {
					System.out.println("점수 배열이 생성되지 않았습니다.");
					continue; 
				}
				
				for (int i = 0; i < subjectNum; i++) {
					System.out.println("과목" + (i + 1) + "점수:" + scores[i]);
				}
				// 두 번쨰 방법
//				int j = 1;
//				for (int score : scores) {
//					System.out.println("과목" + (j + 1) + "점수" + score);
//				}

			} else if (selectNum == 4) {
				if (scores == null) {
					System.out.println("점수 배열이 생성되지 않았습니다.");
					continue; 
				}
				int max = scores[0];
				int sum = 0;
				for (int i = 0; i < scores.length; i++) {
					if (scores[i] > max) {
						max = scores[i];
					}
					sum += scores[i];
				}
				System.out.println("최고 점수:" + max);
				System.out.println("평균 점수:" + sum / scores.length);

			} else if (selectNum == 5) {
				System.out.print("프로그램 종료");
				break;

			}

		}
		scanner.close();
	}
}
