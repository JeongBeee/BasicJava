package homework8_3;

public abstract class Book {

	// 필드
	private int number;
	private String title;
	private String author;
	private static int countOfBooks = 0;

	// 생성자
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		number = ++countOfBooks;
	}

	// 메소드
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean equals(Object x) {
		// 주소가 같은지 판단
	if (this.title.equals(((Book) x).title) && this.author.equals(((Book) x).author)) {
			return true;
		}
		// instanceof를 이용해서 변환 가능한지 판단
		//if (x instanceof Book){
		//Book book = (Book) x;
		//return this.title.equals(book.title) && author.equals(book.author);
		return false;
	}

	public int hashCode() {
		return 0;
	}

	// 연체료를 계산하는 추상메소드
	public abstract int getLateFee(int lateDays);

	public String toString() {
		return String.format("관리번호: %d번, 제목: %s, 작가: %s(일주일 연체료: %,d원) ", number, title, author, getLateFee(7));
	}
}
