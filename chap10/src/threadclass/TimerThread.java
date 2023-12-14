package threadclass;

public class TimerThread extends Thread {
	public void run() {
	//	int i = 1;
		while (true) {
//			System.out.println(i);
			System.out.println("띵!");
//			i++;
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
