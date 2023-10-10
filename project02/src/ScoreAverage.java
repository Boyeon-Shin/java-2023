
public class ScoreAverage {
	public static void main(String[] args) {
		double score[][] = { { 3.5, 3.0, 4.5, 4.0, 3.5, 3.0 }, // 1학년 1학기 과목별 성적
				{ 3.5, 3.5, 2.5, 4.5, 4.0 }, // 1학년 2학기 과목별 성적
				{ 3.5, 4.0, 3.5, 3.0, 4.5, 4.0 }, // 2학년 1학기 과목별 성적
				{ 4.0, 4.0, 4.5, 4.5, 4.5 } }; // 2학년 2학기 과목별 희망 성적

		double sum = 0; // 전체 과목 성적 합계
		int count = 0; // 전체 과목 수

		for (int semester = 0; semester < score.length; semester++) { // 각 학기별로 반복
			
			double semesterSum = 0;
			count += score[semester].length;
			System.out.printf("%d학기\t성적: ", semester + 1);

			// 학기별 각 과목 성적과, 과목수, 학기 성적 평균을 출력하는 반복문을 완성
			for (int subject = 0; subject < score[semester].length; subject++) {

				semesterSum += score[semester][subject];
//				System.out.println(score[semester][subject]);
				System.out.print(score[semester][subject]);
				
				if (subject < score[semester].length -1) {
					System.out.print(", ");
				} else {
					System.out.println();
				}
				

			}
			sum += semesterSum;
			System.out.printf("\t과목수: %d, 평균 =%.2f\n\n ", 
				score[semester].length, semesterSum / score[semester].length);
		}
			System.out.printf("\n전체 %d개 과목을 수강했고 전체 평점은 %.2f입니다.", count, sum / count);

		}
	}

