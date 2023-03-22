package homework;

// 연습문제 - 05. 참조타입
// 배열의 최댓값과 최솟값을 구하는 프로그램

public class Exercise46 {
	public static void main(String[] args) {
		int[] array = { 38, 94, 16, 3, 76, 94, 82, 47, 59, 8 };
		int max = array[0]; // 0번째 수를 최대값이라고 가정
		int min = array[0]; // 0번째 수를 최소값이라고 가정

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) { // max값에 i번째 값이 반복(length만큼)해서 저장
				max = array[i]; 
			}
			else if (array[i] < min) { // max값이 아닐 경우 i번째 값이 반복(length만큼)해서 min값에 저장
				min = array[i];
			}
		}
		System.out.println("최대값: " + max);
		System.out.println("최솟값: " + min);
	}
}

/* 두번째 방법
int min = Integer.MIN_VALUE; // 가장 작은 값으로 시작
int max = Integer.MAX_VALUE; // 가장 큰 값으로 시작

int[] array = { 38, 94, 16, 3, 76, 94, 82, 47, 59, 8 };

for (int i = 0; i < array.length; i++) {
	if (array[i] > max) {
		max = array[i];
	}
	else if (array[i] < min) {
		min = array[i];
	} */