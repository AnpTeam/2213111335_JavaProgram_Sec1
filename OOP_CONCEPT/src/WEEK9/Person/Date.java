package Week9.Person;

public class Date {

	private int dMonth;
	private int dDay;
	private int dYear;

	// CONSTRUCTOR
	public Date() {
		dMonth = 1;
		dDay = 1;
		dYear = 1900;
	}

	public Date(int month, int day, int year) {
		dMonth = month;
		dDay = day;
		dYear = year;
	}

	public void setDate(int month, int day, int year) {
		dMonth = month;
		dDay = day;
		dYear = year;
	}

	public int getMonth() {
		return dMonth;
	}

	public int getDay() {
		return dDay;
	}

	public int getYear() {
		return dYear;
	}

	public String toString() {
		return String.format("%02d-%02d-%d", dMonth, dDay, dYear);
	}

}
