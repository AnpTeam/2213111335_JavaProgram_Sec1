import java.util.*;
public class Lab402 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence: ");
		String sentence = scan.nextLine();
		while (!(sentence.contains("."))) {
			System.out.print("The sentence must end with full stop point: ");
			sentence = scan.nextLine();
		}
		System.out.println();
		int nextWord=0,i=0;
		while(i<sentence.length()) {
			if (sentence.charAt(i) == ' ') {
				System.out.print(sentence.substring(nextWord,i).trim()+"\n");
				nextWord=i;
			}
			i++;
		}
		if(sentence.endsWith(".")) {
			System.out.print(sentence.substring(nextWord).trim());
		}
	
		}
		

	}


