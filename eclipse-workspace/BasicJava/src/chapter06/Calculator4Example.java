package chapter06;

public class Calculator4Example {
	public static void main(String[] args) {
		Calculator4 calculator4 = new Calculator4();
		System.out.println("15 + 30 = " + calculator4.plus(10, 20));

		// 반지름이 5인 원의 넓이를 구한다.
		double result = 5 * 5 * Calculator4.pi; // calculator.pi = > Calculator.pi 클래스이름.pi 로 바꾼다
		System.out.println("반지름이 5인 원의 넓이: " + result);
		// 뺄셈 연산을 한다. 100-24
		System.out.println(Calculator4.minus(100, 24)); // ststic은 이미 만들어져있다.
	}
}
