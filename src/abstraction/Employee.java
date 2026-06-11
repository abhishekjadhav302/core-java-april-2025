package abstraction;

public abstract class Employee {
	int a;
	
	String str;
	
	
/*
	public Employee(int a, String str) {
		this.a = a;
		this.str = str;
		public void printVoid() {
			System.out.println("check abstraction in test class");
		}
		
		public int testInt(int a) {
			System.out.println("number in test a: "  + a);
			return 4444;
		}
	}
 */
	
	public void check() {
		
		System.out.println("Abstaction check in employee");
	}
	
	public int checkInt(String name) {
		System.out.println("name" + name);
		return 0;
	}

//	protected abstract void checkBoolean(int i);
}
