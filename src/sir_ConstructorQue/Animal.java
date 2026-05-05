package sir_ConstructorQue;

public class Animal {
	
	static String animalName = "tiger";
	
	public void staticCheck() {
		System.out.println("Animal class -> staticCheck() -> syso: " + animalName);
	}

	
	public void printName(String name) {
//		System.out.println("LION");
		System.out.println("Constructor Name print: " + name);
		
		System.out.println("Animal Name is : " + animalName);
	}
}
/*1. Create a class -> Animal.java -> create a void method in it as printName() -> syso ("LION").
2. create a class -> AnimalKingdom.java -> create a constructor -> in constructor create a object of animal class and call printName() method.
3. create Test.java -> and create a object of AnimalKingdom class.

Target understanding -> Test class will trigger constructor of AnimalKingdom.java and then constructor will trigger method of Animal.java


---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
After this, create a logic such that, animal name will be passed thought object created in Test.java -> name will be passed to parametrised constructor in AnimalKingdom.java -> this name will be passed to printName() method in Animal.java (make printName() parameterised) -> then finally name will  be printed in printName() method.

Target understanding -> name should be passed from Test class and printed in Animal.java with considering above logic. */
 