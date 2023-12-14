package ch05CT;

public class SuperObject {
	protected void paint() {
		draw();
	}
	public void draw() {
		draw();
		System.out.println("super");
	}
}
