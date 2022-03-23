package com.ob.assignments4.abstraction;

public class BankC extends Bank {
	int deposit;
	@Override
	void getBalance(int deposit) {
		System.out.println("The balance is "+deposit+" from Bank C");
	}
}
