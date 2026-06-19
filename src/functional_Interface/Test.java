package functional_Interface;

import java.util.function.Predicate;

public class Test {
	public static void main(String[] args) {

		int bottle = 12; // datatype

		Integer i = bottle; // object

		Employee e = (int num) -> (char) num;
		System.out.println(e.getChar(67));
//<> ---- Generic
		Predicate<Integer> isEven = new Predicate<Integer>() {
			public boolean test(Integer num) {
				return num % 2 == 0;

			}
		};
	}
}
