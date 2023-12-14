package animal;

public class Cat extends Animal{
//	String type;
	
//	public Cat(final String name, final String type) {
//		super(name);
//		this.type = type;
	
//	}
	
	public Cat(final String name) {
		super(name);
	
	}
	
	@Override // 재정의 
	public void sound() {
		System.out.println(this.getName() + "가 야옹합니다");
	}
}
