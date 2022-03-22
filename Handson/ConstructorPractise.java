package com.ob.training;

public class ConstructorPractise {
	String name,district;
	int rollno;
	 ConstructorPractise(String name,int rollno,String district){
		System.out.println(name+" "+rollno+" "+district);
	}
	 ConstructorPractise(double rollno, String name){
		 System.out.println("This is the "+name+" and his rollno was"+rollno);
	 }
	
	public static void main(String[] args) {
//		ConstructorPractise myObj1 = new ConstructorPractise();	
		double result = Overloading.Multiply(4.3, 2.1);
		System.out.println(result);
		//Constructor Overloading
		ConstructorPractise Vignesh = new ConstructorPractise("Vignesh",1816152,"Pollachi");
		System.out.println(Vignesh.name);
		ConstructorPractise Gokul = new ConstructorPractise(1816117,"Gokul");
		OddEven.
		
	}

}
