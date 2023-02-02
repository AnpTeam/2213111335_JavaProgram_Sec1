package Week10;

public class Director {
	private String name;
	private String email;
	private char gender;

	Director(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	Director(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public String getGenderName() {
		return ((gender == 'm' || gender == 'M') ? "Male" : (gender == 'f' || gender == 'F') ? "Female" : "");
	}

	public String toString() {
		return getName() + "(" + getEmail() + ";" + getGenderName() + ")";
	}
}
