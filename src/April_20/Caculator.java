package April_20;

import java.util.Scanner;

public class Caculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();

		System.out.println("Enter secound number: ");
		int num2 = sc.nextInt();

		int sum = num1 + num2;
		System.out.println("Sum: " + sum);

		int sub = num1 - num2;
		System.out.println("Substraction: " + sub);

		int multi = num1 * num2;
		System.out.println("Multiplication: " + multi);

		int division = num1 / num2;
		System.out.println("Divistion: " + division);

		int modulous = num1 % num2;
		System.out.println("Modulous: " + modulous);

		sc.close();
	}

}
