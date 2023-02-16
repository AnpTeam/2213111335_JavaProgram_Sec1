import java.io.*;
import java.util.*;

public class Example1201 {

	public static void main(String[] agrs) throws IOException {
		// Scanner class for read data
		Scanner read = new Scanner(new File("src/file/MemberLogin.txt"));
		while (read.hasNext()) {
			String fname = read.next(); // read data [1] to firstname.
			String lname = read.next(); // read data [2] to lastname.
			read.next(); // read data [3] to password
			String email = read.next().toUpperCase();
			System.out.println(fname + " (" + email + ")");
		}
		read.close();
	}
}
