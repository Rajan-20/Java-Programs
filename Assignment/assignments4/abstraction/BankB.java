package com.ob.assignments4.abstraction;

public class BankB extends Bank {
	
	
	@Override
	void getBalance(int deposit) {
		System.out.println("The balance is "+deposit+" from Bank B");
	}
}
