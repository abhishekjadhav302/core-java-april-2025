package inheritance;

public class Test {
	public static void main(String[] args) {
//		Owner o = new Owner();
		Owner o = new Owner();
		Manager own = new Owner();

		own.createMeet();

	}
}
