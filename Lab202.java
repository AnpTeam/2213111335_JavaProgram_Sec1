import java.util.*;
public class Lab202 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Input the number of minutes: ");
		int time=scan.nextInt();
		int changeTimeInYear=(time/(60*24))/365;
		int changeTimeDay =(time/(60*24))%365;
		System.out.print(time+" minutes is approximately "+changeTimeInYear
						+" years and "+changeTimeDay +" days" );

	}

}
