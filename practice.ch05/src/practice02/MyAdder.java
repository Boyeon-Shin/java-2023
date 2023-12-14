package practice02;

public class MyAdder implements AdderInterface {
	public int add(int x, int y) {
		return x+ y;
	}
	
	public int add(int n) {
		int add = 0;
		for(int a = 0; a <= n; a++) {
			add += a;
		}
		return add;
	}
}
