package studentData;

public class Person {
	private String firstname;
	private String lastname;
	private String domisili;
	
	public Person() {
		
	}

	public Person(String firstname, String lastname, String domisili) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.domisili = domisili;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDomisili() {
		return domisili;
	}

	public void setDomisili(String domisili) {
		this.domisili = domisili;
	}
	
}
