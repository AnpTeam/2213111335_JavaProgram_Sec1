import java.util.*;
import javax.swing.*;

public class Example_403 {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		System.out.print("Input a message sentence: ");
		String sentence = scan.nextLine();
		while (!(sentence.endsWith("."))) {
			System.out.print("Input a message sentence, again: ");
			sentence = scan.nextLine();
		}
		System.out.println();
		int countOfSpace = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == ' ') {
				countOfSpace++;
			}
		}
		System.out.print("This sentence has " + countOfSpace + " spacebar.");
		System.out.print("This sentence has " + (countOfSpace+1) + " word.");
		*/
		
		String message=JOptionPane.showInputDialog("Enter the sentence: ");
		while (!(message.endsWith("."))) {
			message=JOptionPane.showInputDialog("Enter the sentence,again: ");
		int count=0;
		for (int i = 0; i < message.length(); i++) {
			if (message.charAt(i) == ' ') {
				count++;
			}
		}
		JOptionPane.showMessageDialog(null,"This sentence has"+count +" spacebar."
											+"\nThis sentence has "+(count+1)+"words.");
	}
	

}
}
