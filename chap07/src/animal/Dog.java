package animal;

public class Dog extends Animal{
	
	public Dog(final String name) {
		super(name);

	}

	@Override // 재정의
	public void sound() {
		System.out.println(this.getName() + "가 멍멍합니다.");

	}
}