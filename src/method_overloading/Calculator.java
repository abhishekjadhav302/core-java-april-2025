package method_overloading;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Operations ops = new Operations();

		while (true) {
			System.out.println("\nSelect your operation(+, -, *, /): ");
			String symbol = sc.next();

			System.out.println("\nEnter number between 2 to 5: ");
			int num = sc.nextInt();

//		int[] value = new int[num];
			int[] value;

			if (num >= 2 && num <= 5) {
				value = new int[num];
			} else {
				System.out.println("\nEnter number range between 2 to 5...!");
				return;
			}

			for (int i = 0; i < num; i++) {
				System.out.println("\nEnter your " + (i + 1) + " in " + num + " numbers one by one: ");
				value[i] = sc.nextInt();
			}

//		for (int val : value) {
//			System.out.println(val);
//		}

			switch (symbol) {
			case "+": {
				System.out.println("\naddition");

				if (value.length == 2) {
					ops.sum(value[0], value[1]);
				} else if (value.length == 3) {
					ops.sum(value[0], value[1], value[2]);
				} else if (value.length == 4) {
					ops.sum(value[0], value[1], value[2], value[3]);
				} else if (value.length == 5) {
					ops.sum(value[0], value[1], value[2], value[3], value[4]);
				}

				break;
			}

			case "-": {
				System.out.println("\nsubtraction");
				if (value.length == 2) {
					ops.sub(value[0], value[1]);
				} else if (value.length == 3) {
					ops.sub(value[0], value[1], value[2]);
				} else if (value.length == 4) {
					ops.sub(value[0], value[1], value[2], value[3]);
				} else if (value.length == 5) {
					ops.sub(value[0], value[1], value[2], value[3], value[4]);
				}
				break;
			}
			case "*": {
				System.out.println("\nmultiplication");
				if (value.length == 2) {
					ops.mul(value[0], value[1]);
				} else if (value.length == 3) {
					ops.mul(value[0], value[1], value[2]);
				} else if (value.length == 4) {
					ops.mul(value[0], value[1], value[2], value[3]);
				} else if (value.length == 5) {
					ops.mul(value[0], value[1], value[2], value[3], value[4]);
				}
				break;
			}
			case "/": {
				System.out.println("\ndivision");
				if (value.length == 2) {
					ops.div(value[0], value[1]);
				} else if (value.length == 3) {
					ops.div(value[0], value[1], value[2]);
				} else if (value.length == 4) {
					ops.div(value[0], value[1], value[2], value[3]);
				} else if (value.length == 5) {
					ops.div(value[0], value[1], value[2], value[3], value[4]);
				}
				break;
			}

			default: {
				System.out.println("\nPlease select valid operation..!");
			}
			}
		}
	}
}
