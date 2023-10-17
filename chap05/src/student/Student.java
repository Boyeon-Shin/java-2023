package student;

public class Student {
	int studentID;
	String  department; 
	String name; 
	String phoneNumber;

	//디폴트 생성자 
	public Student() {
		
	}
	
	public Student(int studentID, String department, String name, String phoneNumber) {
		
		this.studentID = studentID;
		this.department = department; 
		this.name = name; 
		this.phoneNumber = phoneNumber;
		
	}
	
	
	void print() {
		//return 없는 변수 
		System.out.println("학번은 "+ this.studentID);
		System.out.println("학과는 "+ this.department);
		System.out.println("이름은 "+ this.name );
		System.out.println("연락처는 "+ this.phoneNumber);
	}
	 
 
}
	
	
	
