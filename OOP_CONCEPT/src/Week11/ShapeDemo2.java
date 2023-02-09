package Week11;
import java.util.*;

public class ShapeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int sizeArrays = 5;
		
		double[] radius =new double[sizeArrays];
		double[] height = new double[sizeArrays];
		
		for(int i = 0; i< sizeArrays ;i++) {
			System.out.print("Input radius and height : ");
			radius[i]=scan.nextDouble();
			height[i] = scan.nextDouble();
		}
		System.out.println();
		
		for(int e = 0 ; e< sizeArrays ;e++) {
			Cylinder cylinder = new Cylinder(radius[e],height[e]);
			System.out.println("Cylinder "+(e+1)+", volume="+cylinder.getVolume());
		}
	}

}
