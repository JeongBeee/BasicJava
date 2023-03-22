package chapter06;

public class MemberExample {
public static void main(String[] args) {
	
	// Member가 객체 생성, member가 생성 객체 주소값을 가져옴(참조), member의 자료형이 Member
	Member user1 = new Member("홍길동","hong");
    System.out.println();
  }
 }

/*Member member = new Member();
 * System.out.println("이름: " + member.name);
System.out.println("나이: " + member.age);

member.name = "최하얀";
member.age = 23;

System.out.println("이름: " + member.name);
System.out.println("나이: " + member.age);*/


/*Member m1; // 클래스 블록 안에 있는 '필드'
// 클래스란? 데이터를 필드로 정의하고 데이터 동작을 저장하는 객체를 만들기 위한 설계도
public static void main(String[] args) {
	Member m1 = new Member();
	Member m2 = new Member();
	Member m3 = new Member();
	Member m4 = new Member();
	Member m5 = new Member();
	//메소드 블록 안에 있는 '변수'
}*/