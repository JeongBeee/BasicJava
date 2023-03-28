package homework;

public class TimeTest {
	public static void main(String[] args) {
		Time time1 = new Time(); // time1은 참조타입변수다 객체의 주소값이 저장되어있음. 요거에 tostring을 결합시킨다
		System.out.println("기본 생성자 호출 후 시간: " + time1.toString()); // 콘솔에 출력할때 tostring 결합, 생략 가능
		Time time2 = new Time(22, 15, 48);
		System.out.println("두 번째 생성자 호출 후 시간: " + time2);
		Time time3 = new Time(15, 66, 77);
		System.out.println("올바르지 않은 시간 설정 후 시간 " + time3);
	}
}