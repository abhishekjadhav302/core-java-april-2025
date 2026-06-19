package abtraction_interface_practice;

abstract class CarCompany_abstraction {
	
//	public CarCompany_abstraction() {
//		System.out.println("this is constructor..");
//	}

	int wheelsCount;
	
	 
	
	private static String dangerous= "Roll Royse";

	protected String engine = "v8";
	
	static String check = "this is static variable";

	private static String vehicalType(String vehicalName) {
		if ("Harrier".equals(vehicalName)) {
			return "300 Harrier in One Year...";
		} else if ("Altroz".equals(vehicalName)) {
			return "450 Altroz in one year,,,";
		} else {
			return "Management has not desided... " + dangerous;
		}

	}
	
	String getDangerous(String vehicalName) {
		System.out.println(dangerous);
		String store = CarCompany_abstraction.vehicalType(vehicalName);
		return store;
	}
	
	abstract void subBrand_Jaguar();
	
	abstract protected void subBrand_RangRover();
}
