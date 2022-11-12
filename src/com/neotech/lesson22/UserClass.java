package com.neotech.lesson22;

public class UserClass {
//	Homework 4:
//	    Write program: UserClass that has a constructor that
//	    initializes instance variable name and mobile number.
//	    Create a subclass UserInfo that will have user address
//	    variable and it also being initialized through constructor
//	    call. Print users name, mobile number and address in
//	    userDetails method. Test your code.
	
	String name;
	long mobileNo;
	
	UserClass(String name, long mobileNo){
		this.name = name;
		this.mobileNo = mobileNo;
	}
	
}

class UserInfo extends UserClass{
	
	String userAddress;	
	
	UserInfo(String name, long mobileNo, String userAddress){
		super(name, mobileNo);
		this.userAddress = userAddress;
	}
	
	void userDetails() {
		System.out.println("Name: " + name);
		System.out.println("Mobile phone: " + mobileNo);
		System.out.println("Address: " + userAddress);
	}
}
