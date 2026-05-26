package has_a_relationship;

public class Student {
	private int rollno;
	private String firstName;
	private String lastName;
	private String city;
	
	private Document doc;
	
	//rollno
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getRollno() {
		return rollno;
	}
	
	//first name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return firstName;	
	}
	
	// last name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
		return lastName;
	}
	
	// city
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	
	// doc
	public void setDoc(Document doc) {
		this.doc = doc;
	}
	public Document getDoc() {
		return doc;
	}
}
