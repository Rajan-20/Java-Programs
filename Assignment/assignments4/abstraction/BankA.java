package com.ob.assignments4.abstraction;

public class BankA extends Bank {
	 
	
	@Override
	void getBalance(int deposit) {
		System.out.println("The balance is "+deposit+" from Bank A");
	}
}
