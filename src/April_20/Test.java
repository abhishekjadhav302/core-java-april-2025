package April_20;

public class Test {

	public static void main(String[] args) {
		UsernameGenerator generator = new UsernameGenerator();

		String result = generator.getUserName("abhi", "jadhav", 20010);

		System.out.println("Result: " + result);

	}

}
