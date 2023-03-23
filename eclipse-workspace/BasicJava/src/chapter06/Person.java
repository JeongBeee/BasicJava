package chapter06;

public class Person {
	final String nation = "Korean";
	final String ssn;
	String name;
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name; // final은 초기값을 세팅해야한다.
	}
}
