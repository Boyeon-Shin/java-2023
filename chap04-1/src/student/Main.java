package student;

public class Main {
	public static void main(String[] args) {
		Student friend = new Student();

		friend.department = "모바일융합공학과";
		friend.studentID = 20221023;
		friend.name = "이혜현";
		friend.phoneNumber = "01010";

		friend.print();

		Student me = new Student(20221023, "모바일융합공학과", "신보연", "010");
		me.print();

	}
}
