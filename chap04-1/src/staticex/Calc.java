package staticex;

public class Calc {
	static boolean enable;
	static int value;
	int other;
	
	
	public static int max (int a, int b){
		return (a >b) ? a: b;
		
	}
	public static int min (int a, int b) {
		return(a  > b) ? b : a;
	}
	
	public void print() {
		System.out.println(enable); 
		System.out.println(value);  
		System.out.println(this.other);  // 객체가 있어야 this 사용 가능 
	}
	public static void printStatic() {
		System.out.println(enable);
		System.out.println(value);    
//		System.out.println(other);   // static 메소드 static 멤버만 사용 가능
	}
}
