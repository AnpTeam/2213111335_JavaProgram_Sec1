import java.text.*;
import java.util.*;

public class PensionContributionCalculator {

	public static void main(String[] args) {
		final int SALARY_CEILING=6000;
		final double EMPLOYEE_RATE_55_AND_BELOW=0.2;
		final double EMPLOYER_RATE_55_AND_BELOW=0.17;
		final double EMPLOYEE_RATE_55_AND_60=0.13;
		final double EMPLOYER_RATE_55_AND_60=0.13;
		final double EMPLOYEE_RATE_60_AND_65=0.075;
		final double EMPLOYER_RATE_60_AND_65=0.09;
		final double EMPLOYEE_RATE_65_AND_ABOVE=0.05;
		final double EMPLOYER_RATE_65_AND_ABOVE=0.075;
		int salary,age;
		int contributeSalary=0;
		DecimalFormat f1=new DecimalFormat("####.00");
		double employeeContribution,employerContributetion,totalContribution;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the monthly salary: $");
		salary=scan.nextInt();
		System.out.print("Enter the age: ");
		age=scan.nextInt();
		if(salary>=6000) {
			contributeSalary=SALARY_CEILING;
		}
		else
			contributeSalary=salary;
		if(age<=55) {
			employeeContribution=contributeSalary*EMPLOYEE_RATE_55_AND_BELOW;
			employerContributetion=contributeSalary*EMPLOYER_RATE_55_AND_BELOW;
			System.out.println("The employee's contribution is: $"+f1.format(employeeContribution));
			System.out.println("The employer's contribution is: $"+f1.format(employerContributetion));
			totalContribution=employeeContribution+employerContributetion;
			System.out.print("The total contribution is: $"+f1.format(totalContribution));
			
		}else if (age<=60) {
			employeeContribution=contributeSalary*EMPLOYEE_RATE_55_AND_60;
			employerContributetion=contributeSalary*EMPLOYER_RATE_55_AND_60;
			System.out.println("The employee's contribution is: $"+f1.format(employeeContribution));
			System.out.println("The employer's contribution is: $"+f1.format(employerContributetion));
			totalContribution=employeeContribution+employerContributetion;
			System.out.print("The total contribution is: $"+f1.format(totalContribution));
		}else if (age<=65) {
			employeeContribution=contributeSalary*EMPLOYEE_RATE_60_AND_65;
			employerContributetion=contributeSalary*EMPLOYER_RATE_60_AND_65;
			System.out.println("The employee's contribution is: $"+f1.format(employeeContribution));
			System.out.println("The employer's contribution is: $"+f1.format(employerContributetion));
			totalContribution=employeeContribution+employerContributetion;
			System.out.print("The total contribution is: $"+f1.format(totalContribution));
		}else {
			employeeContribution=contributeSalary*EMPLOYEE_RATE_65_AND_ABOVE;
			employerContributetion=contributeSalary*EMPLOYER_RATE_65_AND_ABOVE;
			System.out.println("The employee's contribution is: $"+f1.format(employeeContribution));
			System.out.println("The employer's contribution is: $"+f1.format(employerContributetion));
			totalContribution=employeeContribution+employerContributetion;
			System.out.print("The total contribution is: $"+f1.format(totalContribution));
		}
	}

}
