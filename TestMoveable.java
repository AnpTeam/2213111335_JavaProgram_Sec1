
public class TestMoveable {
	public static void main(String[] args) {
		Moveable m1 = new MoveablePoint(5, 6, 10, 15);
		System.out.println(m1);
		m1.moveLeft();
		System.out.println(m1);
		Moveable m2 = new MoveableCircle(1, 2, 3, 4, 20);
		System.out.println(m2);
		m2.moveRight();
		System.out.println(m2);
	}
}
