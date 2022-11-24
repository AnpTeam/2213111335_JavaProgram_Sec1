import javax.swing.*;
import java.text.*;

public class Lab301 {
	static final int pricePerson = 299;

	public static void main(String[] args) {
		DecimalFormat frm=new DecimalFormat("#,###.00");
		int numberPerson = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bills?"));
		double totalPrice = pricePerson * numberPerson;
		int memberCard;
		do {
			memberCard = JOptionPane.showConfirmDialog(null,
					"Total price is" + totalPrice + "baht.\nDo you have a member card ?");

		} while (memberCard == 2);
		double discount;
		if (memberCard == 0) {
			discount = totalPrice * 90 / 100;
			JOptionPane.showMessageDialog(null, "Amount to be paid is" + frm.format((int)discount) + "Baht.");
		} else if (memberCard == 1) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(totalPrice) + "Baht.");
		}

	}

}
