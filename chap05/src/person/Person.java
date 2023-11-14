package person;

public class Person  {
	private String name;
	private String id;

	public Person(final String name, final String id) {
		this.name = name;
		this.id = id;
	}

	public void print() {
		System.out.println(name);
		System.out.println(id);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}

}
