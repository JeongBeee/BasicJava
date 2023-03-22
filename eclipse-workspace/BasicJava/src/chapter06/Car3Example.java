package chapter06;

public class Car3Example {
	public static void main(String[] args) {
		Car3 myCar3 = new Car3();
		myCar3.keyTurnOn();
		myCar3.run();
		int speed = myCar3.getSpeed();
		System.out.println("현재 속도: " + speed + "km/h");
	}
}
