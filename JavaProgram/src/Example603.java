import java.util.*;

public class Example603 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.print("Enter the number " + (i + 1) + ":");
			num[i] = scan.nextInt();
		}
		int sumOfNumber=sumofPos(num);
		System.out.print("\nsum is "+sumOfNumber);
	}
	public static int sumofPos(int[] _num) {
		int sum=0;
		for(int num:_num) {
			if(num>0) {
				sum+=num;
			}
		}
		return sum;
	}

}
