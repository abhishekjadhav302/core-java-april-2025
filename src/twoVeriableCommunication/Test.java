package twoVeriableCommunication;

import sir_ConstructorQue.Animal;

public class Test {
	public static void main(String arg[]) {
		Practice p = new Practice();
		
		System.out.println(p.id);
		
		
//		----------------------
		
		Animal an = new Animal();
//		an.animalName;                                     /* can we access static variable or method in another package?*/
		an.staticCheck();
	}
}
