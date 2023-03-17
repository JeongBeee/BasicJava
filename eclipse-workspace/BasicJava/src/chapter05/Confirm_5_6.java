package chapter05;

import java.util.Scanner;

public class Confirm_5_6 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum]; // scores 배열을 생성해준다, studentNum 만큼

			} else if (selectNo == 2) {
				for (int i = 0; i < studentNum; i++) { // 학생 수 만큼 입력을 받아야 하니까
					System.out.print("scores[" + i + "]>");
					int score = Integer.parseInt(scanner.nextLine());
					scores[i] = score; // scores에 score 저장
				}

			} else if (selectNo == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "]>" + scores[i]); // 저장한 score를 studentNum 만큼 출력
				}
			} else if (selectNo == 4) {
				int sum = 0;
				int max = 0;
				double avg = 0.0;
				for (int i = 0; i < studentNum; i++) { 
					sum += scores[i];  // 점수 더하기
					if (scores[i] > max) { // max에 비교해가면서 점수들을 저장
						max = scores[i];
					}
				}
				avg = (double) sum / studentNum;
				System.out.println("최고 점수:" + max);
				System.out.println("평균 점수:" + avg);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}

/*
 * if (button == 1) { System.out.print("예금액> "); balance +=
 * Integer.parseInt(scanner.nextLine()); continue; } else if (button == 2) {
 * System.out.print("출금액> "); balance -= Integer.parseInt(scanner.nextLine());
 * continue; } else if (button == 3) { System.out.println("잔고> " + balance); }
 * if (button == 4) { break; }
 */