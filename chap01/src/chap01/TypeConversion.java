package chap01;

public class TypeConversion {

	public static void main(String[] args) {
	
		byte b = 127;
		int i = 100;
		
		System.out.println(b + i);
		System.out.println(b + i);
		System.out.println((byte)(b + i)); // 강제 형변환, type casting 
											// 오버 플로우, overflow 
		System.out.println(b + (byte)1);
		
		b = (byte)i;
		System.out.println(b);
		
		int i2 = 200;
		b = (byte)i2;
		System.out.println(b);
		
		double d = 1.9;
		i = (int)d;
		System.out.println(i);
		}

}
