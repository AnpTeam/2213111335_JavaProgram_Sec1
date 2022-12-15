import javax.swing.*;

public class Example602_2 {

	public static void main(String[] args) {
		String[] deptName = {"Accounting","HR","Sales","Innovation"};
		boolean deptFound=false;
		
		String dept=JOptionPane.showInputDialog("Enter a department name");
		for(String _deptName:deptName) {
			if(dept.equalsIgnoreCase(_deptName)) {
				deptFound=true;
			}
		}
		JOptionPane.showMessageDialog(null, (deptFound)? 
											dept+" was found in the list" 
											: 
											dept+" was not found in the list");
		
		
		
		
	}

}
