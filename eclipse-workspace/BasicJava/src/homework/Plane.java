package homework;

public class Plane {
	// 필드
	private String manufacture;
	private String model;
	private int maxNumberOfPassengers;
	private static int numberOfPlanes;

	// 생성자
	public Plane() {
		numberOfPlanes++; // 객체가 생성될 때(new)마다 생성자에서 증가시켜줘야함.
	}

	public Plane(String manufacture, String model, int maxNumberOfPassengers) {
		this();
		this.manufacture = manufacture;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
		numberOfPlanes++; // 객체가 생성될 때마다 생성자에서 증가시켜줘야함.
	}

	// 메소드
	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}

	public void setmaxNumberOfPassengers(int maxNumberOfPassengers) {
		if (maxNumberOfPassengers > 0)
			this.maxNumberOfPassengers = maxNumberOfPassengers;
	}

	public static int getnumberOfPlanes() {
		return numberOfPlanes;
	}
	// toString() 생략
}

/* 	private String manufacture;
	private String model;
	private int maxNumberOfPassengers;
	private static int numberOfPlanes;
	
	public Plane(){
	}
	public Plane(String manufacture, String model, int maxNumberOfPassengers){
		this.manufacture = manufacture;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
	}
 */


