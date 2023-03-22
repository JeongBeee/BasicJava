package chapter06;

public class Korean {
	String nation = "대한민국";
	String name;
	String ssn;

//객체가 생성될때 호출
	public Korean() {
		
	}
	public Korean(String name) {
		this.name = name;
	}
	/*
	 *  이름과 주민등록번호를 입력받아 객체 생성
	 *  @param n 이름을 저장
	 *  @param s 주민등록번호를 저장
	 *  */
	public Korean(String name, String ssn) { // name,ssn이 아닌 타입으로 구별함. string
		this.name = name;
		this.ssn = ssn;
	}
}
//객체 왜 만들어? 그 안에있는 필드와 메소드를 사용하기 위해서