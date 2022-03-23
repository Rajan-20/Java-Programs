package com.ob.abstractmethod.interfaceexamples;

public class Student {
	public static void main(String[] args) {
		Calculator cal = new Casio();
		System.out.println(cal.add(10, 20));
		System.out.println(cal.sub(20, 10));
		System.out.println(cal.multiply(10, 5));
		System.out.println(cal.division(8, 2));
		
	}
}
