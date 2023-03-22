package homework;

//연습문제 - 05. 참조 타입
//인공지능 컴퓨터와 사람의 가위바위보 게임

import java.util.Random;
import java.util.Scanner;

public class Exercise48 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int num = random.nextInt(3);// 0부터 2까지
		String[] coms = { "가위", "바위", "보" };
		String result = ""; // 문자열 초기화

		System.out.print("가위 바위 보를 입력하세요: ");
		String human = scanner.nextLine();
		System.out.println("게이머: " + human);

		System.out.println("인공지능 컴퓨터: " + coms[num]);
		// 0부터 1까지의 랜덤한 수를 출력해서, 배열에 적용 -> [0],[1],[2]에 가위, 바위, 보 출력되도록
		
		if (human.equals(coms[num])) {
			result = "비겼습니다.";

		} else if (human.equals("가위") && coms[num].equals("바위") || human.equals("바위") && coms[num].equals("보")
				|| human.equals("보") && coms[num].equals("가위")) {
			result = "인공지능 컴퓨터 승리!"; // 컴퓨터가 이기는 케이스

		} else if (human.equals("바위") && coms[num].equals("가위") || human.equals("보") && coms[num].equals("바위")
				|| human.equals("가위") && coms[num].equals("보")) {
			result = "게이머 승리!"; // 게이머가 이기는 케이스

		} else {
			result = "잘못된 게이머값 입력입니다.";
		}
		System.out.println("결과: " + result);
		scanner.close();
	}
}