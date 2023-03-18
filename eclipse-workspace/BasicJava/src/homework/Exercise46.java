package homework;

// 연습문제 - 05. 참조타입
// 배열의 최댓값과 최솟값을 구하는 프로그램

public class Exercise46 {
	public static void main(String[] args) {
		int[] array = { 38, 94, 16, 3, 76, 94, 82, 47, 59, 8 };
		int max = array[0];
		int min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("최대값: " + max);
		System.out.println("최솟값: " + min);
	}
}
