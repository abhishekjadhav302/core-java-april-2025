package practiceOOPs;

public class Inherit_Parent {
	String name;
	
//	public Inherit_Parent(String name) {
//		this.name = name;
//		checkScope();
//		//constructor doesn't print any statement
//		System.out.println("Here " + name);
//	}


	private void checkScope() {
		System.out.println("\nThis is private method and called in constructor of this class");
	}
	
	public String assignName(String name) {
		checkScope();
		this.name = name;
		return name;
	}
}
