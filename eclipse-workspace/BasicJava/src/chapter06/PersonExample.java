package chapter06;

public class PersonExample {
public static void main(String[] args) {
	Person person = new Person("1234", "홍길동");

//	person.nation = "US";
//	person.ssn = "1234";
	person.name = "홍삼원";  //final은 값을 바꿀 수 없고, 초기값 설정을 해줘야 한다.
	}
}
