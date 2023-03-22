package homework;
// 04.조건문과 반복문
// 삼각형 판별 프로그램 (삼각형의 조건: 가장 긴 변의 길이<다른 두 변의 길이의 합)
import java.util.Scanner;

public class Exercise41 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("삼각형의 첫번째 변의 길이를 입력하세요: ");
		int num1 = Integer.parseInt(scanner.nextLine());
		//int num1 = scanner.nextInt();
		System.out.print("삼각형의 두번째 변의 길이를 입력하세요: ");
		int num2 = Integer.parseInt(scanner.nextLine());
		System.out.print("삼각형의 세번째 변의 길이를 입력하세요: ");
		int num3 = Integer.parseInt(scanner.nextLine());

		if (num1 > num2 && num1 > num3) { // num1이 가장 큰 경우
			if (num1 < num2 + num3) {
				System.out.println("삼각형을 만들 수 있습니다.");
			} else {
				System.out.println("삼각형을 만들 수 없습니다.");
			}
		} else if (num2 > num1 && num2 > num3) { // num2가 가장 큰 경우
			if (num2 < num1 + num3) {
				System.out.println("삼각형을 만들 수 있습니다.");
			} else {
				System.out.println("삼각형을 만들 수 없습니다.");
			}
		} else if (num3 > num1 && num3 > num2) { // num3이 가장 큰 경우
			if (num3 < num1 + num2) {
				System.out.println("삼각형을 만들 수 있습니다.");
			} else {
				System.out.println("삼각형을 만들 수 없습니다.");
			}
		}
		scanner.close();
	}
}


/* 두번째 방법
  if (num1 < num2 + num3 && num2 < num1 + num3 && num3 < num1 + num2){
System.out.println("삼각형을 만들 수 있습니다.");
} else {
	System.out.println("삼각형을 만들 수 없습니다.");
}*/
