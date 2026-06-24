package functional_Interface;

@FunctionalInterface
public interface Employee {
	public char getChar(int num);

	public default void checkFunc() {
		System.out.println();
	}
}
