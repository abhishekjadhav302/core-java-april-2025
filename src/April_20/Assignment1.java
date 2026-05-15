package April_20;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your birth year: ");

		int birth = sc.nextInt();

		int twoDigits = birth % 100;

		System.out.println("Here is your Birth year: " + twoDigits);

		// Taking string as input
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Here is your Name: " + name);

		sc.close();
	}

}
