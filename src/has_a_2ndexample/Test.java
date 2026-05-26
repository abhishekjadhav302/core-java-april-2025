package has_a_2ndexample;

public class Test {
	public static void main(String[] args) {
		Employee emp = new Employee();
		AccountDetails acc = new AccountDetails();
		
		//set
		emp.setEmpId(101);
		emp.setName("Ankush");
		emp.setCity("Delhi");

		emp.setAccDetails(acc);
		
		acc.setAccountNo(123456789);
		acc.setBankName("SBI");
		
		//get
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
		System.out.println(emp.getCity());
		System.out.println(emp.getAccDetails().getAccountNo());
		System.out.println(emp.getAccDetails().getBankName());
		
		//Question : if cannot access methods like below i have declare then what is the use case of this functionality?
//		System.out.println(emp.getAccDetails().setAccountNo(12345));
//		System.out.println(emp.getAccDetails().setBankName("dddd"));
	}
}
