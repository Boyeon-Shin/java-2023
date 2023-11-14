package finalex;

public class FinalEx {
	int normal;
	final int finalValue ;
	final static int STATIC_FINAL_VALUE = 100;
	
	void f() {
		this.normal = 100;
		// this.finalValue = 20; // 변경 불가능
		
	}
	public FinalEx(final int normal, final int finalValue) {
		this.normal = normal;
		this.finalValue = finalValue;
	}
}
