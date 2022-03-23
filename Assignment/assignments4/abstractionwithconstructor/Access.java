package com.ob.assignments4.abstractionwithconstructor;

public class Access {
	public static void main(String[] args) {
		Employee em = new Employee();//calling the constructor
		em.a_method();//overriding the abstract method and print 
		em.b_method();
	}
}
