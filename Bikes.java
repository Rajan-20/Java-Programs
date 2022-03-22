package com.ob.assignments;

public class Bikes {
	int price;
	String brand;
 
	
	public Bikes(String brand2) {
		// TODO Auto-generated constructor stub
		this.brand = brand2;
		System.out.println("The bike is"+brand);
	}
	public Bikes(String brand2, int p) {
		// TODO Auto-generated constructor stub
		this.brand = brand2;
		this.price = p;
		System.out.println("The bike is"+brand+" and the price is "+price);
	}
	

	public void VechicleType(String brand2) {
		System.out.println("VechicleType :"+ brand2);
	}
	public void Passengers(int psg) {
		System.out.println("The number of passenger is applicable only "+psg);
	}
	
}
