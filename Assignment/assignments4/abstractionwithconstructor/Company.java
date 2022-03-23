package com.ob.assignments4.abstractionwithconstructor;

public abstract class Company {
	Company(){
		System.out.println("This is constructor of abstract class");
	}
	abstract void a_method();
	void b_method() {
		System.out.println("This is a Normal method of abstract class");
	}
}
