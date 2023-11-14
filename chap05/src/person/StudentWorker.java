package person;

public class StudentWorker extends Student {
	private String jobtitle;

	public StudentWorker(final String name, final String id, final String department, final double grade,
			final String jobtitle) {
		super(name, id, department, grade);
		this.jobtitle = jobtitle;

	}

	@Override
	public void print() {
		super.print();
		System.out.println(jobtitle);
	}

	public void print3() {
		print2();
		System.out.println(jobtitle);
	}
	@Override
	public String toString() {
		return "StudentWorker [jobtitle=" + jobtitle + " ," + super.toString() + "]";
	}
}
