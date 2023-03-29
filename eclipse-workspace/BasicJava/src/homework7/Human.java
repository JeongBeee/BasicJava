package homework7;

public class Human {
	
	// 필드
	String name; // 이름
	int age; // 나이

	// 생성자
	public Human() {

	}

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "이름:" + name + ",나이:" + age;
	}

}
