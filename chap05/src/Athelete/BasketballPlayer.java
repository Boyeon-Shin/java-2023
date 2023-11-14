package Athelete;

public class BasketballPlayer extends Athelete{
private double goal;


	public BasketballPlayer(final String name, final double height, final double weight, final double goal) {
		super(name, height, weight );
		this.goal = goal;
	}
	
	public void print() {
		super.print();
		System.out.println("골: "+ goal);
	}

@Override
public String toString() {
return "BasketballPlayer [goal=" + goal + ", toString()=" + super.toString() + ", getClass()=" + getClass()
		+ ", hashCode()=" + hashCode() + "]";
}

}