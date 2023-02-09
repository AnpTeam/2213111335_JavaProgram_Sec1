package Week11;
import java.util.*;

public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input title : ");
		String title =scan.nextLine();
		
		System.out.print("Input Public years : ");
		int publicYears = scan.nextInt();
		
		FictionBook book = new FictionBook(title,publicYears);
		
		System.out.print("Input author name : ");
		String name =scan.nextLine();
		scan.next();
		System.out.print("Input email : ");
		String email =scan.nextLine();
		
		while(!book.checkFormatName()) {
			System.out.print("Input author name : ");
			name =scan.nextLine();
		}
		while(!book.checkEmail()) {
			System.out.print("Input email : ");
			email =scan.nextLine();
		}
		
		book.setAuthorName(name);
		book.setEmail(email);
		
		System.out.println(book);

	}

}
