package homework;

import java.util.Arrays;
import java.util.Random;

public class P47 {

	public static void main(String[] args) {
		Random random = new Random();
		int lotto[] = new int[45];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i+1;
			
			int num1 = lotto[0]; // 0번째 값
			int num2 = random.nextInt(45) + 1; // 랜덤 번째 값
			// num1

			int temp = num1; // 비교하기 위한 temp
			num1 = num2;
			num2 = temp;
		} // num1과 num2의 값을 바꾸기

		int lottonum[] = new int[6];

		for (int i = 0; i < lottonum.length; i++) { // 0부터 5까지 , 6번
			if (i < ) {
				lottonum[i] = lotto[i];
			}
		}
		System.out.print(Arrays.toString(lottonum));
	}
}

/*
 * // 중복 제거 for (int j = 0; j < i; j++) { if (lotto[j] == lotto[i]) { // i에는 5,
 * j(0,1,2,3,4) ex)마지막번호 == 첫번째번호 i--; // 다음 수 비교를 위해 i-- break; } } //
 * System.out.print(lotto[i] + " "); 오류발생 }
 * System.out.print(Arrays.toString(lotto)); System.out.print(" 입니다."); } } //
 * 45개의 배열, 0번째 인덱스의 1과 랜덤 인덱스의 값을 바꿔치기 }
 * 
 * 
 * }
 */
