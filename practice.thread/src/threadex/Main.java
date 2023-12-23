package threadex;

public class Main {
	public static void main(String[] args) {
	
		Thread thread = new BeepThreadex();
		
		Thread printthread = new BeepPrintEx();
		
		
		
		thread.start();
		
		printthread.start();
		
		System.out.println("메인 스레드");
	}
}
