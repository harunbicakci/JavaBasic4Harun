package com.neotech.lesson26;

//	Create Registration Class in which you would have variables
//	as email, userName and password that have an access scope
//	only within its own class. After creating an object of the class
//	user should be able to call methods and in each method
//	separately pass values to set users email, username and
//	password.

//	Requirements:
//	Valid email consider to be only yahoo!
//	Valid userName and password cannot be empty and should
//	be of length larger than 6 characters.
//	Also valid password cannot contain userName.

public class Registration {

	String email, userName, password;
	
	// EMAIL SET
	public void setEmail(String email) {
		if(!email.isEmpty()) {
			if(email.contains("@yahoo.com")){
			this.email = email;
			System.out.println("Email --> " + email);
			}else {
			System.out.println("Email must be \"@yahoo.com\"");
			}
		}else {
			System.out.println("Email cant be emtpy");
		}
	}
		
	// EMAIL GET
	public String getEmail() {
		return email;
	}
	
	// USERNAME SET
	public void setUserName(String userName) {
		if(!userName.isEmpty()) {
			if(userName.length() > 6) {
				this.userName = userName;
				System.out.println("Username --> " + userName);
			}else {
				System.out.println("Username must contain min 6 characters.");
			}
		}else {
			System.out.println("Username cant be empty!");
		}
	}
	
	// USERNAME GET
	public String getUserName() {
		return userName;
	}
	
	// PASSWORD SET
	public void setPassword(String password) {
		if (!password.isEmpty()) {
			if(password.length() > 6) {
				if(!password.contains(userName)) {
					this.password = password;
					System.out.println("Password --> " + password);
				}else {
					System.out.println("Password cant contain username.");
				}
			}else {
				System.out.println("Password must contain min 6 characters.");
			}
			
		}else {
			System.out.println("Password cant be empty!");
		}
	}
	
	// PASSWORD GET
	public String getPassword() {
		return password;
	}
}
