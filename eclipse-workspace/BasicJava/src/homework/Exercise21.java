package homework;
//02.변수와 타입
//직사각형의 둘레와 면적을 구하는 프로그램(실수 자료형 사용)
import java.util.Scanner;

public class Exercise21 {
	public static void main(String[] args) {
        // 입력
		Scanner scanner = new Scanner(System.in);

		System.out.print("가로의 길이는?(단위: m): ");
		String strWidth = scanner.nextLine();

		System.out.print("세로의 길이는?(단위: m): ");
		String strLength = scanner.nextLine();
        
		// 처리
		double num1 = Double.parseDouble(strWidth);
		double num2 = Double.parseDouble(strLength);
        
		double result1 = num1 * num2;
		double result2 = 2 * (num1 + num2);
        
		// 출력
		System.out.println("직사각형의 넓이: " + result1);
		System.out.println("직사각형의 둘레: " + result2);

		scanner.close();

	}
}

// nextDouble을 쓸 경우
/*package homework;

import java.util.Scanner;

public class Exercise21 {
	public static void main(String[] args) {
        // 입력
		Scanner scanner = new Scanner(System.in);

		System.out.print("가로의 길이는?(단위: m): ");
		double strWidth = scanner.nextDouble();

		System.out.print("세로의 길이는?(단위: m): ");
		double strLength = scanner.nextDouble();
        // 처리
		double result1 = strWidth * strLength;
		double result2 = 2 * (strWidth + strLength);
        // 출력
	    System.out.println("직사각형의 넓이: " + result1);
		System.out.println("직사각형의 둘레: " + result2);

		scanner.close();

	}
}*/
 