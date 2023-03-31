package chapter08;

public class MysqlDao implements DataAccessObeject {

	@Override
	public void select() {
		System.out.println("Mysql DB에 검색");
	}

	@Override
	public void insert() {
		System.out.println("Mysql DB에 삽입");
	}

	@Override
	public void update() {
		System.out.println("Mysql DB에 수정");
	}

	@Override
	public void delete() {
		System.out.println("Mysql DB에 삭제");
	}

}
