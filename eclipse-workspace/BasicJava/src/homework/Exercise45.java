package homework;
//04.조건문과 반복문
//컴퓨터가 1-100사이 정수를 생성하면 그 수를 맞추는 게임
//+ 몇 번째에 맞췄는지 판별, 랜덤 숫자 어떻게 구하는지 유의
import java.util.Random;
import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Random random = new Random();
		int com = random.nextInt(100) + 1; // (100) 이란? 0부터 99까지
		
		int count = 0;
		
		while (true) { // while(true) 계속 실행-무한반복
			count++; //입력 횟수 집계
			System.out.print("1부터 100 사이의 정수 중 하나를 선택하세요: ");
			int num = Integer.parseInt(scanner.nextLine());
			// int num = scanner.nextInt();
			
			if (com > num) {
				System.out.println("정답은 더 큰 수입니다.");
			} else if (com < num) {
				System.out.println("정답은 더 작은 수 입니다.");
			} else {
				System.out.println("정답입니다. " + count + "번 입력");
				break;
			}
		}
		System.out.println("게임을 종료합니다.");
		scanner.close();
	}
}
