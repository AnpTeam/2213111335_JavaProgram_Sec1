package Week11;

public abstract class Shape {
	private String color;

	Shape() {
		this.color = null; // this(null);
	}

	Shape(String color) {
		this.color = color;
	}

	// abstract method
	public abstract double getArea();

	// method
	public String toString() {
		return "color = " + color;
	}
}
