package person;

public class Student extends Person {
	private String department;
	private double grade;

	public Student(final String name, final String id, final String department, final double grade) {
		super(name, id);
		this.department = department;
		this.grade = grade;

	}

	// 애노테이션
	@Override
	public void print() {
		super.print();
		System.out.println(department);
		System.out.println(grade);
	}

	public void print2() {
		print();
		System.out.println(department);
		System.out.println(grade);
	}
	@Override
	public String toString() {
		return "Student [department=" + department + ", grade=" + grade + ", " + super.toString() + "]";
	}
}
