package com.ob.exceptionhandling;

public class Test {
	public static void main(String[] args) {
		System.out.println("Program started");
		try {
		throw new ArithmeticException();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("program end");
	}
}
