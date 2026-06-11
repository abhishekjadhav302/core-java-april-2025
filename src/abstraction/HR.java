package abstraction;

public class HR extends Employee{
	public void check() {
		System.out.println("abstraction in HR ");
	}
	
	int b;
	 
	public String checkString(int num) {
		System.out.println("number: " + num);
		return "learning";
	}
}
