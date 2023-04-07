package chapter13;

import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		Board2Dao dao = new Board2Dao();
		List<Board2> list = dao.getBoardList();
		for (Board2 board2 : list) {
			System.out.println(board2.getTitle() + "-" + board2.getContent());
		}
	}
}
