package practiceOOPs;

public class Inherit_Child1 extends Inherit_Parent {

	/*
	 * if in the parent class any constructor has created then first class parent object.
	 * if we use any type of inheritance, we doesn't need to create any parent object, we simply access methods and variables using super keyword.  
	*/
	
	public Inherit_Child1() {
//		super("Rohit");
	}
	
	//method 1: 
	public void testParentClass() {
		System.out.println(super.name);
		System.out.println(super.assignName("\nAbhijeet"));
	}
	
	//method 2:
//	Inherit_Parent parent = new Inherit_Parent("Rohit");
	Inherit_Parent parent = new Inherit_Parent();
	public void testParentClass(int num) {
		System.out.println(super.name);
		System.out.println(super.assignName("\nKunal"));
		
		parent.name = "\nchild assign";
		parent.assignName("\nchild assign value in method");
	}
}
