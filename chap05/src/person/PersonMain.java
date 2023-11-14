package person;

public class PersonMain {

	public static void main(String[] args) {
		
		Person [] persons = new Person[4];
		
		persons[0] = new Person("김남규", "20221007");
		persons[1]=  new Student("안운성", "20221026" , "모바일융합공학과" , 4.4);
		persons[2] = new StudentWorker("함주원", "20221041", "모바일융합공학과", 4.4, "dkd");
		persons[3] = new Student("임예은", "20221038" , "모바일융합공학과" , 4.4);
				
		for(Person person : persons) {
			person.print();
			System.out.println("-----------------------");
		}
	}

}
