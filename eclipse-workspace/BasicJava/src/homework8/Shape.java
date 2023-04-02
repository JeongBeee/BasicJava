package homework8;

public abstract class Shape implements Comparable<Shape> {

	public abstract double area();

	public abstract double perimeter();

	@Override // 도형의 넓이와 비교로직
	public int compareTo(Shape other) {
		if (area() > other.area()) {
			return 1; // 현대 객체가 다른 객체보다 큼
		} else if (area() < other.area()) {
			return -1; // 현재 객체가 다른 객체보다 작음
		} else {
			return 0; // 현재 객체와 다른 객체가 같음
		}
	}
}