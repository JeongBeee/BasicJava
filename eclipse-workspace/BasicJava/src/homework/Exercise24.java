package homework;
//02.변수와 타입
// 원기둥 밑면의 넓이와 부피를 계산하는 프로그램 (원주율:Math.PI)

import java.util.Scanner;

public class Exercise24 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위: cm): ");
		String x = scanner.nextLine();

		System.out.print("원기둥의 높이를 입력하시오.(단위: cm): ");
		String y = scanner.nextLine();

		double num1 = Double.parseDouble(x);
		double num2 = Double.parseDouble(y);

		double result1 = num1 * num1 * Math.PI;
		System.out.print("원기둥 밑변의 넓이는 " + result1 + "㎠이고, ");

		double result2 = num1 * num1 * num2 * Math.PI;
		System.out.print("원기둥의 부피는 " + result2 + "㎠이다.");

		scanner.close();

	}
}