import javax.swing.*;
public class Example_402 {

	public static void main(String[] args) {
		String email=JOptionPane.showInputDialog("Input your email : ");
		while(email.startsWith("@")||email.contains(" ")) {
			email=JOptionPane.showInputDialog("Input your email : ");
			
		}
		email=email.toLowerCase();
		
		/*if(email.endsWith("@gmail.com")||email.endsWith("@hotmail.com")) {
			JOptionPane.showMessageDialog(null, "Your email is "+email);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your email is not hotmail or gmail dot com");
		}
		*/
		boolean check=email.endsWith("@gmail.com")||email.endsWith("@hotmail.com");
		JOptionPane.showMessageDialog(null,(check)? "Your email is "+email:"Your email is not hotmail or gmail dot com");
	}

}
