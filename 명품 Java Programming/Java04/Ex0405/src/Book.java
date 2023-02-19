
public class Book {
	String title;
	String author;
	
	void show() { System.out.println(title + " " + author); }
	
	public Book() {	// 1
		this("", "");
		System.out.println("생성자 호출됨")	;
	}
	
	public Book(String title) {	// 2
		this(title, "작자미상");	// this를 통해 (title, "작자미상")을 매개변수로 가진 생성자(3)을 호출
	}
	
	public Book(String title, String author) {	// 3
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전");	// 2번 생성자 호출
		Book emptyBook = new Book();
		loveStory.show();
	}
}
