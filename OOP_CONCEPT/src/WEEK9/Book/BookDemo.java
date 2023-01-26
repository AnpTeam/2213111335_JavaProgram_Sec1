package Week9.Book;

import java.util.*;

public class BookDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input author name  : ");
		String name = scan.nextLine();
		System.out.print("Input author email : ");
		String email = scan.next();
		
		//OJ AUTHOR
		Author worapat =new Author(name,email);
		System.out.println(worapat);
		
		System.out.print("Input book title  : ");
		scan.nextLine();
		String title = scan.nextLine();
		
		System.out.print("Input book page :");
		int page = scan.nextInt();
		
		Book book = new Book(title,worapat,page);
		System.out.println(book);
		
	}

}
