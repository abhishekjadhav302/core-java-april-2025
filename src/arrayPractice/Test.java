package arrayPractice;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array length: ");
		int value = sc.nextInt();
		
		Smart s = new Smart(value);
		

		
		for(int i = 0; i < s.arr.length; i++) {
			System.out.println("Enter value one by one: ");
			int data = sc.nextInt();
			s.arr[i] = data;
		}
		
		s.printArr(50000);
	}

}
