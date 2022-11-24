import java.util.*;
import javax.swing.*;
import java.text.*;
public class Lab303 {

	public static void main(String[] args) {
		DecimalFormat frm=new DecimalFormat("###,###");
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		int withDraw=Integer.parseInt(JOptionPane.showInputDialog("Your balance: "+frm.format(balance)
					+"\nInput money to withdraw: "));
		if(withDraw>balance) {
			JOptionPane.showMessageDialog(null, " Error:Cannot withdraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(withDraw>20000) {
			JOptionPane.showMessageDialog(null, " Error:Cannot withdraw more than 20,000","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(withDraw%100 !=0) {
			JOptionPane.showMessageDialog(null, " Error:Cannot withdraw "+withDraw+" baht.","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		int thousandBaht=withDraw/1000;
		int fiveHundredBaht=(withDraw%1000)/500;
		int oneHundredBaht =((withDraw%1000)%500)/100;
		JOptionPane.showMessageDialog(null, "You withdraw "+frm.format(withDraw)+" baht."
										+"\n1,000 = "+thousandBaht+"\n500 = "+fiveHundredBaht+"\n100 = "+oneHundredBaht);
		
	}

}
