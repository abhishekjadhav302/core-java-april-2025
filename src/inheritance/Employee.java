package inheritance;

public class Employee extends Store {
	String empName;
	int empId;
	double salary;
	
	void workingH() {
		System.out.println("8 hours");
	}
	
	
	
	void closeStore() {
		System.out.println("Store is closed..");
	}
}
