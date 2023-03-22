package chapter06;
//메소드 선언
public class Calculator {
	void powerOn() { // void는 리턴값ㄴㄴ
		System.out.println("전원을 켭니다.");
	}

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	double divide(int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
