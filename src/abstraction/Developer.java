package abstraction;

public class Developer extends Employee {

	int a;

/*
	public Developer(int num, String org) {
		super(num, org);
	}
*/
	
//	public void check() {
//		System.out.println("check abstraction in developer");
//		System.out.println("a in developer: " + a);
//	}
	
//--------------------------------------------------
	public void check(int a) {
		System.out.println("check abstraction in developer");
		System.out.println("a in developer: " + a);
	}

	public boolean checkBoolean(int num) {

		System.out.println("number in developer: " + num);
		System.out.println("a in developer: " + a);
		return true;
	}
	
	public static void m1() {
		System.out.println("this is static method");
	}
}
