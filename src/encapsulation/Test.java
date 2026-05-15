package encapsulation;

import encapsulation.Instagram;

public class Test {
	public static void main(String[] args) {
		
		Instagram insta = new Instagram();
		
		//========== object =========
		
		insta.setUsername("Abhi007");
		
		String username = insta.getUsername();
		
		System.out.println("Username: " + username + "\n");
		
		//=============== set =================
		
		insta.setPassword("Abhi@123");
		
		String password = insta.getPassword();
		
		System.out.println("Password: " + password);
	}
}
