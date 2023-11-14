package car;

public class Main {
	public static void main(String[] args) {
		Car car = new Car();
		car.setSpeed(100);
		car.setStop(false);
		
	
		if (car.isStop()) {

			System.out.println("멈춰있어요!!");
		} else {
			System.out.println(car.getSpeed());
		}
	}
}
