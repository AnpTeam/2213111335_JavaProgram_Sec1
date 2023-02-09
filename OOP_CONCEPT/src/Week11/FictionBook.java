package Week11;

public class FictionBook implements Author, Book {

	// parameter attribute
	private String author_name;
	private String email;
	private String title;
	public int publicYear;

	public FictionBook(String title, int publicYear) {
		this.title = title;
		this.publicYear = publicYear;
	}

	public void setAuthorName(String name) {
		author_name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getLastName() {
		return author_name.substring(0,author_name.charAt(' '));
	}

	@Override
	public String getFirstName() {
		return author_name.substring(author_name.charAt(' '));
	}

	@Override
	public boolean checkEmail() {
		if (this.email.endsWith("@hotmail.com") || this.email.endsWith("@windowslive.com")) {
			return true;
		}
		return false;
	}

	public boolean checkFormatName() {
		if (author_name.equals(getFirstName() + " " + getLastName())) {
			return true;
		}
		return false;
	}

	public String toString() {
		return this.title + "write by " + getLastName().charAt(0) + "." + getFirstName() + " (" + this.email + ")"
				+ "\nPublished for " + totalPublicYear() + "years.";
	}

	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public int totalPublicYear() {
		// TODO Auto-generated method stub
		return 2023 - this.publicYear;
	}

}
