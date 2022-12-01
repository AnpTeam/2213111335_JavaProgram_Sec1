import java.util.*;
public class IncomeTax {

	public static void main(String[] args) {
		final double TAX_RATE_ABOVE_20K = 0.1;
		final double TAX_RATE_ABOVE_40K = 0.2;
		final double TAX_RATE_ABOVE_60K = 0.3;
		
		// Declare variables
		int taxableIncome,count;
		double taxPayable;
		Scanner scan=new Scanner(System.in);
		taxableIncome=scan.nextInt();
		// Compute tax payable in "double" using a nested-if to handle 4 cases
		while(true)
		{
			count=taxableIncome/20000;
			for(int i=1;i<=count;i++)
			{
				if(i==1) taxPayable=(20000*i)*0;
				if(i==2)
			} 
		}
	}

}
