import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String fullname="",firstname="",lastname="";
		System.out.print("Full name: ");
		fullname=scan.nextLine();
		int space=fullname.indexOf(' ');
		if(space==-1) {
			System.out.print("Incorrect Name");
		}
		else {
		firstname=fullname.substring(0, space);
		lastname=fullname.substring((space+1));
		System.out.print("Fisrtname: "+firstname.toUpperCase()+
						"\nLastname: "+lastname.toLowerCase());
		}

	}

}
