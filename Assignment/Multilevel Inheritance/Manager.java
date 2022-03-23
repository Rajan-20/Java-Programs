package com.ob.assignments;

public class Manager extends Employee {

//	public Manager() {
//		// TODO Auto-generated constructor stub
//	}
	public Manager(String name, int age, long number, String address, int salary,String department,String specialization) {
		// TODO Auto-generated constructor stub
		super(name,age,number,address,salary,department,specialization);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee employee1 = new Employee("Gokul",21,9442967761l,"karaikudi",25000,"sales","business");
		Manager manager = new Manager("Gokul",21,9442967761l,"karaikudi",25000,"sales","business");
		System.out.println(manager.name);
		System.out.println(manager.age);
		System.out.println(manager.number);
		System.out.println(manager.address);
		System.out.println(manager.salary);
		
		
		manager.printSalary();
		
		
	}

	

}
