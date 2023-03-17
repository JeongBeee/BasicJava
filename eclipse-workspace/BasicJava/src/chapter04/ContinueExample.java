package chapter04;

public class ContinueExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue; //출력을 하지 않고 다음 반복문으로 넘어간다.
			}
			System.out.println(i);
		}
	}
}
