package Week9.Student;

public class student {
	// attribute
	private String name;
	private String address;
	// The course and grade keep in same index.
	private String[] courses;
	private int[] grades; // 0-100
	private int numCourse; // number of courses
	private static final int MAX_COURSE = 30; // MAX NUMBER OF COURSE

	// constructor
	public student(String name, String address) {
		this.name = name;
		this.address = address;
		courses = new String[MAX_COURSE];
		grades = new int[MAX_COURSE];
		numCourse = 0;
	}

	// GETTER AND SETTER
	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return name + " (" + address + ")";
	}

	// ADD COURSE AND GRADE
	public void addCourseGrade(String course, int grade) {
		courses[numCourse] = course;
		grades[numCourse] = grade;

		++numCourse;
	}

	// PRINT GRADE
	public void printGrades() {
		System.out.print(name);
		for (int i = 0; i < numCourse; i++) {
			System.out.print(" " + courses[i] + ":" + grades[i]);
		}
		System.out.println();
	}
	
	public double getAverageGrade() {
		int sum = 0;
		for(int i = 0 ; i < numCourse ; i++) {
			sum+=grades[i];
		}
		return (double)sum/numCourse;
	}

}
