package abstraction;

public class Test {

	public static void main(String[] args) {
		
		Developer dev = new Developer();
		dev.checkBoolean(7);
		
//--------------------------------------------
		
		Employee emp1;
		
		emp1 = new Developer();
		emp1.a = 101;
		emp1.check();
//		emp1.check(101);
//		emp1.checkBoolean(10001);
		
//----------------------------------------------------------------
		
		emp1 = new HR();
		emp1.check();
//		emp1.b = 102;
//		emp1.checkString(999);
		
		
		
//--------------------------------------------------------------
		
//		Employee emp = new Employee(8888, "Abstaction in constructor");
/*
		Employee emp = new Employee() {
			public void printVoid() {
				System.out.println("check abstraction in test class");
			}
			
			public int testInt(int a) {
				System.out.println("number in test a: "  + a);
				return 4444;
			}
		};
*/
	}

}
