package shopping;

public class ShoppingMain {
	public static void main (String[] args) {
			Customer friend = new Customer("glidong", "홍길동", "glidong@hanbay.ac.kr", "대전시 유성구 덕명동", 0);
			friend.print();

			Customer me = new Customer("fodk", "신보연", "djfhdj@edu.hanbat.ac.kr", "대전시 유성구 덕명동", 0);
			me.print();
	}
}
