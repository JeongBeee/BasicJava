package chapter13;

import java.util.ArrayList;
import java.util.List;

// Data Access Object : DAO라고 줄여서 사용
// 데이터베이스에 접속해서 데이터를 select, insert, update, delete 할때 사용하는 메소드
public class Board2Dao {
	// 조회를 하는 메소드를 만들어야 함
	public List<Board2> getBoardList() {
		List<Board2> list = new ArrayList<>();
		list.add(new Board2("제목1","내용1"));
		list.add(new Board2("제목2","내용2"));
		list.add(new Board2("제목3","내용3"));
		return list;
	}
	
	//System.out.println("갯수: " + list.size());
	//System.out.println("2번째 과목: " + list.get(2));
}

//제목1-내용1
//제목2-내용2
//제목3-내용3