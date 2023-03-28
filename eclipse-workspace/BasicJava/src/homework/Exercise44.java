package homework;

//04.조건문과 반복문
//else if문의 구조 이해하기, 자바 string타입, 문자열 비교 방법 알기
//***중요! 가위바위보게임
import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위 바위 보 게임");

		System.out.print("철수: ");
		String boy = scanner.nextLine();

		System.out.print("영희: ");
		String girl = scanner.nextLine();

		System.out.print("결과: ");
		String result = ""; // 문자열 초기화

		if (boy.equals(girl)) {
			System.out.println("비겼습니다!");
		} // 비기는 경우
		else if (boy.equals("바위") && girl.equals("가위") || boy.equals("가위") && girl.equals("보")
				|| boy.equals("보") && girl.equals("바위")) // 철수가 이기는 경우
		{
			result = "철수가 이겼습니다!";
		} else {
			result = "영희가 이겼습니다!";
		}
		System.out.println(result);
		

		/*
		 * System.out.print("결과: "); if (boy.equals(girl)) { // 비기는 경우
		 * System.out.println("비겼습니다."); } else if (boy.equals("가위")) { // 철수 = 가위 if
		 * (girl.equals("바위")) { System.out.println("영희 승리!"); } else if
		 * (girl.equals("보")) { System.out.println("철수 승리!"); } } else if
		 * (boy.equals("바위")) { // 철수 = 바위 if (girl.equals("가위")) {
		 * System.out.println("철수 승리!"); } else if (girl.equals("보")) {
		 * System.out.println("영희 승리!"); } } else if (boy.equals("보")) { // 철수 = 보 if
		 * (girl.equals("바위")) { System.out.println("철수 승리!"); } else if
		 * (girl.equals("가위")) { System.out.println("영희 승리!"); } }
		 */
		scanner.close();
	}
}
/*
 * 시험에 나옴 System.out.println("가위 바위 보 게임");
 * 
 * System.out.print("철수: "); 
 * String boy = scanner.nextLine();
 * System.out.print("영희: "); 
 * String girl = scanner.nextLine(); 
 * String result = ""; 
 * if(boy.equals(girl)) { 
 * result = "비김"; 
 * } 
 * else if
 * (boy.equals("가위") && girl.equals("바위") || boy.equals("바위") &&
 * girl.equals("보") || boy.equals("보") && girl.equals("가위")) { 
 * result = "영희 승리!"; } 
 * else 
 * { result = "철수 승리!"; 
 * } 
 * System.out.println("결과: " + result);
 * 
 * 
 * /* 두번째 방법
 * 
 * if (boy.equals("바위") && girl.equals("가위") ) { System.out.println("철수 승리!"); }
 * else if (boy.equals("바위") && girl.equals("보")) {
 * System.out.println("영희 승리!");
 * 
 * } else if (boy.equals("가위") && girl.equals("보")) {
 * System.out.println("철수 승리!"); } else if (boy.equals("가위") &&
 * girl.equals("바위")) { System.out.println("영희 승리!");
 * 
 * } else if (boy.equals("보") && girl.equals("바위")) {
 * System.out.println("철수 승리!"); } else if (boy.equals("보") &&
 * girl.equals("가위")) { System.out.println("영희 승리!"); }
 */
