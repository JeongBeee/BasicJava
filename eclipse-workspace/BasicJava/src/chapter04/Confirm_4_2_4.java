package chapter04;

public class Confirm_4_2_4 {
	public static void main(String[] args) {
		for (int x = 1; x <= 10; x++) { // x는 1부터 10 자연수
			for (int y = 1; y <= 10; y++) { // y는 1부터 10 자연수
				if (4 * x + 5 * y == 60) // 4x + 5y = 60일 경우 찾기
					System.out.println("방정식 4x+5y=60의 해는 "+"(" + x + "," + y + ")" + " 이다.");
				    //System.out.printf("(%d, %d)\n", x,y);
			}
		}
	}
}
