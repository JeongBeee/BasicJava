package homework7;

public class Circle extends Shape {
	
	//필드
	double radius;
 
	//생성자
	public Circle(double radius) {
		this.radius = radius;
	}

	//메소드
	@Override
	public double perimeter() {
		return 2 * radius * Math.PI;
	}

	@Override
	public double area() {
		return radius * radius * Math.PI;
	}

	@Override
	public String toString() {
		return "도형의 종류: 원" + ", 둘레:" + perimeter() + "cm" + ", 넓이: " + area() + "cm²";
	}
}
