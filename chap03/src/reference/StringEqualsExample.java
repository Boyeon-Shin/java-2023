package reference;

public class StringEqualsExample {

	public static void main(String[] args) {
		// 문자열 라터럴이 동일하다면 String 객체 공유 = 번지수가 같음 
		String strVar1 = "홍길동"; 
		String strVar2 = "홍길동";
		
		boolean diff = strVar1 == strVar2 ; // 값이 같은가? 합의 내용리 아니라 번지수 동일한지 보는 것 
		System.out.println(diff);
		
		boolean diffContent =strVar1.equals(strVar2); // equals안에 있는 내용 참조값을 따라가 실제 문자열 비교 
		System.out.println(diffContent);
		
		
		// 따로 만들기 각각 참조 변수 다름 번지수 주소(ex) 200, 300)가 다름)
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		boolean diff2 = strVar3 == strVar4 ;
		System.out.println(diff2);
		
		boolean diffContent2 =strVar3.equals(strVar4);
		System.out.println(diffContent2);
		
		if (strVar3.equals(strVar4)) {
			System.out.println("[1] strVar3 와 StrVar4 는 문자열이 같음(같은 내용임)");
		}
		if (strVar3 == strVar4){
			System.out.println("[2] strVar3 와 StrVar4 는 문자열이 같음(같은 내용임)");
		}
		
	}

}
