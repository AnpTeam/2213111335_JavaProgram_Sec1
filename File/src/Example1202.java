import java.io.*;
import java.util.Scanner;

public class Example1202 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		System.out.print("Input section : ");
		int section = input.nextInt();
		Header(section);
		showListStudent(section);

	}

	public static void showListStudent(int sec) throws IOException {
		// read file by BufferedReader class
		BufferedReader read = new BufferedReader(new FileReader("src/file/List107.txt"));
		String temp = "";
		while ((temp = read.readLine()) != null) {
			String[] data = temp.split("\t");
			// data that used
			double midtermScore = Double.parseDouble(data[4]);
			double finalScore = Double.parseDouble(data[5]);
			String grade = findResult(midtermScore, finalScore);
			// if check section
			if (Integer.parseInt(data[3]) == sec) {
				System.out.println(data[0] + " " + data[2] + "\t" + midtermScore + "\t" + finalScore + "\t" + grade);
			}
		}
	}

	public static void Header(int sec) {
		System.out.println(
				"********************************************************************************************");
		System.out.println("\t\t\tList of data for Section " + sec);
		System.out.println(
				"********************************************************************************************");
	}

	public static String findResult(double midScore, double finalScore) {
		double totalScore = midScore + finalScore;
		if (totalScore <= 40) {
			return "Fail";
		} else {
			return "Pass";
		}
	}
}
