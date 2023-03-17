package homework;
//03.연산자
//윤년 확인 프로그램 (윤년의 조건: 4의 배수이고, 100의 배수는 아니어야 함, 400의 배수는 무조건 윤년)
import java.util.Scanner;

public class Exercise33 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("윤년인지를 확인할 연도를 입력하세요: ");
		int year = scanner.nextInt(); // int year = Integer.parseInt(scanner.nextLine()); // 두가지 방법이 있다.

		String result = (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) ? "맞습니다." : "아닙니다.");
		// String result = ((year % 4 == 0) && (year % 100 != 0) ? "맞습니다." : (year % 400// == 0) ? "맞습니다." : "아닙니다." );
		// 삼항 연산자와 논리 연산자 사용
		System.out.println(year + "년은 윤년이 " + result);

		scanner.close();
	}
}