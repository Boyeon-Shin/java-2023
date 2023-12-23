package threadex;

import java.awt.Toolkit;

public class BeepThreadex extends Thread {
	@Override 
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i< 5; i++ ) {
			toolkit.beep();
			try {
			sleep(500);
			}catch (Exception e)  {
				
			}
		}
	}
}
