package chapter05;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";

		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름"); // 자바 ==은 주소값
		}

		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음"); // 자바는 equals 비교
		}

		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");

		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름"); //new를 했으니!!!
		}

		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}
}
/*
 * String은 참조타입 // jdk 1.5 or 1.7부터 String Pool이라는 공간을 만들었음(Heap) int a = 10;
 * String str = new String("홍길동"); // 0x1235 String str2 = "홍길동"; //리터럴로 문자열을
 * 저장할 때 // 0x1235 String str3 = "홍길동"; // 0x1235 String str4 = "홍길동";
 */
