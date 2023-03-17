package homework;
//04.조건문과 반복문
//입력받는 월의 계절 판별 프로그램 (3~5월 봄, 6~8월 여름, 9~11월 가을,12~2월 겨울)
import java.util.Scanner;

public class Exercise42 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("월을 입력하세요(1~12): ");
		int month = Integer.parseInt(scanner.nextLine());

		if (3 <= month && month <= 5) {
			System.out.println(month + "월은 봄입니다.");
		} else if (6 <= month && month <= 8) {
			System.out.println(month + "월은 여름입니다.");
		} else if (9 <= month && month <= 11) {
			System.out.println(month + "월은 가을입니다.");
		} else if (1 <= month && month <= 2 || month == 12) {
			System.out.println(month + "월은 겨울입니다.");
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		scanner.close();
	}
}
/*두번째 방법
 * switch(month)
 * case3:case4:case5
 * "월은 봄입니다".
 */