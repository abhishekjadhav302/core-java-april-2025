package String_topic;

import java.util.Scanner;

public class Check_Authentication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String username = "Abhishek007";
		String password = "Password@123";

		System.out.println("Enter your User Name: ");
		String userName = sc.next();

		System.out.println("Enter your Password: ");
		String passWord = sc.next();

//		if (username == userName && password == passWord) {
//			System.out.println("login Successfull...!");
//		} else {
//			System.out.println("Username and passowrd incorrect...!");
//		}

		if (username.equals(userName)) {

		} else {
			System.out.println("username is incorect");
		}

		if (password.equals(passWord)) {
		} else {
			System.out.println("password is incorect");
		}
	}

}
