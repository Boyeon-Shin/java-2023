package threadex;

public class BeepPrintEx extends Thread {
	 @Override 
	 public void run () {
		 for(int i = 0; i < 10; i++ ) {
			 System.out.println("띵");
			 try {
				 Thread.sleep(500);
			 }catch (InterruptedException e) {
				 e.printStackTrace();
			 }
		 }
	 }
}
