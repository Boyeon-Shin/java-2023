package Athelete;

public class BaseballPlayer extends Athelete {
	private double  score;
	
	public BaseballPlayer(final String name, final double height, final double weight, final double score) {
		super(name, height, weight );
		this.score = score;
	}
	

	public void print() {
		super.print();
		System.out.println("점수: " + score);
	}


	@Override
	public String toString() {
		return "BaseballPlayer [score=" + score + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
}
