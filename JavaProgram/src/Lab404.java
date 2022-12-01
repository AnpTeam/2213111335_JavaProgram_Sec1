import java.util.*;

public class Lab404 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Text:");
		String text = scan.nextLine();
		String mixedText[],newtext="";
		int count=0;
		mixedText=text.split(" ");
		for(int i=0;i<mixedText.length;i++) {
			newtext+=mixedText[i].trim();
		}
		//System.out.print(newtext);
		newtext=newtext.toLowerCase();
		for (int i = 0; i < newtext.length(); i++) {
			if(newtext.charAt(i)==
					newtext.charAt(newtext.length()-(i+1)) ){
				count++;
			}
			else
			{
				break;
			}
		}
		//System.out.print(count);
		System.out.print("it is "+((count==0)?"not ":"")+"palindome");
	}

}
