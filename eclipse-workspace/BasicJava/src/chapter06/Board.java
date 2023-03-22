package chapter06;

public class Board { // 필드 생성
	String title = "";
	String content = "";
	String writer;
	String date;
	int hitcount;

	// Board 생성자를 오버로딩
	Board(String title, String content) { // title, content 입력을 받는 생성자1
		this(title, content, "로그인한 회원아이디", "현재 컴퓨터 날짜", 0);
	}

	Board(String title, String content, String writer) { // title, content, writer 입력을 받는 생성자2
		this(title, content, writer, "현재 컴퓨터 날짜", 0);
	}

	Board(String title, String content, String writer, String date) { // title, content, writer, date 입력을 받는 생성자3
		this(title, content, writer, date, 0);
		
	}

	Board(String title, String content, String writer, String date, int hitcount) { 
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}
	
	Board board = new Board("제목", "내용"); // Board 객체 생성 방법1 = 생성자1 객체 
	//Board board2 = new Board("제목", "내용", "작가"); // Board 객체 생성 방법2 = 생성자2 객체 
	//Board board3 = new Board("제목", "내용", "작가", "날짜"); // Board 객체 생성 방법3 = 생성자3 객체 
	//Board board4 = new Board("제목", "내용", "작가", "날짜", 0); // Board 객체 생성 방법4 
	
}
