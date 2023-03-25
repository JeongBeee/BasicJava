package homework;

public class Circle {
	// 필드
	private double radius; // 반지름
	private double x; // x좌표
	private double y; // y좌표

	// 생성자
	public Circle() {

	}

	Circle(double radius, double x, double y) {
		this.radius = radius;
		this.x = x;
		this.y = y;
	}

	// 메소드
	public double getArea() {  // 원의 넓이 계산
		double area = radius * radius * Math.PI;
		return area;		
	}

	public double getRadius() {
		return radius;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		}
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

}
