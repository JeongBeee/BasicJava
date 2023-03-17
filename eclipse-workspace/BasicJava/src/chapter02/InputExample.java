package chapter02;

import java.util.Scanner;

public class InputExample {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
//	String str = scanner.nextLine(); // 문자열 입력
//	int intValue = scanner.nextInt(); // 정수(int) 입력
	int intValue = Integer.parseInt(scanner.nextLine());
	scanner.nextDouble(); // 실수(double) 입력
  }
}
