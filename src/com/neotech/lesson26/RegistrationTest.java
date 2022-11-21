package com.neotech.lesson26;

public class RegistrationTest {

	public static void main(String[] args) {
		
		Registration user1 = new Registration();
		
		user1.setEmail("harun@yahoo.com");
		user1.setUserName("harunbicakci");
		user1.setPassword("harunbicakci123");
		
		user1.getEmail();
		user1.getUserName();
		user1.getPassword();
		
		user1.setPassword("random123");
		user1.getPassword();
	}
}
