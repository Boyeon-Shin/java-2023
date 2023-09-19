package loop;

public class OuterBreakSample {

	public static void main(String[] args) {
		
		//  all: 가능하면 절대 사용하지 않기(꼭 팔요할 때 주의해서 사용!!!) 
		all: for (int i =0; i < 5; i++) {
			for( int j =0; j <5; j++) {
				if( j >= 2) {
					break all; // 반복문 종료 
				}
				System.out.println(i + " " + j);
			}
			System.out.println("for(j) end");
		}

	}

}
