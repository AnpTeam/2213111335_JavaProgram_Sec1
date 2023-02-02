package Week10;
import javax.swing.*;

public class Shop100Baht {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Product sold = new Product();
//		sold.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input numbers of product:")));
//		JOptionPane.showMessageDialog(null, sold);
		
		
		//TON2
		Product sold = new Product();
		int choice = JOptionPane.showConfirmDialog(null, "Is the program run on pattanakarn branch ?","Run Program", JOptionPane.YES_NO_OPTION);
		if(choice == 0) {
			sold = new  PattanakarnBranch();
			
		}	
		sold.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input numbers of product:")));
		JOptionPane.showMessageDialog(null, sold);
		
	}

}
