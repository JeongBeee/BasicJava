package homework;
//04.조건문과 반복문
//5과목의 총점,평균,학점 출력 프로그램
//(90점이상:A, 80점이상 90점미만:B, 70점 이상 80점 미만:C, 60점이상 70점 미만:D, 60점 미만:F)
import java.util.Scanner;

public class Exercise43 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("점수를 입력하세요.");

		System.out.print("프로그래밍 기초: ");
		int score1 = Integer.parseInt(scanner.nextLine());
		System.out.print("데이터베이스: ");
		int score2 = Integer.parseInt(scanner.nextLine());
		System.out.print("화면 구현: ");
		int score3 = Integer.parseInt(scanner.nextLine());
		System.out.print("애플리케이션 구현: ");
		int score4 = Integer.parseInt(scanner.nextLine());
		System.out.print("머신러닝: ");
		int score5 = Integer.parseInt(scanner.nextLine());

		int sum = score1 + score2 + score3 + score4 + score5;
		double avg = (double)(score1 + score2 + score3 + score4 + score5) / 5;
        // double형 변환 필요
		System.out.println("총점: " + sum);
		System.out.printf("평균: "+ "%.2f\n" , avg);

		if (avg >= 90) {
			System.out.println("학점: A");
		} else if (80 <= avg && avg < 90) {
			System.out.println("학점: B");
		} else if (70 <= avg && avg < 80) {
			System.out.println("학점: C");
		} else if (60 <= avg && avg < 70) {
			System.out.println("학점: B");
		} else {
			System.out.println("학점: F");
		}
		scanner.close();
	}
}
