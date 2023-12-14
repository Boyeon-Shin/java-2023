package animal;

public class Sheep extends Animal {

	public Sheep(final String name) {
		super(name);

	}

	@Override // 재정의
	public void sound() {
		System.out.println(this.getName() + "가 음메합니다.");

	}
}
