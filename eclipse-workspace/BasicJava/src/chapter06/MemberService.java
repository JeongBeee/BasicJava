package chapter06;

//확인문제 6-4 3번

public class MemberService {
	boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) { // id가 hong, password가 12345 일때만 true
			return true;
		} else {
			return false; //boolean의 기본값
		}
	}
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
