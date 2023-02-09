package Week11;

import javax.swing.*;

public class ShapeDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sizeArrays = 5;
		int e;

		double[] radius = new double[sizeArrays];
		double[] height = new double[sizeArrays];
		double[] volume = new double[sizeArrays];

		for (int i = 0; i < sizeArrays; i++) {
			String data = JOptionPane.showInputDialog("Input radius and height cylinder " + (i + 1) + ": ");
			radius[i] = Double.parseDouble(data.split(" ")[0]);
			height[i] = Double.parseDouble(data.split(" ")[1]);
		}
		for (e = 0; e < sizeArrays; e++) {
			Cylinder cylinder = new Cylinder(radius[e], height[e]);

			volume[e] = cylinder.getVolume();
		}
		
		//DISPLAY
		JOptionPane.showMessageDialog(null, "Cylinder 1, volume="    + volume[0]
											+"\nCylinder 2, volume=" + volume[1]
											+"\nCylinder 3, volume=" + volume[2]
											+"\nCylinder 4, volume=" + volume[3]
											+"\nCylinder 5, volume=" + volume[4]);

	}
}
