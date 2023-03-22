package homework;

//연습문제 - 05. 참조 타입
//로또번호(6개) 생성 프로그램 1-45번, 중복x

import java.util.Random;

public class Exercise47 {
	public static void main(String[] args) {
		Random random = new Random();
		//int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
		//		27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45 };
		// numbers[0]와 number[ranNum]의 숫자를 맞바꿔준다.
		int[] numbers = new int[45]; // 45개의 숫자
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]=i+1;   // 45개 배열에 값 삽입 numbers[i]번째에 i+1 값 저장, ex) 0번째에 1저장
		}

		for (int i = 0; i < numbers.length; i++) {
			int ranNum = random.nextInt(45); // 45개의 숫자 중 랜덤 출력
			int temp = numbers[i];
			numbers[i] = numbers[ranNum];
			numbers[ranNum] = temp; // numbers[ranNum] 과 numbers[i] 자리 바꾸기 -> length번 반복
		}
		
		for (int i = 0; i < 6; i++) { // 6개만 출력해야 하니까-> 하나씩 출력되는 것을 6번 반복 하는 것임
//			if (i != 0) {
//				System.out.print(",");
//			} // 첫 번째 방법
			System.out.print((i == 0 ? "" : ",") + numbers[i]);  // 두 번째 방법 : 
			// i가 0, 첫번째 자리에는 , 가 안 찍히고 마지막 자리에는 i가 6이어서 찍히지 않음.
		}
	}
}

/*
 * Random random = new Random(); int lotto[] = new int[6];
 * 
 * // 로또번호 추출 System.out.print("로또번호는 ");
 * 
 * for (int i = 0; i < lotto.length; i++) { // 6개의 숫자 출력 int num =
 * random.nextInt(45) + 1; // 45은 0부터 44 +1 lotto[i] = num; // 랜덤출력된 로또번호 삽입
 * 
 * // 중복 제거 for (int j = 0; j < i; j++) { if (lotto[j] == lotto[i]) { // i에는 5,
 * j(0,1,2,3,4) ex)마지막번호 == 첫번째번호 i--; // 다음 수 비교를 위해 i-- break; } } //
 * System.out.print(lotto[i] + " "); 오류발생 }
 * System.out.print(Arrays.toString(lotto)); System.out.print(" 입니다.");
 */

// 45개의 배열, 0번째 인덱스의 1과 랜덤 인덱스의 값을 바꿔치기
