import java.util.*;

public class StudentScore {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("How many student in classroom : ");
		int size = scan.nextInt();
		Student[] student = new Student[size];

		for (int i = 0; i < size; i++) {
			student[i] = new Student();

			System.out.println();

			System.out.println("INPUT INFORMATION OF STUDENT " + (i + 1));
			System.out.println("-----------------------------------------");

			System.out.print("Input student name : ");
			student[i].setName(scan.next());

			System.out.print("Input student score : ");
			student[i].setScore(scan.nextInt());
			while (!student[i].checkScore()) {
				System.out.print("Input student score, again : ");
				student[i].setScore(scan.nextInt());
			}
		}

		System.out.println();
		System.out.println("LIST OF PASS STUDENT (>=50):");
		System.out.println("-----------------------------------------");

		// Show Score
//		for (Student list : student) {
//			if (list.isPass()) {
//				System.out.println(">> " + list.getName() + "(" + list.getScore() + ")");
//			}

		
		// Show Grade		
		for (Student list : student) {
			if(list.isPass()) {
				System.out.println(">> " + list.getName() + " get grade "+list.findGrade(list.getScore()));
		}
		}
	}

}
