package homework10;

import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("어떤 수를 나누시겠습니까?>> ");
				int num1 = Integer.parseInt(scanner.nextLine());

				System.out.print("어떤 수로 나누시겠습니까?>> ");
				int num2 = Integer.parseInt(scanner.nextLine());

				int result = num1 / num2; // 나눗셈의 결과는 정수로 나타낸다.
				System.out.println(num1 + "/" + num2 + "=" + result);
				break;

			} catch (NumberFormatException e) { // 입력값이 정수가 아닐 경우
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");

			} catch (ArithmeticException e) { // 입력값이 0일 경우
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요. ");
			}
		}
		scanner.close();
	}
}


