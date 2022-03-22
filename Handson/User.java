package com.ob.training;

public class User {

	String name;
	long number;
	public User(String name,long number) {
		this.name=name;
		System.out.println("from us admin");
		this.number=number;
	}
	public User() {
		System.out.println("from use");
	}
	public void chat() {
		System.out.println(name+" is chatting "+number);
	}
	public void video() {
		System.out.println(name+" is video calling "+number);
	}
	public void share() {
		System.out.println(name+" is sharing "+number);
	}
}
