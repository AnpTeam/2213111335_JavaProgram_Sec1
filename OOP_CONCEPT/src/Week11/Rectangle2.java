package Week11;

public class Rectangle2 implements Shape2{
	private double width;
	private double length;

	// constructor
	public Rectangle2(double width, double length) {
		this.width = width;
		this.length = length;
	}
	public double getWidth() {
		return this.width;
	}

	public double getLength() {
		return this.length;
	}
	
	@Override
	public String toString() {
		return "Rectangle width =" + this.width + " , length = " + this.length+" ," + " color ="+ color + "\nArea is "+ getArea();
	}
	@Override
	public double getArea() {
		return this.width * this.length;
	}
}
