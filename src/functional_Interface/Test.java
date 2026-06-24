package functional_Interface;

import java.util.function.Predicate;

public class Test {
	public static void main(String[] args) {

		// with lambda function

//		Developer d = () -> System.out.println("lambda expresion");
		Worker dev = new Worker() {

			@Override
			public char getChar(int num) {
				// TODO Auto-generated method stub
				return 0;
			}
		};

		dev.checkPrint();

		// without lambda function
		/*
		 * Developer d = new Developer() {
		 * 
		 * @Override public char getChar(int num) { // TODO Auto-generated method stub
		 * return 0; }
		 * 
		 * @Override public void projects() { // TODO Auto-generated method stub
		 * 
		 * } };
		 * 
		 * d.projects();
		 */
		dev.projects();
//=============================================
		int bottle = 12; // datatype

		Integer i = bottle; // object

		Employee e = (int num) -> (char) num;
		System.out.println(e.getChar(67));
//<> ---- Generic
		Predicate<Integer> isEven = num -> {
			return num % 2 == 0;
		};
	}

}
