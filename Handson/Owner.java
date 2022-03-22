package com.ob.training;

public class Owner {
	public static void main(String[] args) {
		Car car = new Car();
		car.brake();
		car.drive();
		car.honk();
		
		System.out.println("---------");
		Jaguar jaguar = new Jaguar();
		jaguar.brake();
		
		System.out.println("----------");
		Audi audi = new Audi();
		audi.drive();
	}
}
