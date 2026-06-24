package functional_Interface;

@FunctionalInterface
public interface Developer extends Employee {
	public default void projects() {
		System.out.println("print projects");
	}

	public default void checkPrint() {
		System.out.println("check");
	}

}
