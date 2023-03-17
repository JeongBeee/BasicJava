package chapter04;

public class Confirm_4_2_2 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 != 0) {
				continue; // 아래 문장을 출력하지 않고 다시 반복문으로 돌아간다.
			}
			sum += i;
		}
		System.out.println("1부터 100까지의 정수 중 3의 배수의 총합은 " + sum);
	}
}

//for (int i = 1; i <= 100; i++) {
// if (i % 3 == 0) {
//	sum += i; // 아래 문장을 출력하지 않고 다시 반복문으로 돌아간다.
// }

