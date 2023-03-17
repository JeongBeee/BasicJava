package chapter03;

import java.util.Scanner;

public class Confirm_3_2_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫 번째 수: ");
		double num1 = Double.parseDouble(scanner.nextLine());  //문자열로 입력받고, 실수로 변환

		System.out.print("두 번째 수: ");
		double num2 = Double.parseDouble(scanner.nextLine());

		System.out.println("--------------------");

		if (num2 != 0.0) {
			System.out.println("결과:" + (num1 / num2));    // 0.0/0 이 아닐경우 정상연산, 그 외 무한대 출력
		} else {
			System.out.println("결과: 무한대");

		}
		scanner.close();
	}
}
