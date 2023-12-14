package threadInterface;

public class Main {
	// main thread 
	public static void main(String[] args) {
		// thread 생성 새로운 흐름 생성 
		Thread thread = new TimerThread();
		thread.start();
		
		Runnable beepTask = new BeepTask();
		Thread  beepTread = new Thread(beepTask);
		beepTread.start();
		
		Thread beepTread2 = new Thread(new BeepTask() );
		beepTread2.start();
		
		System.out.println("메인 스레드");
		
		thread.interrupt();
	
	}
}
