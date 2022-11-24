import java.util.*;
import java.text.*;

public class Lab203 {

	public static void main(String[] args) {
		int i=10,count=1;
		DecimalFormat f1=new DecimalFormat("#,###");
		Scanner scan =new Scanner(System.in);
		System.out.println("Input two Integers(a b): ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int summary=num1+num2;
		while(true)
		{
			if(summary/i>=1)
			{
				i*=10;
				count++;
				
			}
			if(summary/i==0) break;
		}
		System.out.println("Sum of two Integers : "+f1.format(summary));
		System.out.println("Digit number of sum of said two intergers: \n"+count);
	}

}
