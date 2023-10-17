package book;

public class Book {
	String title;
	String author;

	void setMember(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public Book(String title) { // 생성자
//	     this(t, "작자미상");  // 반드시 생성자의 첫번째 문장, 하지만 안쓰는게 좋음
		setMember(title, "작자미상");
		System.out.println("Book1 생성자 호출");

//		title = t;
//		author = "작자미상";

	}

	// 아래 생성자가 하는 일이 많음
	public Book(String t, String a) { // 생성자
		title = t;
		author = a;
		// ..
		System.out.println("Book2 생성자 호출 ");

	}

	public static void main(String[] args) {
		// Book javaBook = new Book("Java", "황기태");
		// 생성자 Book(String t, String a) 호출
		Book bible = new Book("Bible");
//	  // 생성자 Book(String t) 호출
	}
}
