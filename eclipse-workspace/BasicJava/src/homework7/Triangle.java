package homework7;

public class Triangle extends Shape {
	
	// 필드
	double side; 
	
	// 생성자
	public Triangle(double side) {
		this.side = side;
	}

	// 메소드
	@Override
	public double perimeter() {
		return side * 3;
	}

	@Override
	public double area() {
		return (side * side) / 2;
	}

	@Override
	public String toString() {
		return "도형의 종류: 삼각형" + ", 둘레:" + perimeter() + "cm" + ", 넓이: " + area() + "cm²";
	}

}
