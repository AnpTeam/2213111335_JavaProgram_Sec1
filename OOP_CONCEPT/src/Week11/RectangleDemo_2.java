package Week11;
import java.util.*;

public class RectangleDemo_2 {
	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input width : ");
		double width = scan.nextDouble();
		System.out.print("Input length : ");
		double height = scan.nextDouble();
		
		Rectangle2 rec2 = new Rectangle2(width,height);
		
		System.out.println(rec2);
	}
}
