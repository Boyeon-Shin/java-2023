package rectangle;

public class Ractangle {
	int width;
	int height; 
	
	double getArea() {
		return width * height; 
	}
	public static void  main(String[] args) {
		Ractangle rectangle = new Ractangle();
		rectangle.width = 4;    
		rectangle.height = 5;
		
		System.out.println( "사각형의 면적은 "+ rectangle.getArea());
		
	}
	

}
