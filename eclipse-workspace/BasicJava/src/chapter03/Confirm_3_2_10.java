package chapter03;

public class Confirm_3_2_10 {
	public static void main(String[] args) {
		int var1 = 10; // 반지름
		int var2 = 3;
		int var3 = 14;
		double var4 = var1 * var2 * Double.parseDouble(var2 + "." + var3); // 원주율(문자열결합후 문자열->실수형), 문자열은 연산 불가
		System.out.println("원의 넓이:" + var4);
	}
}
