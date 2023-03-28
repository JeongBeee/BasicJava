package homework;

public class Circle {
	// 필드
	private double radius; // 반지름
	private double x; // x좌표
	private double y; // y좌표

	// 생성자 (기본 생성자)
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

	public double getRadius() { // 필드가 있어서가 아니라 메소드명이 getArea 인것.
		return radius;
	}

	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public void setRadius(double radius) { // radius가 양수가 나왔을때만 값을 저장하라.
		if (radius > 0) {
			this.radius = radius;
		} else {
			this.radius = 0;
		}
	}




}
