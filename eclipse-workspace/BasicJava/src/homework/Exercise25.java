package homework;
//02.변수와 타입
// 저금통안에 총 얼마가 들어있을까?

import java.util.Scanner;

public class Exercise25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("500원짜리 동전의 갯수: ");
		String coin500 = scanner.nextLine();

		System.out.print("100원짜리 동전의 갯수: ");
		String coin100 = scanner.nextLine();

		System.out.print("50원짜리 동전의 갯수: ");
		String coin50 = scanner.nextLine();

		System.out.print("10원짜리 동전의 갯수: ");
		String coin10 = scanner.nextLine();

		int num1 = Integer.parseInt(coin500);
		int num2 = Integer.parseInt(coin100);
		int num3 = Integer.parseInt(coin50);
		int num4 = Integer.parseInt(coin10);

		int result = (num1 * 500) + (num2 * 100) + (num3 * 50) + (num4 * 10);
		System.out.println("저금통 안의 동전의 총 액수: " + result);

		scanner.close();

	}
}

// Other Case
/*package homework;

import java.util.Scanner;

public class Exercise25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("500원짜리 동전의 갯수: ");
		int coin500 = scanner.nextInt();

		System.out.print("100원짜리 동전의 갯수: ");
		int coin100 = scanner.nextInt();

		System.out.print("50원짜리 동전의 갯수: ");
		int coin50 = scanner.nextInt();

		System.out.print("10원짜리 동전의 갯수: ");
		int coin10 = scanner.nextInt();


		int result = (coin500 * 500) + (coin100 * 100) + (coin50 * 50) + (coin10 * 10);
		System.out.println("저금통 안의 동전의 총 액수: " + result);

		scanner.close();

	}
}*/