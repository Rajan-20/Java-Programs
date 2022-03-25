package com.ob.exceptionhandling;

import java.util.Scanner;

public class Exception1 {
	public static void main(String[] args) {
		try {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int number1 = scan.nextInt();
		System.out.println("Enter the second number");
		int number2 = scan.nextInt();
		int res = 0;
		res = number1/number2;
		
		int[] a;
		a = new int[res];
		a[4] = 20;
		System.out.println(a[4]);
		System.out.println(res);
	}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The index of your accessing is not present");
	}catch (ArithmeticException e) {
		System.out.println("enter the denom > 0");
	}
		System.out.println("Program end");
}
	
}
