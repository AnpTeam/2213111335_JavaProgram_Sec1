import java.util.*;

public class Lab603 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] number= {78, 36, 58, 41, 25, 92 , 75};
		int indexOfArray;
		do {
			System.out.print("Input Index array:");
			indexOfArray = scan.nextInt();
			
		}while(indexOfArray<0 || indexOfArray >(number.length-1));
		System.out.println();
		System.out.println("Value in current index is "+number[indexOfArray]);
		if(indexOfArray == number.length-1) {
			System.out.print("Sorry "+indexOfArray+" is the last index na ja ");
		}
		else {
			System.out.print("Value in current index is "+number[indexOfArray+1]);
		}

	}

}
