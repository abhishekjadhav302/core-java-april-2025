package inheritance;

public class Owner extends Manager{
	String name;
	
	void storeOwner() {
		System.out.println("I am the owner..");
	}
	void createMeet() {
		System.out.println("todays meet at 12am..");
	}

}
