package shopping;

public class Customer {
	// 멤버는 프라이빗 
	private String id;
	private String name;
	private String email;
	private String adress;
	private int mileage;

	public Customer() {

	}

	public Customer(String id, String name, String email, String adress, int mileage) {

		this.id = id;
		this.name = name;
		this.email = email;
		this.adress = adress;
		this.mileage = mileage;

	}
	public void setMileage(int mlieage) {
		this.mileage = mileage;
	}
	

	void print() {
		System.out.println("아이디는 " + this.id);
		System.out.println("이름은 " + this.name);
		System.out.println("이메일은 " + this.email);
		System.out.println("주소는 " + this.adress);
		System.out.println("마일리지는 " + this.mileage);

	}

	public static void main(String[] args) {
		Customer friend = new Customer("glidong", "홍길동", "glidong@hanbay.ac.kr", "대전시 유성구 덕명동", 0);
		friend.print();

		Customer me = new Customer("fodk", "신보연", "djfhdj@edu.hanbat.ac.kr", "대전시 유성구 덕명동", 0);
		me.print();

	}
}
