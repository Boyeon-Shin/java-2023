package Array;

public class ScoreAverage {

	public static void main(String[] args) {
		double score[][] = { { 2.3, 3.8 }, { 3.6, 3.8 }, { 3.9, 4.3 } };
		double sum = 0;
		
		for (int year = 0; year < score.length; year++) {
			for (int month = 0; month < score[year].length; month++) {
				sum += score[year][month];
			}
		}
				int n = score.length;
				int m = score[0].length;
			
				System.out.println("4년 전체 평점 평균은 " + (sum /(n* m)));
		
		}
		
	}

