package Week11;
import java.util.*;

public class ShapeDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		///////////////CIRCLE///////////////////
		
		//INPUT
		System.out.print("Input radius : ");
		double radius = scan.nextDouble();
		System.out.print("Input height : ");
		double height = scan.nextDouble();
		
		//SONG CONSTRUCTOR
		Circle circle = new Circle(radius,null);
		
		System.out.println("Circle["+circle+"]");
		System.out.println("Circle[area = "+circle.getArea()+"]");
		System.out.println();
		
		/////////////CYLINDER/////////////////////
		Cylinder cylinder = new Cylinder(radius ,  height);
		
		//SADEANG
		System.out.println("Cylinder["+cylinder+"]");
		System.out.println("Cylinder[area = "+cylinder.getArea()+"]");
		System.out.println("Cylinder[volume = "+cylinder.getVolume()+"]");
		
		
	}

}
