package animal;

public abstract class Animal {
	private String name;

	Animal(final String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public abstract void sound(); // 추상 메소드 - 중괄호 없음 함수 형태만 존재
}

//추상 메소드를 포함한다면 추상 클래스여야함 