package homework;
//02.변수와 타입
// 저금통안에 총 얼마가 들어있을까?

import java.util.Scanner;

public class Exercise25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("500원짜리 동전의 갯수: ");
		//int coin500 = Integer.parseInt(scanner.nextLine());
		// String coin500 = scanner.nextLine(); // 문자열 입력
		int coin500 = scanner.nextInt();
		
		System.out.print("100원짜리 동전의 갯수: ");
		//int coin100 = Integer.parseInt(scanner.nextLine());
		//String coin100 = scanner.nextLine();
		int coin100 = scanner.nextInt();
		
		System.out.print("50원짜리 동전의 갯수: ");
		//int coin50 = Integer.parseInt(scanner.nextLine());
		//String coin50 = scanner.nextLine();
		int coin50 = scanner.nextInt();
		
		System.out.print("10원짜리 동전의 갯수: ");
		//int coin10 = Integer.parseInt(scanner.nextLine());
		//String coin10 = scanner.nextLine();
		int coin10 = scanner.nextInt();
		
	//	int num1 = Integer.parseInt(coin500); // int형으로 변환
	//	int num2 = Integer.parseInt(coin100);
	//	int num3 = Integer.parseInt(coin50);
	//	int num4 = Integer.parseInt(coin10);

		int result = (coin500 * 500) + (coin100 * 100) + (coin50 * 50) + (coin10 * 10);
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