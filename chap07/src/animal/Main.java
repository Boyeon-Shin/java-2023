package animal;

public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat("나비");
		Dog dog = new Dog("뽀삐");
		
		Person me = new Person("보연", 3);
		
		me.addCompanion(cat);
		me.addCompanion(dog);
	
		me.soundAll();
		
		
	}

}
