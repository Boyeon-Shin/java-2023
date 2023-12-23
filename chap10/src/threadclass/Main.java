package threadclass;

public class Main {
	// main thread 
	public static void main(String[] args) {
		// thread 생성 새로운 흐름 생성 
		Thread thread = new TimerThread();
		thread.start();
		
		Thread beepTread = new BeepThread();
		beepTread.start();
//		
//		Thread beepTread2 = new BeepThread();
//		beepTread2.start();
//		
		System.out.println("메인 스레드");
		
	
	}
}
