import java.util.*;

public class Lab601 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] number = new int[7];
		int count = 0;
		for (int i = 0; i < number.length; i++) {
			System.out.print("Enter a number :");
			number[i] = scan.nextInt();
		}
		countNumber(number, count);
		display(number, count);

	}// end main

	public static int countNumber(int[] num, int count) {
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 != 0) {
				count++;
			}

		}
		return count;
	}

	public static void display(int[] number, int count) {
		System.out.print("\nThere are " + count + " of Odd number" + "\nList of number:");
		for (int num : number) {
			if (num % 2 != 0) {
				System.out.print(num + " ");
			}
		}
	}
}
