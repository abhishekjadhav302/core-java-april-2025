package sir_ConstructorQue;

public class AnimalKingdom {
	public AnimalKingdom(String Name) {
		Animal lion = new Animal();
		
		lion.printName(Name);
		
		lion.staticCheck();
		
		System.out.println("This is static call from AnimalKingdom class to Animal variable declaration: " + Animal.animalName);
	}
}
