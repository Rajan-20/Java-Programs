package com.ob.assignments;

public class OddEven {

	static void Odd(int i) {

		System.out.println("The odd numbers are");
		while (i < 20) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	static void Even(int i) {
		System.out.println("The even numbers are");
		while (i < 20) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	public static void main(String[] args) {
		Odd(1);
		Even(0);
	}
}
