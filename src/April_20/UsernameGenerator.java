package April_20;

import java.util.Scanner;

public class UsernameGenerator {
	public String getUserName(String fname, String lname, int yob) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your fname: ");
		fname = sc.next();

		System.out.println("Enter your lname: ");
		lname = sc.next();

		System.out.println("Enter your year of birth: ");
		yob = sc.nextInt();
		
		sc.close();
		
		int twoDigits = yob % 100;

		String res = fname + lname + twoDigits;

		return res;

	}
}
