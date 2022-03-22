package com.ob.assignments;

public class TernaryOperator {
	
	static void Ternary(int age){
		String warningMsg = age > 18 ? "You can take a license and drive" : "You cannot drive now";
		System.out.println(warningMsg);
	}
	
	public static void main(String[] args) {
		Ternary(19);
	}
}
