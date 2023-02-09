package Week11;

import javax.swing.*;

public class RectangleDemo_1 {

	public static void main(String[] args) {
		//INPUT DIALOG
		double width = Double.parseDouble(JOptionPane.showInputDialog("Input width :"));
		double length = Double.parseDouble(JOptionPane.showInputDialog("Input length : "));
		String color = JOptionPane.showInputDialog("Input color : ");
		
		//PRAKAD OBJECT
		Rectangle rec = new Rectangle(width, length, color);

		//SADEANGPOL
		JOptionPane.showMessageDialog(null, rec);
		
	}

}
