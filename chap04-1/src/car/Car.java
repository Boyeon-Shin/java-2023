package car;

public class Car {
	// 멤버 변수 private를 사용하는 것이 원칙
	private int speed;
	private boolean stop;

	public int getSpeed() { // getter
		return speed;
	}

	public void setSpeed(int speed) { // setter
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}

	public boolean isStop() {
		return stop;

	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}
}
