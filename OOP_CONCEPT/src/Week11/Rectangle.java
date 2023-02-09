package Week11;

public class Rectangle extends Shape {

	private double width;
	private double length;

	// constructor
	public Rectangle(double width, double length, String color) {
		super(color);
		this.width = width;
		this.length = length;
	}

	@Override
	public double getArea() {
		return this.width * this.length;
	}

	public double getWidth() {
		return this.width;
	}

	public double getLength() {
		return this.length;
	}

	// toString
	@Override
	public String toString() {
		return "Rectangle width =" + this.width + " , length = " + this.length+" ," + super.toString() + "\nArea is "+ getArea();
	}
}
