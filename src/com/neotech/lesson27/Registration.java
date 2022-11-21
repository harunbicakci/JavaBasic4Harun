package com.neotech.lesson27;

public class Registration {

//  Create Registration Class in which you would have
//  variables as email, userName and password that
//  have an access scope only within its own class.
//  After creating an object of the class user should be
//  able to call methods and in each method separately
//  pass values to set users email, username and
//  password.
//
//  Requirements:
//  Valid email considered to be only yahoo!
//  Valid userName and password cannot be empty 
//  and should be of length larger than 6 characters.
//  Also valid password cannot contain userName.

	private String email;
	private String password;
	private String userName;

	// getter for email
	public String getEmail() {
		return email;
	}

	// setter for email
	public void setEmail(String email) {
		if (email.endsWith("yahoo.com")) {
			this.email = email;
		} else {
			System.out.println("Please use yahoo account only!");
		}
	}

	public String getPassword() {
		return password;
	}

	// setter for password
	public void setPassword(String password) {
		if (!password.isEmpty()) {
			if (password.length() > 6) {
				if (!password.contains(userName)) {
					this.password = password;
				} else {
					System.out.println("Password should not contain username!");
				}
			} else {
				System.out.println("Password can not be less than 6 chars!");
			}
		} else {
			System.out.println("Password can not be blank!");
		}
	}

	public String getUserName() {
		return userName;
	}

	// setter for username
	public void setUserName(String userName) {
		if (!userName.isEmpty() && userName.length() > 6) {
			this.userName = userName;
		} else {
			System.out.println("Username should be larger than 6!");
		}
	}
	
}
