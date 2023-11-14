package circle;

public class MethodSample {
	
	
	//method overloading 
	int getSum(int i, int j ) {
		System.out.println("getSum int");
		return i + j;
	

	}
	int getSum(int i, int j, int k) {
		return i + j+ k; 
	}
	
	double getSum(double i, double j ) {
		return i + j;
	
	}
	
	// 오류 
//	double getSum(int i, int j ) {
//		return (double)i + (double)j;
//		
//	}
	
	

}

