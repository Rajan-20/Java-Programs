package com.ob.assignments;

public class Member  {
	String name;
	int age;
	long number;
	String address;
	int salary;
	
	public Member(String name,int age,long number,String address,int salary) {
		this.name=name;
		this.age=age;
		this.number=number;
		this.address=address;
		this.salary=salary;
		
	}
	
	
	public void printSalary() {
		System.out.println(name+" salary is "+salary);
	}
}
