
public class MoveableCircle implements Moveable {
	private int radius;
	MoveablePoint center;

	public MoveableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		this.center = new MoveablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}

	public String toString() {
		return "Circle center" + center + ",radius = " + this.radius;
	}

	@Override
	public void moveUp() {
		center.moveUp();
	}

	@Override
	public void moveDown() {
		center.moveDown();
	}

	@Override
	public void moveLeft() {
		center.moveLeft();
	}

	@Override
	public void moveRight() {
		center.moveRight();
	}
}
