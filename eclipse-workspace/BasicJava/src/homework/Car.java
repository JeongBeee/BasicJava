package homework;

public class Car {
	// 필드
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200.0;

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

	public boolean speedUp(double speed) {
		if (speed + this.speed < 0 || speed + this.speed > MAX_SPEED) {
			return false;
		}
		this.speed += speed;
		return true;
	}

	public static double getMaxSpeed() {
		return MAX_SPEED;
	}
}
