package com.ob.assignments;

public class Employee extends Member {
	String department;
	String specialization;
//	public Employee() {
//		// TODO Auto-generated constructor stub
//	}
	public Employee(String name, int age, long number, String address, int salary,String department,String specialization) {
		// TODO Auto-generated constructor stub
		super(name,age,number,address,salary);
		this.department=department;
		this.specialization=specialization;
	}
}
