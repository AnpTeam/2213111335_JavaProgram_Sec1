import java.util.*;
public class Lab504 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space.\n:");
		String fullname=scan.nextLine();		
		System.out.println();
		System.out.print(abbreviatName(fullname));
	}
	static String abbreviatName(String fullname) {
		String[] split=fullname.split(" ");
		 return split[1].toUpperCase().charAt(0)+"."
		+split[2].toUpperCase().charAt(0)+"."+split[0];
	}

}
