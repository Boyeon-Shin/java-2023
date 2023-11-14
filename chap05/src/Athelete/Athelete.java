package Athelete;

public class Athelete {
	private String name;
	private double height;
	private double weight;
	
	public Athelete(final String name, final double height, final double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		
	}
	@Override
	public String toString() {
		return "Athelete [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	
	public void print() {
		System.out.println("이름: " +name);
		System.out.println("키: " + height);
		System.out.println("몸무게: "+ weight);
	}
	
}
