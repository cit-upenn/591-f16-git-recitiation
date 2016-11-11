/**
 * The name class - keeps track of a person's name
 * @author swapneel
 *
 */
public class Name {
	
	private String title;
	private String first;
	private String middle;
	private String paternal;
	private String maternal;
	private String suffixGenerational;
	private String suffixProfessional;
	private String suffixInAnotherLanguage;;

	public Name(String title, String first, String middle, String surname, String paternal, String maternal,
			String generational, String professional) {
		this.title = title;
		this.first = first;
		this.middle = middle;
		this.surname = surname;
		this.paternal = paternal;
		this.maternal = maternal;
		suffixGenerational = generational;
		suffixProfessional = professional
	}

	public String getTitle() {
		return title;
	}
/*
	public int getValue() {
		return null;	
	}
*/
	
	public String getFirst() {
		return first;
	}

	public String getMiddle() {
		return middle;
	}

	public String getSurname() {
		return surname;
	}

	public String getPaternal() {
		return paternal;
	}

	public String getMaternal() {
		return maternal;
	}

	public String getSuffixProfessional() {
		return suffixProfessional;
	}

	public String getSuffixGenerational() {
		return suffixGenerational;
	}

	public String getNameAllCaps() {
		return allCaps;
	}
	
	/*
	 * Return a string that combines the first middle and last names.
	 * e.g., Jim Paper Halpert
	 */
	public String concatFirstMiddleLast() {
		first.
	}
		return ;
	}
	
	/*
	 * Come up with your own meaningful string representation of this Name.
	 */
	@Override
	public String toString() {
		return null;
	}
	
	/*
	 * Checks whether first name matches any of your TAs' first name.
	 */
	public boolean matchesTAsFirstName() {
		return false; 
	}
	
	/*
	 * Checks if input string matches first name
	 */
	public boolean matchesFirstName(String s) {
		return false;
	}
	
	/*
	 * Checks whether the two surnames match
	 */
	public boolean isRelativeOf(Name name) {
		return false;
	}
	
	/*
	 * Checks if it Friday
	 */
	public boolean isFriday(String day){
		return false;
	}