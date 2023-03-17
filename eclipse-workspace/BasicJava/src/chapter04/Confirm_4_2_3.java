package chapter04;

import java.util.Random;

public class Confirm_4_2_3 {
	public static void main(String[] args) {
		Random random = new Random();
		// 주사위를 던지는 부분
		while (true) { // while(true) 계속 실행-무한반복
			int num1 = random.nextInt(6) + 1; // (6) 이란? 0부터 5까지
			int num2 = random.nextInt(6) + 1;
			System.out.println("나온 주사위의 눈은 " + "(" + num1 + "," + num2 + ") 입니다.");
			// 출력문(2) System.out.printf("(%d, %d)", num1, num2);
			if (num1 + num2 == 5) {
				break;
			}
		}
		System.out.println("실행을 멈춥니다.");
	}
}
// 눈1+눈2 != 5 일때 계속 진행 continue
// 눈1+눈2 = 5 일때 break
