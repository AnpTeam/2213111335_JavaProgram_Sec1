import java.util.Scanner;

public class Lab607 {

	static String month[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September","October", "November", "December" };
	static int count[] = new int[12];
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		inputBirthDay();
	}
	private static void inputBirthDay() {
		Scanner scan=new Scanner(System.in);
		String birthDate="";
		for(int i=0;i<5;i++) {
			System.out.print("Enter Birth Date "+(i+1)+" : ");
			birthDate=scan.nextLine();
			int bmonth = checkBirthDate(birthDate);
			count[bmonth-1]+=1;
		}
		displayCountBDay();
	}
	private static void displayCountBDay() {
		// TODO Auto-generated method stub
		for(int i=0;i<month.length;i++) {
		System.out.println(month[i] + " ["+count[i]+" people]");
		}
	}
	private static int checkBirthDate(String birthDate) {
		// TODO Auto-generated method stub
		
		return Integer.parseInt(birthDate.substring(3,5));
	}
}
