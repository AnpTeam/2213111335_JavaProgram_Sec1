
public class MoveablePoint implements Moveable{
	private int x;
	private int y;
	private int xSpeed;
	private int ySpeed;
	
	//CONSTRUCTOR
	public MoveablePoint(int x , int y , int xSpeed ,int ySpeed){
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public String toString() {
		return "Point at ("+this.x+","+this.y+")";
	}

	@Override
	public void moveUp() {
		this.y = this.y + this.ySpeed;
	}

	@Override
	public void moveDown() {
		this.y = this.y - this.ySpeed;
	}

	@Override
	public void moveLeft() {
		this.x = this.x - this.xSpeed;
	}

	@Override
	public void moveRight() {
		this.x = this.x + this.xSpeed;
	}
}
