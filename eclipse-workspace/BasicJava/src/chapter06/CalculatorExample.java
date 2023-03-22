package chapter06;
// 메소드 호출
public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalculator = new Calculator();
		myCalculator.powerOn();

		int result1 = myCalculator.plus(5, 6);
		System.out.println("result1: " + result1);

		byte x = 10;
		byte y = 4;
		double result2 = myCalculator.divide(x, y);
		System.out.println("result2: " + result2);
	}
}
