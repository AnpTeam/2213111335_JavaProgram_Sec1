package Week9.Person;

public class PersonalInfo {
	private Person name;
	private Date bDay;
	private int personID;

	// CONSTRUTOR
	public PersonalInfo() {
		name = new Person();
		bDay = new Date();
		personID = 0;
	}

	public PersonalInfo(String first, String last, int month, int day, int year, int ID) {
		// OJNAMAE
		name = new Person(first, last);
		// OJDETO
		bDay = new Date(month, day, year);
		// ID
		personID = ID;
	}

	public void setPersonalInfo(String first, String last, int month, int day, int year, int ID) {
		name.setName(first, last);
		bDay.setDate(month, day, year);
		personID = ID;
	}

	public String toString() {
		return "Name:" + name.toString() 
		+ "\n" + "Date of birth : " + bDay.toString() 
		+ "\n" + "PersonalID :" + personID;
	}
}
