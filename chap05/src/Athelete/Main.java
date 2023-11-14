package Athelete;

public class Main {

	public static void main(String[] args) {
		Athelete [] athelete = new Athelete[4];
		
		athelete[0] = new BaseballPlayer("신보연", 167, 52, 2);
		athelete[1] = new BasketballPlayer( "이혜현", 160, 87,  4);
		athelete[2] = new BaseballPlayer("김나연", 160, 98, 4);
		athelete[3] = new BasketballPlayer( "함주원", 170, 00, 4);
		
		for(Athelete Athelete :athelete) {
			Athelete.print();
			System.out.println("---------------------------");
			
		}
	}
		

}
