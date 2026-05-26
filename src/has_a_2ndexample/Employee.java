package has_a_2ndexample;

public class Employee {
	private int empId;
	private String name;
	private String city;
	
	
	//similar to inheritance
	private AccountDetails details;
	
	
	public void setEmpId(int empId) {
		this.empId = empId;		
	}
	public int getEmpId() {
		return empId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	
	
	public void setAccDetails(AccountDetails details) {
		this.details = details;
	}
	public AccountDetails getAccDetails() {
		return details;
	}
	
}
