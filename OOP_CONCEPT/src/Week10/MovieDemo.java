package Week10;
import java.util.*;

public class MovieDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//INPUT
		System.out.print("Input movie id    : ");
		String id = scan.nextLine();
		System.out.print("Input movie  name :");
		String name = scan.nextLine();
		
		System.out.println();
		
		System.out.print("Input director name    : ");
		String directorName = scan.nextLine();
		System.out.print("Input director email   :");
		String email = scan.nextLine();
		
		System.out.print("Input director gender  : ");
		String gender =scan.next();
		
		while(!(gender.equalsIgnoreCase("m") ||gender.equalsIgnoreCase("f"))) {
			System.out.print("Input director gender, again  : ");
			gender =scan.next();
		}

		System.out.println();
		
		System.out.print("Input movie theater no.  : ");
		int theaterNo=scan.nextInt();
		while(theaterNo <= 0 || theaterNo >= 16) {
			System.out.print("Please input 1 - 15 only  : ");
			theaterNo = scan.nextInt();
		}
		
		Theater th = new Theater(id,name,new Director(directorName,email,gender.charAt(0)),theaterNo);
		
		System.out.println();
		
		System.out.println(th);
		
	}

}
