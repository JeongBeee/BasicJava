package chapter04;

public class practice {
	public static void main(String[] args) {
		for (int m = 0; m <= 5; m++) {
			for (int n = 0; n <= 5; n++) {
				if (m == n) {
					System.out.printf("[%d,%d]", m, n);
				} else {
					System.out.printf("%5c", "");
				}
			}
			System.out.println();
		}
	}
}