package com.ob.assignments4.abstraction;

public class BankAccess {
	public static void main(String[] args) {
		BankA A = new BankA();
		A.getBalance(100);
		BankB B = new BankB();
		B.getBalance(150);
		BankC C = new BankC();
		C.getBalance(200);
	}
}
