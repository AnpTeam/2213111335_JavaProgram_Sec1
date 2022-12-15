import javax.swing.*;

public class Lab605 {

	public static void main(String[] args) {
		int[] number = new int[5];
		for (int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number " + (i + 1) + " : "));
		}
		showEven(number);
		showOdd(number);

	}

	private static void showEven(int[] number) {
		String ListOfEven="";
		for(int num:number) {
			if(num%2==0) {
				ListOfEven+=num+" ";
			}
		}
			
		JOptionPane.showMessageDialog(null, "List of Even number : \n"+ListOfEven);
	}

	private static void showOdd(int[] number) {
		String ListOfOdd="";
		for(int num:number) {
			if(num%2!=0) {
				ListOfOdd+=num+" ";
			}
		}
			
		JOptionPane.showMessageDialog(null, "List of Odd number : \n"+ListOfOdd);
	}
}
