import java.util.*;

public class Lab505 {

	public static void main(String[] args) {
		inputStudent();
	}

	public static void inputStudent() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter student ID: ");
		String ID = scan.nextLine();
		System.out.print("Enter Subject ID:");
		String subjectID = scan.nextLine();
		while (!(isLength(ID, subjectID))) {
			System.out.print("Enter student ID: ");
			ID = scan.nextLine();
			System.out.print("Enter Subject ID: ");
			subjectID = scan.nextLine();
		}
		isITStudent(ID);
		isITSubject(subjectID);
		displayData(ID, subjectID);
	}

	static boolean isLength(String id, String subjectID) {
		if (id.length() != 10 || subjectID.length() != 7) {
			return false;
		} else
			return true;
	}

	static boolean isITStudent(String id) {
		if (id.substring(2, 6).contentEquals("1311"))
			return true ;
		return false;
	}


	static boolean isITSubject(String subID) {
		if ((subID.substring(0, 2).contentEquals("21"))&&(subID.charAt(4)=='1')) 
			return true;
		else return false;
	}

	static void displayData(String id, String subID) {
		System.out.println();
		System.out.print("Student id:" + id + (isITStudent(id) ? " " : " is not ") + "1st year student in IT");
		System.out.print("\n" + ((isITStudent(id) && isITSubject(subID)) ? "and " : (isITSubject(subID) ? "" : "not ")));
			System.out.print("Enroll in course for Year 1");
		}
	}

