package chapter06;

public class Car2Example {
	public static void main(String[] args) {
		Car2 myCar2 = new Car2();

		myCar2.setGas(5); // Car의 setGas() 메소드 호출

		boolean gasState = myCar2.isLeftGas(); // Car의 isleftGas() 메소드 호출
		if (gasState) {
			System.out.println("출발합니다.");
			myCar2.run(); // Car의 run() 메소드 호출
		}

		if (myCar2.isLeftGas()) { // Car의 isLeftGas() 메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
