package mainMethod_overloading;

public class Test {
	public static void main(String[] args) {
		MainClass mc = new MainClass();
		
		mc.main(12);
		mc.main("Overloading main() checking", 6339);
		
		/* in polymorphism -1. method name should be same.
		 * 					2. parameter should be different.
		 * 					3. return type should be same.
		 * 					4. if return type is not same then they cannot say polymorphism.
		 * 
		 * in overloading / compile time polymorphisum:
		 *	1.main() can be overload.
		 *	2.we create hybrid object.
		 *	3.in hybrid objects - 3.1.first check and access only methods in child class 
		 *							3.2. parent class access their variable and methods also
		 *	4.Static methods also can be overload.
		*/
		
	}
	
}
