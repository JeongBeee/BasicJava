package homework;

public class Car {
	// 필드
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200.0; //상수

	// 생성자
	public Car() {

	}

	public Car(String color) {
		this.color = color;
	}

	// 메소드
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public static double getMaxSpeed() { // 최대 속력값을 반환하는 정적 메소드
		return MAX_SPEED;
	}

	public boolean speedUp(double speed) {
		if (speed + this.speed < 0 || speed + this.speed > MAX_SPEED) { // 외부speed 내부this.speed
			return false;
		}
		this.speed += speed;
		return true;
	}

	//public String toString() {
		//return String.format("%d", speed);
	//}
}
