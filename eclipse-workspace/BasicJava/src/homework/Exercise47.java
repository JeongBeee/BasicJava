package homework;

import java.util.Arrays;

//연습문제 - 05. 참조 타입
//로또번호(6개) 생성 프로그램 1-45번, 중복x

/*import java.util.Random;

public class Exercise47 {
	public static void main(String[] args) {

		int[] lotto = new int[6];
		Random random = new Random();

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i--;
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i] + "");
		}
	}
}*/

import java.util.Random;

public class Exercise47 {
	public static void main(String[] args) {
		Random random = new Random();
		int lotto[] = new int[6];

		// 로또번호 추출
		System.out.print("로또번호는 ");

		for (int i = 0; i < lotto.length; i++) { // 6개의 숫자 출력
			int num = random.nextInt(45) + 1; // 45은 0부터 44 +1
			lotto[i] = num; // 랜덤출력된 로또번호 삽입

			// 중복 제거
			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) { // i에는 5, j(0,1,2,3,4) ex)마지막번호 == 첫번째번호
					i--; // 다음 수 비교를 위해 i--
					break;
				}
			}
          // System.out.print(lotto[i] + " "); 오류발생
		}
		System.out.print(Arrays.toString(lotto));
		System.out.print(" 입니다.");
	}
}