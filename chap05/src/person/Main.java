package person;

public class Main {
	public static void main(String[] args) {
		Student student = new Student("홍길동", "1020", "모바일융합공학과", 4.4);
//		student.print2();

		StudentWorker studentWorker = new StudentWorker("신보연 ", "id dd", "모바일융합공학과", 4.4, "CTO");
//		studentWorker.print3();

		Person person2 = new Person("djdj", "dkdk");

		Person person; // 참조변수(레퍼런스)

		person = person2;
		person = student; // 서브 클래스의 레퍼런스를 수퍼 틀래스 레퍼런스에 대입 함 (upcasting)

//		person.print() ;   

		person = studentWorker;
//		person.print();

		Person person3 = new Student("홍길동", "1020", "모바일융합공학과", 4.4);

		// 다운캐스팅
//		((Student)person3).print2();
//		
		// ((Student)person2).print2(); // 불가능

		boolean r1 = person2 instanceof Person;
		boolean r2 = person2 instanceof Person;

//		System.out.println(r1);
//		System.out.println(r2);

		// 메소도 오버라이딩
		person = person2; // person2 -> Person 객체
//		person.print();
		System.out.println(person.toString());

		System.out.println("-----------------------------");
		person = student; // student -> Student 객체
//		person.print();
		System.out.println(person);
		
		System.out.println("-----------------------------");
		person = studentWorker;
//		person.print();
		System.out.println(person);

		System.out.println(person);
		System.out.println(person.toString());
	}
}
