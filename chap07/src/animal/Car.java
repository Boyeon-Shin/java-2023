package animal;

public class Car implements Moveable {
	private String type;
	private int years;
	
	public Car(String type, int years) {
		this.type = type;
		this.years = years;
	}
	@Override
	public void move() {
		System.out.println(years + "에 출시된 " + type + " 차량입니다");
	}
}
