package chapter04;

import java.util.Scanner;

public class Confirm_4_2_7 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");
			int button = Integer.parseInt(scanner.nextLine());

			if (button == 1) {
				System.out.print("예금액> ");
				balance += Integer.parseInt(scanner.nextLine());
				continue;
			} else if (button == 2) {
				System.out.print("출금액> ");
				balance -= Integer.parseInt(scanner.nextLine());
				continue;
			} else if (button == 3) {
				System.out.println("잔고> " + balance);
			}
			if (button == 4) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}

}