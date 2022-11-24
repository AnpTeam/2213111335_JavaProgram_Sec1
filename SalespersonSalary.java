import java.util.*;
import java.text.*;

public class SalespersonSalary {

	public static void main(String[] args) {
		NumberFormat f1=NumberFormat.getCurrencyInstance();
		final double COMMISSION_RATE = 0.15;
		final double SALARY_BASE=1000.0;
		final int SENTINEL = -1;
		int sales; 
		double salary;
		while(true) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter sale in dollars (or -1 to end): ");
		sales=scan.nextInt();
		if(sales==-1) {
			System.out.println("bye");
			break;
		}
		salary=SALARY_BASE+(sales*COMMISSION_RATE);
		System.out.println("Salary is: "+f1.format(salary));
		System.out.println();
		}
		
		

	}

}
