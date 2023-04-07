package chapter20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

// DAO(Data Access Object): DBMS에 직접 접근해서 CRUD를 하는 클래스
public class MemoDAO {
    // 전체 Select, 한개 Select, Insert, Update, Delete
	
	public List<MemoVO> getMomos(){ // 또는 getMomoList() , ArrayList 사용
		return null;
	}
	
	public MemoVO getMemo(int searchId) {
		// select * from memo where id = ?
		return null;
	}
	
	// insert into memo (title, content) values (?, ?)
	public int insertMemo(MemoVO vo) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pc11", "java");
		String sql = "INSERT INTO memo (id, title, content) VALUES (memo_seq.nextval, ?, ?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, vo.getTitle());
		statement.setString(2, vo.getContent());
		
		return 0;
	}
	
	// update memo set title = ?, content = ?, modify_date = sysDate where id = ?
	public int updateMemo(MemoVO vo) {
		return 0;
	}
	
	// delete from memo where id = ?
	public int deleteMemo(int deleteId) {
		return 0;
	}
}
