package Week9.Student;

public class testStudent {

	public static void main(String[] args) {
		//TEST CONSTRUCTOR
		student anupap = new student("Anupap P.","1 Happy Ave" );
		System.out.println(anupap); // toSring()
		
		//TEST SETTER AND GETTER
		anupap.setAddress("25 Pattanakarn");
		System.out.println(anupap);
		
		System.out.println(anupap.getName());
		System.out.println(anupap.getAddress());
		
		//TEST ADD COURSE,PRINT GRADE,GET AVG METHOD
		anupap.addCourseGrade("INT-108",87);
		anupap.addCourseGrade("INT-108",81);
		anupap.addCourseGrade("MSC-201",92);
		
		anupap.printGrades();
		
		System.out.printf("\nThe average is %.2f",anupap.getAverageGrade());
	}

}
