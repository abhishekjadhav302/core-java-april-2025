package abtraction_interface_practice;

public class FourWeler_abtraction extends CarCompany_abstraction {

	// here, in this class only abstract methods of the parent class forcefully override !
	void subBrand_Jaguar() {
		System.out.println("Pushpa ka brand hai");
	}
	protected void subBrand_RangRover() {
		System.out.println("I am the Brand...");
	}


}
