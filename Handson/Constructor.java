package com.ob.training;

public class Constructor {
	
	Constructor(){
		System.out.println("Hi am from constructor");
	}
	public static void main(String[] args) {
		Constructor con = new Constructor();
		Function.add(12,12);
		System.out.println(Function.add);
		
		Function a = new Function();
		a.add (13,12);
		System.out.println("The value of b is"+a.b);
		sysout
	}
}
