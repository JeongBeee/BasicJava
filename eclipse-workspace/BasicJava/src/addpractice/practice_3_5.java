package addpractice;

public class practice_3_5 {
	// 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서
	// 변수 num의 값을 뺀 나머지를 구하는 코드
	public static void main(String[] args) {
		int num = 32;
		System.out.println((num / 10 * 10) + 10 - num);
		//System.out.println(10 - num % 10);

	}
}
