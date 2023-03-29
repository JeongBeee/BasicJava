package homework;


public class practice {
	//필드
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200.0; //대문자? 상수!
	
	//생성자
	public practice() {
		
	}
	public practice(String color) {
		this.color = color;
	}
	
	//메소드
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
		speed = kiloToMile(speed);
		if (speed + this.speed >= 0 && speed + this.speed <= MAX_SPEED) {
			this.speed += speed;
			return true;
		} else {
			return false;
		}
	}
	static double getMaxSpeed() { // 외부에서
		return mileToKilo(MAX_SPEED);
	}
	private static double kiloToMile(double distance) {
	  return distance / 1.6 ;
	}
	private static double mileToKilo(double distance) {
	 return distance * 1.6 ;
	}
	public String toString() {
		return String.format("%d", speed);
	}
}

/*if (boy.equals(girl))*/
