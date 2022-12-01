import java.util.*;
public class Example401 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String text="",word="";
		while(true)
		{
			System.out.print("Enter word: ");
			text=scan.next();
			if(text.equalsIgnoreCase("stop")) break;
			word+=text+" ";
		}
		System.out.print(word.toUpperCase());
		
	}
}
