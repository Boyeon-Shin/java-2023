
public class ch05 {
	int i;
	int j;

//	public ch05(int i , int j) {
//		this.i = i;
//		this.j = j;
//		
//	}
	public  int sum() {
		int sum;
		sum = i +j;
		
		return sum;
	}
	public static void main(String [] args) {
		ch05 s = new ch05();
		s.i = 3;
		s.j = 4;
		
		System.out.print(s.sum());
	}
}
