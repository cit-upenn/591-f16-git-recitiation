/**
 * The name class - keeps track of a person's name
 * @author swapneel
 *
 */
public class Name {
<<<<<<< HEAD
	
	private String first;
=======

	private String title;
	private String firstName;
>>>>>>> 0e0ae4582aeacf991f26cb41d4d8b5e99e554b00
	private String middle;
	private String paternal;
	private String maternal;
	private String suffixGenerational;
	private String suffixProfessional;
	private String suffixInAnotherLanguage;;
<<<<<<< HEAD
	private String newEdition; 
=======
	private String newEdition;
>>>>>>> 0e0ae4582aeacf991f26cb41d4d8b5e99e554b00


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

<<<<<<< HEAD
<<<<<<< HEAD
	public String obiWasHere(){
		return null; 
	}
=======

	public int getValue() {
		return null;
	}

	public String getTitle() {
		return title;
=======
>>>>>>> d1e96058f1136a48a8cbc53286ce7e25a185963a
	public String getTitle() {
		return title;
	}

	public int getValue() {
		return null;	
=======
	public String getTitle() {
<<<<<<< HEAD
		return title;
>>>>>>> 0e0ae4582aeacf991f26cb41d4d8b5e99e554b00
=======
		return null;
	}

	public int getValue() {
		return 0;	
>>>>>>> 1aa2cd6068929c805f5a2aa81cb4c38ff214f520
	}
/*
	public int getValue() {
		return null;	
	}
*/
	
	public String getFirst() {
		return null;
	}

	public String getMiddle() {
<<<<<<< HEAD
		return null;
=======
		return middle;
<<<<<<< HEAD
>>>>>>> 0e0ae4582aeacf991f26cb41d4d8b5e99e554b00
=======

>>>>>>> d1e96058f1136a48a8cbc53286ce7e25a185963a
	}

	public String getSurname() {
		return null;
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
<<<<<<< HEAD
	
=======

    public void hello(){
        System.out.println("hello there")
    }

>>>>>>> 0e0ae4582aeacf991f26cb41d4d8b5e99e554b00
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
