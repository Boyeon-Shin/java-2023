package ch05CT;

public class SubObject extends SuperObject{
	public void paint() {
		super.draw();
	}
	public void draw() {
		System.out.println("sub");
	}
}
