package com.ob.training;

public class Admin extends User {
	public Admin(String name,long number) {
		super(name,number);
		System.out.println("from us make an admin");
	}
	public void addUser() {
		System.out.println(name+" is added to the group "+number);
	}
	public void removeUser() {
		System.out.println(name+" user is removed "+number);
	}
}
